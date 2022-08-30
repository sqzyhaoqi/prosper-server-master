package com.prosper.client;

import com.prosper.common.util.DateUtils;
import com.prosper.msg.RuleMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.Date;

@Component
public class MsgClientScheduled {
    @Autowired
    private RuleMsgService ruleMsgService;

    @Scheduled(cron = "${app.task.pushMsgTaskCron}")
    public void taskScheduled() {
        this.handlerMsg();
    }

    private void handlerMsg() {
        Date timeDate = DateUtils.getCurrentTimeStamp();
        //非工作日时间则RETURN
        if (this.isWorkTime(timeDate)) return;
        this.ruleMsgService.push(timeDate);
    }

    /**
     * 凌晨1-8点为非工作日时间
     * @param timeDate
     * @return
     */
    private boolean isWorkTime(Date timeDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timeDate);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int minutes = hour * 60 + minute;
        int beginTime = 1 * 60;
        int endTime = 7 * 60;
        return minutes >= beginTime && minutes <= endTime;
    }
}

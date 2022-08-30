package com.prosper.msg;

import java.util.Date;

/**
 * 报文规则类
 */
public interface RuleMsgService {

    boolean push(Date timeDate);
    /**
     *
     * @param sDate
     * @param eDate
     */
    boolean pushMsg(String sDate, String eDate);
}

package com.prosper.common;

import com.alibaba.druid.util.StringUtils;
import com.prosper.common.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestTimeRedis {

    @Autowired
    private RedisUtils redisUtils;

    private String key = "hpd:etl:ws";

    public void saveOrUpdate(String wsTime) {
        if (StringUtils.isEmpty(wsTime)) {
            return;
        }
        redisUtils.set(key, wsTime);
    }

    public void delete() {
        redisUtils.delete(key);
    }

    public String get() {
        return redisUtils.get(key, String.class);
    }
}

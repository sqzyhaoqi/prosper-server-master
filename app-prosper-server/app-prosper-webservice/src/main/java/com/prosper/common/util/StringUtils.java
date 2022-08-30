package com.prosper.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtils {

    public static String covertObj2Str(Object obj) {
        String value = null;
        if (obj == null) return value;
        if (obj instanceof java.lang.Long) {
            value = String.valueOf(obj);
        } else if (obj instanceof java.lang.String) {
            value = (String) obj;
        } else if(obj instanceof java.util.Date){
            Date date = (Date)obj;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            value = sdf.format(date);
        }
        return value;
    }

}

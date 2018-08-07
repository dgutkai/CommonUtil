package com.real0168.androidutils.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 处理时间的工具类，包括获取格式化的时间，时间计算等
 * Created by real0168.com on 2018/7/27.
 */

public class TimeUtils {

    /**
     * 获取当前时间字符串。
     * @return 返回时间字符串格式yyyy-MM-dd HH:mm:ss
     */
    public static String getCurrentTime() {

        return getCurrentTime("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 根据给定格式返回当前时间字符串。
     * @param formatString
     * @return
     */
    public static String getCurrentTime(String formatString) {
        SimpleDateFormat format = new SimpleDateFormat(formatString,
                Locale.getDefault());
        return format.format(new Date());
    }

    /**
     * 将毫秒格式转化为yyyy-MM-dd HH:mm:ss
     *
     * @param milliSeconds 毫秒
     * @return 格式化后的字符串结果
     */
    public static String formatToDataTime(long milliSeconds) {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        return sd.format(milliSeconds);
    }

    /**
     * 将日期字符串转换为日期对象
     * @param dateString
     * @param formatString
     * @return
     */
    public static Date dateFromString(String dateString, String formatString){
        SimpleDateFormat sd = new SimpleDateFormat(formatString, Locale.getDefault());
        try {
            return sd.parse(dateString);
        } catch (ParseException e) {
            return null;
        }
    }
}

package com.real168.commonutillib.convert;

/**
 * Created by lanmi on 2018/7/10.
 */

public class StringUtils {

    /**
     * 获取byte数组的十六进制字符串
     * @param bytes
     * @return
     */
    public static String getHexStringFromByteArray(byte[] bytes){
        StringBuilder sb = new StringBuilder();

        if (bytes != null && bytes.length > 0) {
            for (byte aByte : bytes) {
                sb.append(String.format("%02X", aByte));
            }
        }

        return sb.toString();
    }

//    /**
//     * 获取数组的格式化字符串
//     * @param format
//     * @param objects
//     * @return
//     */
//    public static String getFormatStringFromArray(String format, Object[] objects){
//        StringBuilder sb = new StringBuilder();
//
//        if (objects != null && objects.length > 0) {
//            for (Object aObj : objects) {
//                if (aObj != null) {
//                    sb.append(String.format(format, aObj));
//                }
//            }
//        }
//
//        return sb.toString();
//    }
}

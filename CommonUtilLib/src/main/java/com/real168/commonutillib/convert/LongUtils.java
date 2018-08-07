package com.real168.commonutillib.convert;

/**
 * Created by lanmi on 2018/7/10.
 */

public class LongUtils {

    /**
     * 从byte数组获取long。
     * @param bytes
     * @param start
     * @param count
     * @return
     */
    public static long getLongFromBytes(byte[] bytes, int start, int count){

        if (count < 1){
            count = 1;
        }else if (count > 4){
            count = 4;
        }
        if (bytes == null || start > bytes.length - count){
            return 0;
        }
        long result = 0;
        for (int i = 0; i < count; i++){
            result = (result << 8) + bytes[start+i];
        }
        return result;
    }
}

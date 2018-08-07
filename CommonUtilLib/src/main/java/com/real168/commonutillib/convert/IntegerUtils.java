package com.real168.commonutillib.convert;

/**
 * Created by lin on 2018/7/9.
 * Integer 工具类，从各种类型的数据中获取Integer
 */

public class IntegerUtils {


    /**
     * 从byte数组获取Int。
     * @param bytes
     * @param start
     * @param count
     * @return
     */
    public static int getIntFromBytes(byte[] bytes, int start, int count){

        if (count < 1){
            count = 1;
        }else if (count > 4){
            count = 4;
        }
        if (bytes == null || start > bytes.length - count){
            return 0;
        }
        int result = 0;
        for (int i = 0; i < count; i++){
            result = (result << 8) + bytes[start+i];
        }
        return result;
    }

}

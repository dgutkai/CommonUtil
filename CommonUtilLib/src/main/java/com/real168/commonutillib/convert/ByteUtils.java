package com.real168.commonutillib.convert;

/**
 * Created by lanmi on 2018/7/9.
 */

public class ByteUtils {

    public static byte[] getByteArrayFromInt(int value, int size){
        byte[] results = new byte[size];
        for (int i = size-1; i >= 0; i--){
            results[i] = (byte) (value & 0xff);
            value = value >> 8;
        }
        return results;
    }

    public static byte[] getByteArrayFromLong(long value, int size){
        byte[] results = new byte[size];
        for (int i = size-1; i >= 0; i--){
            results[i] = (byte) (value & 0xff);
            value = value >> 8;
        }
        return results;
    }
}

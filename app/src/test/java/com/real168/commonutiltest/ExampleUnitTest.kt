package com.real168.commonutiltest

import com.real168.commonutillib.ByteUtils
import com.real168.commonutillib.IntegerUtils
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun getUnsignedIntFromBytes_test() {
        val value = IntegerUtils.getIntFromBytes(byteArrayOf(1.toByte(), 2.toByte(), 3.toByte(), 4.toByte()), 0, 2)
        assertEquals(0x0102, value)
        val value2 = IntegerUtils.getIntFromBytes(byteArrayOf(1.toByte(), 2.toByte(), 3.toByte(), 4.toByte()), 1, 2)
        assertEquals(0x0203, value2)
        val value3 = IntegerUtils.getIntFromBytes(byteArrayOf(1.toByte(), 2.toByte(), 3.toByte(), 4.toByte()), 0, 4)
        assertEquals(0x01020304, value3)
    }


    @Test
    fun getByteArrayFromInt_test(){
        val value = ByteUtils.getByteArrayFromInt(0xf343, 2)
        assertArrayEquals(byteArrayOf(0xf3.toByte(), 0x43.toByte()), value)
    }
}

package com.real168.commonutiltest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.real168.commonutillib.convert.IntegerUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value = IntegerUtils.getIntFromBytes(byteArrayOf(1.toByte(), 2.toByte(), 3.toByte(), 4.toByte()), 0, 2)
        println(value)
        val value2 = IntegerUtils.getIntFromBytes(byteArrayOf(1.toByte(), 2.toByte(), 3.toByte(), 4.toByte()), 1, 2)
        println(value2)
        val value3 = IntegerUtils.getIntFromBytes(byteArrayOf(1.toByte(), 2.toByte(), 3.toByte(), 4.toByte()), 0, 4)
        println(value3)
    }
}

# CommonUtil
积累的部分通用的工具类，包括字符串，数组以及各种数据类型的相互转换。
## String
- getHexStringFromByteArray: 获取Byte数组的十六进制表示的字符串。
~~~kotlin
    var bytes = byteArrayOf(0x01.toByte(), 0x02.toByte(), 0x03.toByte(), 0x04.toByte())
    println(StringUtils.getHexStringFromByteArray(bytes))
~~~
以上代码将输出：**01020304**

## Integer

- getIntFromBytes: 从byte数组中获取指定位置的Int数据。
~~~kotlin
    val value = IntegerUtils.getIntFromBytes(byteArrayOf(1.toByte(), 2.toByte(), 3.toByte(), 4.toByte()), 0, 2)
    println(value)
    val value2 = IntegerUtils.getIntFromBytes(byteArrayOf(1.toByte(), 2.toByte(), 3.toByte(), 4.toByte()), 1, 2)
    println(value2)
    val value3 = IntegerUtils.getIntFromBytes(byteArrayOf(1.toByte(), 2.toByte(), 3.toByte(), 4.toByte()), 0, 4)
    println(value3)
~~~
以上代码输出：</br>****
## Long





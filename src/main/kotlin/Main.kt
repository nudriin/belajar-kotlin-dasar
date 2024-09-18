package com.nudriin


fun main() {
    // VAR digunakan seperti let pada js, var datanya bisa diubah
    var name: String = "Nurdin"
    name = "Hishasy"

    // VAL seperti const di js, nilainya tidak dapat diubah
    val age: Int = 20
    //    age = 21 // AKAN ERROR

    // bisa menggunakan seperti string template seperti dibawah ini
    println("My name is $name and my age is $age years old")

    // bisa juga seperti ini
    println(name + " "+ age)

    // bisa juga langsung menuliskan variabel seperti dibawah ini tanpa menuliskan tipe data
    val a = 20
    val b: Int = 30

    println(a + b)

    // ch_2_char
    char()

    // ch_3_string
    ch3String()

    // ch_4_string_template
    ch4StringTemplate()

    // ch_5_if_expression
    ch5IfExpression()

    // ch_6_numbers
    ch6Numbers()

    // ch_7_array
    ch7Array()

    // ch_8_nullable
    ch8Nullable()

    // ch_9_Safe_Call_And_Elvis_Operator
    ch9SafeCallAndElvisOperator()

    // ch_10_function
    ch10Function()

    // ch11_named_and_default_argument
    ch11NamedAndDefaultArgument()
}

// ch_2_Char
fun char(){
    // hanya dapat menyimpan 1 huruf tunggal saja
    var char: Char = 'A'

//    AKAN ERROR
//    var char2: Char = 'ABC'

    // bisa di increment dan akan bertambah ke a-b-c-d-e-
    println("CHAR : "+ char++)
    println("CHAR : "+ char++)
    println("CHAR : "+ char++)
    println("CHAR : "+ char++)
    println("CHAR : "+ char--)
    println("CHAR : "+ char--)

}

fun ch3String(){
    val text = "NURDIN"
    val d = text[3] // mengambil karakter D

    println(text)
    println(d)

    // bisa juga kita looping seperti id bawah ini
    for(char in text) {
        print("-$char-")
    }
    println()

    // escape string
    // var text2 = "Hallo nama saya "Nurdin"" // akan error
    val text2 = "Halo nama saya \"Nurdin\"" // membuat tanda petik dengan escaped
    println(text2)

    val unicode = "Unicode test: \u00A9"
    println(unicode)

    // RAW STRING
    // membuat raw string
    val rawString = """
        NAMA
        SAYA
        NURDIN
        HISHASY
    """.trimIndent()

    println(rawString)
}

fun ch4StringTemplate() {
    val age = 20
    // bisa juga melakukan expression di  dalam string template
    println("Your age ${if (age > 20) "is $age not eligble to this" else "is $age, you eligible" }")
}

fun ch5IfExpression() {
    val openHour = 7
    val now = 12
    var office: String
    if(now > openHour) {
        office = "Open now"
    } else {
        office = "closed"
    }

    println(office)
    println()

    // bisa juga seperti ini
    office = if(now > openHour) {
        "Office is open"
    } else {
        "Office is closed"
    }
    println(office)
    println()


}

fun ch6Numbers() {
    val intNumber = 100
    val longNumber: Long = 100
    val longNumber2 = 100L // Long number dengan suffix L
    val shortNumber: Short = 10
    val byteNumber = 0b11010010 // Angka bit
    val doubleNumber: Double = 1.3 // maksimal 15-16 angka di belakang koma.
    val floatNumber: Float = 0.123456789f    // sampai 6-7 angka di belakang koma.

    println(intNumber)
    println(longNumber)
    println(longNumber2)
    println(shortNumber)
    println(byteNumber)
    println(doubleNumber)
    println(floatNumber) // yang terbaca hanya 0.1234567

    // Cek nilai maksimal dan minimal dari int
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    val stringNumber: String ="20"
    val toIntString: Int = stringNumber.toInt()  // casting tipe data

    println(20 + toIntString)

//    toByte(): Byte
//    toShort(): Short
//    toInt(): Int
//    toLong(): Long
//    toFloat(): Float
//    toDouble(): Double
//    toChar(): Char
    val readableNumber = 1_000_000
    print(readableNumber)


}

fun ch7Array() {
//    Membuat Array
//    Bisa menggunakan arrayOf dan arraynya bersifat dinamis
    val arr = arrayOf(1,2,3, "Nurdin", true)

    for(value in arr) {
        println("value: $value")
    }
//    Membuat array deng tipedata primitf
//    intArrayOf() : IntArray
//    booleanArrayOf() : BooleanArray
//    charArrayOf() : CharArray
//    longArrayOf() : LongArray
//    shortArrayOf() : ShortArray
//    byteArrayOf() : ByteArray
    val arrNumber: IntArray = intArrayOf(1,2,3,4) // hanya menerima data berupa number
    for(value in arrNumber) {
        println("value: $value")
    }



}

fun ch8Nullable() {
    val name: String? = null; // boleh
//    val name2: String = null; // akan error

    var obj: Any = "Nurdin"

//    is digunakan untuk cek tipe data sebuah object
    if(obj is String){
        println("String lenght ${obj.length}")
    }


}

fun ch9SafeCallAndElvisOperator() {
    val name: String? = null
    println(name?.length) // safe call

//    Kalau tidak null maka textLenght = name.length,
//    Kalau null maka textLength = 7
    val textLenght = name?.length ?: 7 // if (text != null) text.length else 7
    println(textLenght)
}

fun ch10Function() {
    fun setUser(name: String, age: Int): String {
        return "Your name is $name, and you $age years old"
    }

    var user = setUser("Nurdin", 20)
    println(user)

//    Bisa juga gini jika hanya return 1 value
    fun setUser2(name: String, age: Int) = "Your name is $name, and you $age years old"
    user = setUser2("Hishasy", 20)
    println(user)

//    Void function
//    Unit adalah void
    fun sayHello(name: String): Unit {
        println("Hello $name my name is Nurdin")
    }

    sayHello("Sunny")

//    Void juga
    fun sayHi(name: String) {
        println("Hi $name my name is Nurdin")
    }

    sayHi("Hishasy")

}

fun ch11NamedAndDefaultArgument() {
    fun getFullName(first: String, middle: String, last: String): String {
        return "$first $middle $last"
    }

//    Menggunakan named argument
    var fullName = getFullName(first = "Nurdin", middle = "Hishasy", last = "Sunny")
    println(fullName)

//    Bisa diubah untuk urutannya
    fullName = getFullName(middle = "Hishasy" , first = "Nurdin", last = "Sunny")
    println(fullName)


//    Bisa memberikan default value
    fun getFullNameWithDefault(
        first: String = "Mr.",
        middle: String = "Don't",
        last: String = "Know"): String {
        return "$first $middle $last"
    }

//    Bisa begini, karena sudah memiliki default value
    fullName = getFullNameWithDefault()
    println(fullName)

    fullName = getFullNameWithDefault(middle = "Nurdin")
    println(fullName)

}

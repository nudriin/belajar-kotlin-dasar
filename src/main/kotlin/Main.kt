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

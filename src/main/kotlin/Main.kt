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

    char()
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
package com.example.kotlinclass
/*
var->mutable
val->immutable
const->value assigned at compile time
 */
const val ph=123456789
fun main(args:Array<String>)
{
    println("hi")
    toCheckValVarConst()
    toCheckNullable()
    safeCallWithLet()
    elvisOperator()
    //notNullAssertionOperator()
    safeCast()
    nullableCollection()
}
fun toCheckValVarConst()
{
    var name="Gireesh"
    val age=21
    println(name+"  "+ age+"   "+ ph)

}
fun toCheckNullable()
{
    var s:String?=null
    println("$s")
    println(s?.length)
}

fun safeCallWithLet() {
    var a: String?
    a = "Gireesh"
    a?.let {
        println("Length = ${it.length}. This is printing because a is not null")
        println("This is another statement if name is not null")
    }
    a = null
    println(a)
    a?.let {
        println("This will not be printed")
    }
    val myList = listOf("Gireesh", null)
    for (i in myList) {
        i?.let {
            // if not null
            print(i.length)
        }
    }
}

fun elvisOperator() {
    val name: String? = null

//    if (name != null)
//        print(name.length)
//    else
//        print("this is else value")

    println(name?.length ?: "this is else value")

//    safeCall + Let + elvisOperator
    name?.let {
        print("this means name is not null ${name.length}")
    } ?: print("this means name is null")
}
fun notNullAssertionOperator() {
    var name: String? = null
    name = "Gireesh"
    println(name!!.length)
    name = if (name != null) null else "Hegde" // to make the name null
    println(name!!.length) // will throw NPE
}
fun safeCast() {
    val name: String? = "Gireesh"
//    val number: Int? = name as Int// class cast exception
    val number: Int? = name as? Int // can not cast string->int
    println(number)
}
fun nullableCollection() {
    // filtering the null values using filterNotNull
    val nullableList = listOf("hello", null, "world!").filterNotNull()
//    for (i in nullableList)
//        println(i?.length)
    for (i in nullableList)
        println("length of i = ${i.length}")
}



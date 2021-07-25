package com.example.myapplicationfork
interface Test
{
    fun testing(name:String,sem:Int=8)
    fun print()
    {
        println("im printing here")
    }

}
class Student:Test
{
    var name:String=""
    var sem:Int=0
    get()=field
    set(value)
    {
        field=value
    }

    override fun testing(name:String,sem:Int){
        println(name+"  "+sem)
    }
}
fun main()
{
    val c=Student()
    c.name="Gireesh"
    c.sem=8
    c.testing("Gireesh",7)
    println(c.name+"   "+c.sem)
    c.print()
}

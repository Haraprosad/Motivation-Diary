package org.lingj.motivationdiary

data class Motivation(var motiv:String)
object supplier{
    val motivations = listOf<Motivation>(
        Motivation("Some people feels the rain,others just get wet."),
        Motivation("A single step can do a lot."),
        Motivation("Try to be better version of yourself"),
        Motivation("Success won't come ,you have to go towards success")

    )
}
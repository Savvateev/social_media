package ru.netolohy

fun main() {

    fun agoToText(time : Int) : String {
        return when (time) {
            in 0..60 -> "был(а) только что"
            in 61..3600 -> "был(а) ${time/60} минут назад"
            in 3601..86400 -> "был(а) ${time/3600} часов назад"
            in 86401..86400*2 -> "был(а) вчера"
            in (86400*2) +1..86400*3 -> "был(а) позавчера"
            else -> "был(а) давно"
        }
    }
    println(agoToText(30))
    println(agoToText(80))
    println(agoToText(10000))
    println(agoToText(200000))
    println(agoToText(300000))
}




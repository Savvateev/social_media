package ru.netolohy

fun main() {

    fun minRules(time : Int) : String {
        return when ((time/60).toInt()) {
                           1, 21, 31, 41, 51 -> "минуту назад"
            2, 22, 32, 42, 52, 3, 23, 33, 43, 53, 4, 24, 34, 44, 54 -> "минуты назад"
            else -> "минут назад"
        }
    }

    fun hoursRules(time : Int) : String {
        return when (time) {
            1, 21 -> "час назад"
            2, 3, 4, 22, 23, 24 -> "часа назад"
            else -> "часов назад"
        }
    }

    fun agoToText(time : Int) : String {
        return when (time) {
            in 0..60 -> "был(а) только что"
            in 61..3600 -> "был(а) ${time/60} ${minRules(time)}"
            in 3601..86400 -> "был(а) ${time/3600} ${hoursRules(time/3600)}"
            in 86401..86400*2 -> "был(а) вчера"
            in (86400*2) +1..86400*3 -> "был(а) позавчера"
            else -> "был(а) давно"
        }
    }
    println(agoToText(30))
    println(agoToText(3000))
    println(agoToText(10000))
    println(agoToText(100000))
    println(agoToText(200000))
    println(agoToText(300000))
}




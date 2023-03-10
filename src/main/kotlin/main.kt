fun main () {
    println(agoToText(10800))
    }

fun agoToText (second : Int) : String {
    return when {
        second < 60 -> "только что"
        second < 60 * 60 -> "${second/60} ${minutes(second/60)} назад"
        second < 24*60*60 -> "${second/3600} ${hour(second/3600)} назад"
        second < 2*24*60*60 -> "вчера"
        second < 3*24*60*60 -> "позавчера"
        else -> "давно"
    }
}

fun hour (hour : Int) : String {
    return when{
        hour == 1 -> "час"
        hour == 2 -> "часа"
        hour == 3 -> "часа"
        hour == 4 -> "часа"
        hour == 21 -> "час"
        hour == 22 -> "часа"
        hour == 23 -> "часа"
        else -> "часов"
    }
}

fun minutes (minutes : Int) :String {
    return when{
        minutes == 1 -> "минуту"
        minutes == 2 -> "минуты"
        minutes == 5 -> "минут"
        minutes == 11 -> "минут"
        minutes == 21 -> "минуту"
        minutes == 25 -> "минут"
        else -> "минуты"
    }
}
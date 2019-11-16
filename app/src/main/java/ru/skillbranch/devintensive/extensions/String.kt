package ru.skillbranch.devintensive.extensions

fun String.stripHtml(): String{

    var newString = this
//    newString = newString.replace(Regex("<[\\w/]\\w+?>"), "")
    newString = newString.replace(Regex("<.*?>"), "")
    newString = newString.replace(Regex("&.*?;"), "")
    newString = newString.replace(Regex("\\s+"), " ")


    return newString
}
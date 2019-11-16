package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?>{

        val parts: List<String>? = fullName?.split(" ")
        var firstName = parts?.getOrNull(0)
        var lastName = parts?.getOrNull(1)
        if (firstName.isNullOrBlank()) firstName = null
        if (lastName.isNullOrBlank()) lastName = null
        return firstName to lastName
    }

    fun transliteration(payload: String, divider:String = " "): String {
        TODO("not implemented")
    }

    fun toInitials(firstName: String?, lastName: String?): String? {

        val firstChar = firstName?.trim()?.firstOrNull() ?: ""
        val secondChar = lastName?.trim()?.firstOrNull() ?: ""
        val initials = "${firstChar.toString().toUpperCase()}${secondChar.toString().toUpperCase()}"
        return if(initials.equals("")) null else initials
    }
}
package org.example.app.solutions.hashMap.easy

/*
* Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.



Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false*/
// مفهوم ایزومورفیسم در اینجا به این معنی است که می‌توان کاراکترهای یک رشته (مثلاً (s)
// را به صورت یک به یک با کاراکترهای رشته دیگر (مثلاً t) جایگزین کرد،
// به طوری که ترتیب و ساختار رشته اولیه حفظ شود.


class IsomorphicStrings {
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val hashMapS = mutableMapOf<Char, Char>()
        val hashMapT = mutableMapOf<Char, Char>()
        for (i in s.indices) {
            val charS = s[i]
            val charT = t[i]
            if (hashMapS.containsKey(charS)) {
                if (hashMapS[charS] != charT) return false
            } else {
                hashMapS[charS] = charT
            }
            if (hashMapT.containsKey(charT)) {
                if (hashMapT[charT] != charS) return false
            } else {
                hashMapT[charT] = charS

            }
        }
        return true
    }

}
























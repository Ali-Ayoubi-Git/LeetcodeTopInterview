package org.example.app.solutions.hashMap.easy

/*
* Given two strings s and t, return true if t is an
anagram
 of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
* */
class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val hashMapS = mutableMapOf<Char, Int>()
        val hashMapT = mutableMapOf<Char, Int>()

        for (i in s.indices) {
            val charS = s[i]
            val charT = t[i]
            if (hashMapS.containsKey(charS)) {
                hashMapS[charS] = hashMapS[charS]!! + 1
            } else {
                hashMapS[charS] = hashMapS[charS] ?: (1)
            }
            if (hashMapT.containsKey(t[i])) {
                hashMapT[charT] = hashMapT[charT]!! + 1
            } else {
                hashMapT[charT] = hashMapT[charT] ?: (1)
            }
        }

        return hashMapS==hashMapT
    }
}
















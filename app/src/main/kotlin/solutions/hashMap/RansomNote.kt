package org.example.app.solutions.hashMap

/*
* Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true*/
class RansomNote {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val hashMapR = mutableMapOf<Char, Int>()
        val hashMapM = mutableMapOf<Char, Int>()
        if (ransomNote.length > magazine.length) return false
        for (i in ransomNote.indices) {
            val charR = ransomNote[i]
            if (hashMapR.containsKey(charR)) {
                hashMapR[charR] = hashMapR[charR]!! + 1
            } else {
                hashMapR[charR] = 1
            }
        }
        for (i in magazine.indices) {
            val charM = magazine[i]
            if (hashMapM.containsKey(charM)) {
                hashMapM[charM] = hashMapM[charM]!! + 1
            } else {
                hashMapM[charM] = 1
            }
        }
        for ((key, value) in hashMapR) {
            if (!hashMapM.containsKey(key) || hashMapM[key]!! < value) return false
        }

        return true
    }
}













package org.example.app.solutions.hashMap

/*
* Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.


Example 1:

Input: pattern = "abba", s = "dog cat cat dog"

Output: true

Explanation:

The bijection can be established as:

'a' maps to "dog".
'b' maps to "cat".
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"

Output: false

Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"

Output: false*/
class WordPattern {
    fun wordPattern(pattern: String, s: String): Boolean {
         val hashWord = mutableMapOf<String, Char>()
        val hashS = mutableMapOf<Char, String>()
        val sNew = s.split(" ")
        if (sNew.size != pattern.length) return false
        for (i in pattern.indices) {
            val char = pattern[i]
            val word = sNew[i]
            if (hashS.containsKey(char)) {
                if (hashS[char] != word) return false
            }else{
                hashS[char] = word
            }
            if (hashWord.containsKey(word)) {
                if (hashWord[word] != char) return false
            }else{
                hashWord[word] = char
            }
        }

        return true
    }
}



























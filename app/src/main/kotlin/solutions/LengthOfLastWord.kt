package org.example.app.solutions

/*
* Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.*/
class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        var index = s.length-1
        var count = 0
        val char = ' '
        while (index >= 0) {
            if (s[index] != char) {
                index--
                count++
            } else if (count == 0 && s[index] == ' ') {
                index--
            } else {
                return count
            }
        }

        return count
    }
}

/*
* خب ما لیست رو از ته به سر میایم و هر چیزی جز اسپیس بود میشماریم اما اگر آخر لیست اسپیس بود و ما هنوز چیزی نشماردیم رد میکنیم */
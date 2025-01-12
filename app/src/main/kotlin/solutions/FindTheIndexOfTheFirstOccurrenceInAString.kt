package org.example.app.solutions

/*
* Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
class FindTheIndexOfTheFirstOccurrenceInAString {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.length > haystack.length) return -1
        for( i in 0..(haystack.length - needle.length)) {
            var found = true
            for (j in needle.indices) {
                if (haystack[i + j] != needle[j]) {
                    found = false
                    break
                }
            }
            if (found) return i
        }
        return -1
    }
}
/*https://www.youtube.com/watch?v=Oe7LniEH29c&list=PL-tKrPVkKKE3bDZsbOONda5_U3qMYAnRA&index=2*/




















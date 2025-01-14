package org.example.app.solutions.twoPointers.easy

/*
* Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false*/
class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) return true
        if(s.length>t.length)return false
        var tPointer = 0
        var sPointer = 0
        while (tPointer < t.length && sPointer < s.length) {
            if (t[tPointer] == s[sPointer]) {
                sPointer++
            }
            tPointer++

        }
        // اگر اشاره گر s به انتهای رشته s رسیده باشد، یعنی تمام کاراکترهای s در t پیدا شده‌اند
        return sPointer==s.length

    }
}





















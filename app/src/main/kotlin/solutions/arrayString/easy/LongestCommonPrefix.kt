package org.example.app.solutions.arrayString.easy

/*
* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var prefix = ""

        for (i in 0 until strs[0].length) {
            var lookingFor = strs[0][i]
            for (str in strs) {
                if (i >= str.length || str[i] != lookingFor)
                    return prefix
            }
            prefix += lookingFor
        }
        return prefix
    }
}




























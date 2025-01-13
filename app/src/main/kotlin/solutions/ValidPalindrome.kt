package org.example.app.solutions

/*
* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.*/
class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var startPointer = 0 // Initialize start pointer to the beginning of the string
        var endPointer = s.length - 1 // Initialize end pointer to the end of the string

        while (endPointer > startPointer) {
            // Continue as long as the end pointer is greater than the start pointer
            // Move the start pointer forward until it points to an alphanumeric character or meets the end pointer
            while (!s[startPointer].isLetterOrDigit() && startPointer < endPointer) {
                startPointer++
            }

            // Move the end pointer backward until it points to an alphanumeric character or meets the start pointer
            while (!s[endPointer].isLetterOrDigit() && startPointer < endPointer) {
                endPointer--
            }

            // Compare the lowercase versions of the characters at the start and end pointers
            if (s[startPointer].lowercaseChar() != s[endPointer].lowercaseChar()) {
                return false // Characters don't match, so it's not a palindrome
            }

            // Move pointers towards the center
            startPointer++
            endPointer--
        }

        return true // If the loop completes without returning false, it's a palindrome
    }
}



















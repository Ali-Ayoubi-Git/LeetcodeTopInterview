package org.example.app.solutions

/*
*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
* You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2 */
class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        val  total=nums.size/2

        for (i in nums) {
            val count = map.getOrDefault(i, 0)+1
            map[i] = count
            if (count>total)
                return i

        }

        return 0
    }


}



















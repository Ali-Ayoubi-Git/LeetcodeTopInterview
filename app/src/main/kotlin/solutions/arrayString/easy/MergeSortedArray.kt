package org.example.app.solutions.arrayString.easy
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing
//order, and two integers m and n, representing the number of elements in nums1 and
//nums2 respectively.
//
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
// The final sorted array should not be returned by the function, but instead
//be stored inside the array nums1. To accommodate this, nums1 has a length of m +
//n, where the first m elements denote the elements that should be merged, and the
//last n elements are set to 0 and should be ignored. nums2 has a length of n.
//
//
// Example 1:
//
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming
//from nums1.
//
//
// Example 2:
//
//
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].
//
//
// Example 3:
//
//
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. The 0 is only there
//to ensure the merge result can fit in nums1.
//
//
//
// Constraints:
//
//
// nums1.length == m + n
// nums2.length == n
// 0 <= m, n <= 200
// 1 <= m + n <= 200
// -10⁹ <= nums1[i], nums2[j] <= 10⁹
//
//
//
// Follow up: Can you come up with an algorithm that runs in O(m + n) time?
//
// Related Topics Array Two Pointers Sorting 👍 16067 👎 2165


//leetcode submit region begin(Prohibit modification and deletion)
class MergeSortedArray{
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var authorPointer = (m + n) - 1
        var readerPointerN1 = m - 1
        var readerPointerN2 = n - 1

        while (authorPointer >= 0) {
            if (readerPointerN1 < 0) {
                nums1[authorPointer--] = nums2[readerPointerN2--]
            } else if (readerPointerN2 < 0) {
                nums1[authorPointer--] = nums1[readerPointerN1--]
            } else if (nums1[readerPointerN1] > nums2[readerPointerN2])
                nums1[authorPointer--] = nums1[readerPointerN1--]
            else {
                nums1[authorPointer--] = nums2[readerPointerN2--]
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

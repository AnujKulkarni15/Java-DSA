/** Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j. **/


// Leetcode Solution

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count[] = new int[102]; // stores the frequency of each element
        for(int num:nums){
            count[num]++;
        }

        int total = 0;
        for(int i:count){
            total += (i*(i-1))/2;
        }
        return total;
    }
}

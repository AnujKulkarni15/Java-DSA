/** You have an array of floating point numbers averages which is initially empty. You are given an array nums of n integers where n is even.
You repeat the following procedure n / 2 times:
Remove the smallest element, minElement, and the largest element maxElement, from nums.
Add (minElement + maxElement) / 2 to averages.
Return the minimum element in averages. **/

// VS code solution

import java.util.Arrays;

public class minimumAverage {
  public static void main(String[] args) {
    int arr[] = { 7, 8, 3, 4, 15, 13, 4, 1 };
    int i = 0;
    int k = arr.length - 1;
    double j = Double.MAX_VALUE;
    Arrays.sort(arr);

    while (i <= k) {
      double avg = arr[i] + arr[k];
      avg = avg / 2;
      j = Math.min(avg, j);
      i++;
      k--;
    }
    System.out.println(j);
  }
}


// Leetcode Solution

class Solution {
    public double minimumAverage(int[] nums) {
        int i = 0;
        int k = nums.length - 1;
        double j = Double.MAX_VALUE;
        Arrays.sort(nums);

        while(i<=k){
            double avg = nums[i] + nums[k];
            avg = avg/2;
            j = Math.min(avg,j);
            i++;
            k--;
        }
        return j;
    }
}


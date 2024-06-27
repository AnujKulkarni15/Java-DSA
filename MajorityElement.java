/**Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.**/


// Vs code solution


public class majorityElement {
  public static void main(String[] args) {
    int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
    int n = arr.length;
    System.out.println(solution(arr, n));
  }

  public static int solution(int a[], int size) {
    int candidate = a[0];
    int count = 1;

    for (int i = 0; i < size; i++) {
      if (a[i] == candidate) {
        count++;
      } else {
        count--;
      }

      if (count == 0) {
        candidate = a[i];
        count = 1;
      }
    }

    count = 0;
    for (int val : a) {
      if (val == candidate) {
        count++;
      }
    }

    if (count > size / 2) {
      return candidate;
    } else {
      return -1;
    }
  }
}




// Leetcode solution


class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == candidate){
                count++;
            }
            else{
                count--;
            }

            if(count == 0){
                candidate = nums[i];
                count = 1;
            }
        }

        count = 0;
        for(int val : nums){
            if(val == candidate){
                count++;
            }
        }

        if(count>= nums.length/2){
            return candidate;
        }
        else{
            return -1;
        }
    }
}

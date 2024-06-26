/** Given an integer array nums and an integer val, remove all occurrences of 
val in nums in-place. The order of the elements may be changed. Then 
return the number of elements in nums which are not equal to val. **/

// VS code 

public class removeElement {
  public static void main(String[] args) {
    int arr[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
    int val = 2;
    // int k = 0;
    System.out.println(solution(arr, val));
  }

  public static int solution(int a[], int value) {
    int j = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != value) {
        a[i] = a[j];
        j++;
      }
    }
    return j;
  }
}


// Leetcode

class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int k = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != val)
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

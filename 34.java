/** 34. Find First and Last Position of Element in Sorted Array
  
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity. **/

// It is similar to binary search or can say similar logic as binary search is used

class Solution {
public int[] searchRange(int arr[], int target) {

    int ans[] = { -1, -1 };
    int start = search(arr, target,true);
    int end = search(arr, target, false);

    ans[0] = start;
    ans[1] = end;

    return ans;
  }

  public static int search(int arr[], int target, boolean element) {

    int ans = -1;

    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        ans = mid;
        if (element) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return ans;
  }
}

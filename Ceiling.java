// Ceiling - the smallest number that is greater than or equal to the target number
// It is same as binary search only instead of returning -1 just return start


public class ceiling {
  public static void main(String[] args) {
    int arr[] = { 2, 5, 7, 9, 12, 15, 27, 30 };
    int target = 8;
    int ans = Ceiling(arr, target);
    System.out.println(ans);
  }

  public static int Ceiling(int arr[], int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return start;
  }
}

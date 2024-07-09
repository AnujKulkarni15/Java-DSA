// Floor - the greatest number that is smaller or equal to target number
// It is same as binary search only instead if return -1 just return end


public class floor {
  public static void main(String[] args) {
    int arr[] = { 2, 5, 7, 9, 12, 15, 27, 30 };
    int target = 8;
    int ans = Floor(arr, target);
    System.out.println(ans);
  }

  public static int Floor(int arr[], int target) {
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
    return end;
  }
}

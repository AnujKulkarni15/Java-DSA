// Returning the index of the element to be searched

public class linearSearch {
  public static void main(String[] args) {
    int nums[] = { 8, 7, 9, 5, 4, 6 };
    int tar = 5;
    int ans = search(nums, tar);
    System.out.println(ans);
  }

  public static int search(int arr[], int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = 0; i < arr.length; i++) {
      int element = arr[i];
      if (element == target) {
        return i;
      }
    }
    return -1;
  }
}

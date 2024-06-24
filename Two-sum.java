import java.util.HashMap;

public class twosum {
  public static void main(String args[]) {
    int arr[] = { 11, 3, 7, 9, 14, 2 };
    int target = 17;

    int ans[] = new int[2]; // Used to store answer

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int second_no = target - arr[i];
      if (map.containsKey(second_no)) {
        ans[0] = map.get(second_no);
        ans[1] = i;
        break;
      }
      map.put(arr[i], i);
    }
    System.out.println(ans[0] + " " + ans[1]);
  }
}

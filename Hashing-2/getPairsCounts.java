/*
Find all pairs with sum K

Given a sorted list of N integers, find all distinct pairs of integers in the list with sum equal to a given number K, with O(n log n) or O(n) time complexity.

Complete the function below which takes the array and K as parameters and return the number of pairs if any and 0 otherwise.
*/




class Result {
    static int getPairsCount(int arr[], int n, int k) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < n; i++) {
        if (!map.containsKey(arr[i]))
          map.put(arr[i], 0);
        map.put(arr[i], map.get(arr[i]) + 1);
      }
      int count = 0;
      for (int i = 0; i < n; i++) {
        if (map.get(k - arr[i]) != null)
          count += map.get(k - arr[i]);
        if (k - arr[i] == arr[i])
          count--;
      }
      return count / 2;
    }
  }
/*
Find contiguous sub-array with given sum

Given an unsorted array of integers and an integer sum, find a sub-array of consecutive indexes which adds to the given sum.

If there are more than one such sub-arrays, print the first set of indexes. For example, suppose there are two sub-arrays having the given sum, then print the subarray with the lower starting index, or if the starting index for both is same then print the one with the lower ending index.

Example:

If the array is {1, 4, 20, 2, 7, 5} and sum is 29, then you should print "2 4", as elements from 2 to index 4 makes an sub-array with sum equal to 29.

In case no such sub-array exists, print -1. 
*/



class Result {
    static void findTheSubArray(int arr[], int n, int sum) {
      int currentSum = 0;
      HashMap<Integer, Integer> map = new HashMap<>();
      map.put(0, -1);
      for (int i = 0; i < n; i++){
        currentSum = currentSum + arr[i];
        if (map.containsKey(currentSum - sum)){
          System.out.print(map.get(currentSum - sum)+1 + " " + i);
          return;
        }
        map.put(currentSum, i);
      }
      System.out.print(-1);
    }
  }
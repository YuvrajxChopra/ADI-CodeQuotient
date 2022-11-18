/*
Queries for K largest

Given an array of N integers, and Q queries. Each query will contain a single integer K, and your task is to find the Kth largest element in the array. Finally, sum up the result of all the queries, and return it as the final answer.

Example:

N = 7, arr[N] = {6, 9, 2, 8, 4, 1, 7}

Q = 3, queries[Q] = {1, 4, 2}

The largest element is 9, the fourth largest element is 6, and the second largest element is 8. By adding all the three value we'll get the final result i.e. (9 + 6 + 8) = 23.
*/



import java.util.*;
class Result {
  static long solveQueries(int N, int arr[], int Q, int queries[]) {
    Arrays.sort(arr);
    int ans = 0;
    for(int i = 0; i<queries.length; i++){
      int j = N - queries[i];
      ans += arr[j];
    }
    return ans;
  }
}
/*
Longest Consecutive Subsequence

Given an array of n positive integers. A subsequence is defined as an ordered subset of the array's elements having the same sequential ordering as the original array.

Write a program to find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order. For example,

if input is {10, 101, 12, 13, 11, 14, 25}, then the longest consecutive subsequence is {10, 12, 13, 11, 14}, the output should be 5.

Expected time complexity: O(n)
*/



class Result {
    static int LongestConsecutiveSubsequence(int a[], int len) {
      int res = 0;
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      for (int n : a) {
        if (!map.containsKey(n)) {
          int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
          int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
          int sum = left + right + 1;
          map.put(n, sum);
          res = Math.max(res, sum);
          map.put(n - left, sum);
          map.put(n + right, sum);
          }
        else 
          continue;
      }
      return res;
    }
  }
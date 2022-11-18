/*
Noise In The Library

In a library, N books are kept on a horizontal shelf in the decreasing order of their IDs. Now assume that, in order to reach a book present at i'th index(consider 0-based indexing), it takes i steps from leftmost position, and each step generates 1 unit of noise in the library.

Given an array, denoting the book IDs of N books in decreasing order. Assume that all the book IDs are different, your task is to calculate how much noise it will generate to reach K given books, every time starting from the leftmost position.

Note: For searching a book that is not available, a person has to travel all the way to the end. Therefore, it requires N steps (where N is the total number of books).
*/

import java.util.*;
class Result {
  static long totalNoise(int N, int book_IDs[], int K, int booksToFind[]) {
    long ans = 0;
    int i = 0;
    if ( N == 0 || K == 0)
      return 0;
    Arrays.sort(book_IDs);
    while(i<K){
      int temp = Arrays.binarySearch(book_IDs, booksToFind[i]);
      if(temp < 0){
        ans += N ;
      }
      else
      	ans += N - Arrays.binarySearch(book_IDs, booksToFind[i]) - 1;
      i++;
    }
    return ans;
  }
}
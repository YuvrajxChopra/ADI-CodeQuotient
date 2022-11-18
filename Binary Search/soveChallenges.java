/* 

Challenges To Find First Occurrence

Rajesh is playing an online game, in which he has to solve a series of challenges if he wants to win. The game is as follows: Given a list of N integers sorted in ascending order, and a series of K challenges. In each challenge, one integer X will be flashed on the screen, and the player needs to find the first occurrence of X in the given list. Finally, he has to sum up the result of all the K challenges, and enter the answer in the game's console. If the player's answer matches the expected output, then he wins the game.

Rajesh needs your help to win this game, He wants you to write an algorithm that finds the first occurrence of K given integers in a sorted list, and then add those to get the final answer.

Note: If a number X is not found in the list, then consider its first occurrence as -1.

Example:

N = 7, arr[N] = {2, 2, 4, 5, 5, 5, 6}

K = 3, challenges[K] = {5, 2, 6}

The First occurrence of 5, 2 and 6 is at index 3, 0, 6 respectively. Therefore, the final answer is 3 + 0 + 6 = 9.
*/

class Result {
    static int binarySearch(int[] arr, int x){
      int res = -1;
      int left = 0;
      int right = arr.length-1;
      while(left <= right){
        int mid=(left + right)/2;
        if(arr[mid] == x){
          res = mid;
          right = mid-1;
        }
        else if(arr[mid] < x){
          left = mid+1;
        }
        else{
          right = mid-1;
        }
      }
      return res;
    }
    static long solveChallenges(int N, int arr[], int K, int challenges[]) {
      long count=0;
      for(int i=0;i<K;i++){
        int temp = binarySearch(arr,challenges[i]);
        count += temp;
      }
      return count;
    }
  }
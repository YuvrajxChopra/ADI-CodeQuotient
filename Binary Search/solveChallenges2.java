/*
Solve Challenges To Win The Game

Himanshu plays an online game where he has to solve several challenges to win. The game is as follows: Given a list of N integers sorted in ascending order, and a series of K challenges. In each challenge, one integer X will be flashed on the screen, and the player needs to find the count of X in the given list. Finally, he has to sum up the result of all the K challenges, and enter the answer in the game's console. If the player's answer matches the expected output, then he wins the game.

Himanshu needs your help to win this game, He wants you to write an algorithm that finds the count of K given integers in a sorted list, and then add those to get the final answer.

Example:

N = 7, arr[N] = {2, 2, 4, 5, 5, 5, 6}

K = 3, challenges[K] = {5, 2, 6}

The count of 5, 2 and 6 is 3, 2, 1 respectively. Therefore, the final answer is 3 + 2 + 1 = 6.
*/

class Result {
    static int binarySearch(int[] arr, int x, boolean flag) {
        int res = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                res = mid;
                if (flag == true)
                    right = mid - 1;
                else
                    left = mid + 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    static long solveChallenges(int N, int arr[], int K, int challenges[]) {
        long count = 0;
        for (int i = 0; i < K; i++) {
            int left = binarySearch(arr, challenges[i], true);
            int right = binarySearch(arr, challenges[i], false);
            if (left == -1 && right == -1) {
                count += 0;
            } else {
                count += (right - left + 1);
            }
        }
        return count;
    }
}
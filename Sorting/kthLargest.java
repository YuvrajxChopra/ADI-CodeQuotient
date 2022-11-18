/*
Kth largest number

Given a method called kthLargest that accepts an integer k and an array arr as its parameters and returns the element such that k elements have greater or equal value. If k = 0, return the largest element; if k = 1, return the second largest element, and so on.

For example, if the array passed contains the values {74, 85, 102, 99, 101, 56, 84} and the integer k passed is 2, your method should return 99 because there are two values at least as large as 99 (101 and 102).

Expected Time Complexity: O(N)
*/




static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
static int kthLargest(int arr[], int size, int k) {
  quickSort(arr, 0 , size -1);
  int ans = arr[size-1];
  int i = size -1;
  while(k != 0){
    k--;
    i--;
    ans = arr[i];
  }
  return ans;
}
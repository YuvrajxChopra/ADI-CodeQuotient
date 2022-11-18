/*
Sort an array using quick sort star_border

Given an array of N integers, sort them in ascending order using quick sort (a divide and conquer approach). It picks an element as pivot and partitions the given array around the picked pivot element recursively. Write the two functions quickSort() and partition(), in which the quickSort() choose an pivot using partition() function and calls itself on the two parts of array before and after the pivot element.
*/



class Result {
    /* This function picks an element as pivot, places the pivot element at its correct position in sorted array, and places all smaller (smaller than pivot) 
     to left of pivot and all greater elements to right of pivot */
    static void swap(int[] arr, int i, int j)
      {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
    }
    int partition (int arr[], int low, int high) {
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
    /* low is for left index and high is right index of the sub-array of arr to be sorted */
    void quickSort(int arr[], int low, int high) {
      if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
      }
    }
  }
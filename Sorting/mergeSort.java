/*
Sort an array using merge sort

Given an array of N integers, sort them in ascending order using merge sort (a divide and conquer approach). Merge sort cut the array in two halves, calls itself on these halves and then merge the two sorted halves recursively to make the whole array sorted. Write the two functions mergeSort() and merge(), in which the mergeSort() divides array in half and calls it recursively and merge() will merge the two sorted arrays given as parameters.
*/




class Result {
    void merge(int arr[], int l, int m, int r) {
      int n1 = m - l + 1;int n2 = r - m;
      int L[] = new int[n1];
      int R[] = new int[n2];
      for (int i = 0; i < n1; ++i)
        L[i] = arr[l + i];
      for (int j = 0; j < n2; ++j)
        R[j] = arr[m + 1 + j];
      int i = 0, j = 0;
      int k = l;
      while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
          arr[k] = L[i];
          i++;
        }
        else {
          arr[k] = R[j];
          j++;
        }
        k++;
      }
      while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
      }
      while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
      }
    }
    void mergeSort(int arr[], int l, int r) {
      if (l < r) {
        int m = l + (r - l) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
      }
    }
  }
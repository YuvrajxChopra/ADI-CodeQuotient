/*
Integer Square Root

Given a positive number n, devise an algorithm to compute its integer square root. For example, the square root of 20 lies between 4 and 5, so we need to consider its floor value as the answer, i.e. 4.

Do not use any in-built function to calculate square root.
 */



class Result {
    static long sqrt(long n) {
      if(n == 0 || n == 1)
        return n;
      long low = 1;
      long high = n;
      long ans = -1;
      while(low <= high){
        long mid = (low+high)/2;
        if (mid == n/mid )
          return mid;
        else if (mid < n/mid){
          ans = mid;
          low = mid+1;
        }
        else 
          high = mid-1;
      }
      return ans;
    }
  }
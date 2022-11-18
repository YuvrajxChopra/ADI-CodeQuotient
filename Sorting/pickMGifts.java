/*
Gifts for everyone with no bias

On the eve of Christmas, Santa has prepared N boxes of chocolates (each box may contains different number of chocolates). Now he wants to distribute them as 1 box each to M children, but to avoid the imbalance between their shares, he tries to pick those M boxes out of N, which will provide as possible as equal chocolates to them. For this, he will calculate the imbalance as

max(b1, b2, b3, ... bm) - min(b1, b2, b3, ... bm) where bi denotes the number of chocolates in the ith box and i <= M

Your task is to help Santa, find the minimum amount of imbalance that can be achieved.

So complete the function pickMGifts() which takes an integer array of size N and an integer M to denote the number of children as parameters and return the minimum amount of imbalance possible with N packets and M children.
*/




class Result {
    public static int pickMGifts(int m, List<Integer> arr) {
      Collections.sort(arr);
      int ans = Integer.MAX_VALUE;
      int n = arr.size();
      if(m>n)
        return -1;
      if(m == 0)
        return 0;
      for(int i = 0; i+m-1<n; i++){
        int temp = arr.get(i + m - 1) - arr.get(i);
        if(temp<ans)
          ans = temp;
      }
      return ans;
    }
  }
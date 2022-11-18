/*
Find all pairs with K difference

Given an array of N distinct integers, find all the pairs of integers in it, with the difference equals to a given number K.

Complete the function in the editor, which takes the array and K as parameters and return the number of pairs with the difference K.
*/




class Result {
    static int getPairsCount(int arr[], int n, int k) {
      if(k<0)
        return 0;
      Set<Integer> numbers= new HashSet<>();
      Set<Integer> found=new HashSet<>();
      for(int i:arr){
        if(numbers.contains(i+k))
          found.add(i);
        if(numbers.contains(i-k))
          found.add(i-k);
        numbers.add(i);
      }
      return found.size();
    }
  }

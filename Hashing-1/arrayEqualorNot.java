/*
Check if two arrays are equal or not

Given two array of same size, find out if given arrays are equal or not.

Note: Two arrays are said to be equal if both of them contain same set of elements, although arrangements (or permutation) of elements may be different.

Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal..

For example, if A = [11, 12, 13] and B = [12, 11, 13] then answer is 1 and,

if A = [11, 12, 13, 12, 13] and B = [12, 11, 13, 12, 13] then answer is 1 and,

if A = [11, 12, 13] and B = [12, 13, 12] then answer is 0.

Complete the function arraysEqualorNot() given in the editor, which takes two arrays as input and returns the answer(0/1) as output.
*/



class Result {
    static int arraysEqualorNot(int[] A, int[] B) {
      int n = A.length;
      int m = B.length;
      int temp;
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      for(int i = 0; i<n; i++){
        if(map.get(A[i]) == null)
          map.put(A[i], 1);
        else{
          temp = map.get(A[i]);
          temp++;
          map.put(A[i], temp);
        }
      }
      for(int i = 0; i<m; i++){
        if(map.containsKey(B[i]) == false)
          return 0;
        if(map.get(B[i]) == 0)
          return 0;
        temp = map.get(B[i]);
        temp--;
        map.put(B[i], temp);
      }
      return 1;
    }
  }
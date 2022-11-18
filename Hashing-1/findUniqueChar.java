/*
First Unique Character

Given a string that contains only lowercase English letters, find the first non-repeating character in it and return its index. If it doesn't exist, then return -1.
*/



class Result {
    static int firstUniqueChar(String str) {
      int ans = Integer.MAX_VALUE;
      for(char c='a'; c<='z';c++){
        int index = str.indexOf(c);
        if(index!=-1&&index==str.lastIndexOf(c)){
          ans = Math.min(ans,index);
        }
      }
      return ans==Integer.MAX_VALUE?-1:ans;
    }
  }
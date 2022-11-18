/*
Insurance Agent with a target

Nitesh is a life insurance agent, He reached a street with N houses all in a straight line, and he has a target of selling K policies. To save time, he will only sell the policies to the members of consecutive houses. Assume he is such a good salesman that all the members of a house buy a policy from him. Now given an array denoting the number of members in each house, find how many different ways are there for Nitesh to achieve his target.

For example,

If members[ ] = {1, 3, 2, 1, 2, 5} and target = 5, then in 3 different ways Nitesh can achieve his target.

First way is to sell the policy in 2nd and 3rd house.

Another way is to sell the policy in 3rd, 4th and 5th house.

Then third way is to sell the policy only in the 6th house.
*/




class Result {
    static int totalWays(int members[], int n, int k) {
      int count = 0, sum = 0;
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < n; i++) {
        sum+= members[i];
        if(sum == k) 
          count++;
        if(map.containsKey(sum - k))
          count+= map.get(sum - k);
        map.put(sum, map.getOrDefault(sum, 0)+1);
      }
      return count;
    }
  }
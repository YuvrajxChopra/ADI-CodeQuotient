/*
Fractional Knapsack problem star_border

The knapsack problem or rucksack problem is a problem in combinatorial optimization: Given a set of items, each with a weight and a value, determine the number of each item to include in a collection so that the total weight is less than or equal to a given limit and the total value is as large as possible.

In this problem we will solve a variant of it, in which the items may have a fractional decision i.e. you can pick the full item or partial depending on the capacity you have. Partial items are allowed to fill the bag at fullest. This is also known as fractional knapsack problem.

Given two integer arrays values[0..n-1] and weight[0..n-1] which represent values and weights associated with n items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of values[] such that sum of the weights of this subset is equal to W.
*/




class pair{
    int value, weight;
    double ratio;
    pair(int v, int w)
    {
      value = v;
      weight = w;
      ratio = (v*1.0)/w;
    }
  }
  class Result
  {
    static double fractionalKnapsack(int val[], int weight[], int n, int capacity)
    {
      ArrayList<pair> li = new ArrayList<>();
      for(int i = 0; i<n; i++)
      {
        li.add(new pair(val[i], weight[i]));
      }
      li.sort((o1, o2)->o2.ratio>o1.ratio?1:-1);
      int index = 0;
      double profit = 0;
      while(index<n && capacity>=li.get(index).weight)
      {
        capacity -= li.get(index).weight;
        profit += li.get(index).value;
        index++;
      }
      if(capacity>0 && index<n)
      {
        profit += (capacity*1.0/li.get(index).weight)*li.get(index).value;
      }
      return profit;
    }
  }
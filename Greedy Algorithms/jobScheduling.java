/*
Job Scheduling with deadlines star_border

Mr. Amit have some jobs to be scheduled. Each job must meet the deadline to be counted as completed i.e. scheduling a job after its deadline is of no use.

Each job has some profit associated with it. Mr. Amit wants to schedule the as much jobs as he can and also want to earn the maximum profit.

Note: Each job needs 1 time unit for execution.

*/



class pair{
    int d, p;
    pair(int profit, int deadline)
    {
      p = profit;
      d = deadline;
    }
  }
  class Result {
    static int jobScheduling(int[] deadlines, int[] profits) {
      ArrayList<pair> li = new ArrayList<>();
      int l = deadlines.length;
      int maxDeadline = -1;
      for(int i = 0; i<l; i++)
      {
        li.add(new pair(profits[i], deadlines[i]));
        maxDeadline = Math.max(maxDeadline, deadlines[i]);
      }
      li.sort((o1, o2)->o2.p-o1.p);
      int timeSlot[] = new int[101];
      int profit = 0;
      for(int i = 0; i<l; i++)
      {
        pair tmp = li.get(i);
        if(timeSlot[tmp.d]==0)
        {
          profit += tmp.p;
          timeSlot[tmp.d] = 1;
        }
        else
        {
          int index = tmp.d;
          while(index>0 && timeSlot[index]!=0)
          {
            index--;
          }
          if(index>0)
          {
            timeSlot[index] = 1;
            profit += tmp.p;
          }
        }
      }
      return profit;
    }
  }
  
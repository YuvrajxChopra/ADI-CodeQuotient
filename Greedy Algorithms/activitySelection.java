/*
Activity Selection Problem star_border

Activity is defined as a interval of time for its execution. Every activity has a start time and a finish time. You are given N activities with their start and finish times.

Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.
*/

class pair{
    int si, ei;
    pair(int start, int end)
    {
      si = start;
      ei = end;
    }
  }
  class Result {
    static void activitySelection(int[] start, int[] finish) {
      ArrayList<pair> li = new ArrayList<>();
      int l = start.length;
      for(int i = 0; i<l; i++)
      {
        li.add(new pair(start[i], finish[i]));
      }
      li.sort((o1, o2)->o1.ei-o2.ei);
      int activityCount = 1;
      int endtime = li.get(0).ei;
      System.out.print(li.get(0).si);
      for(int i = 1; i<l; i++)
      {
        pair tmp = li.get(i);
        if(tmp.si>=endtime)
        {
          activityCount++;
          endtime = tmp.ei;
          System.out.print(" "+tmp.si);
        }
      }
      System.out.println();
    }
  }
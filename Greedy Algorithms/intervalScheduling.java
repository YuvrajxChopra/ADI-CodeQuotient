/*
Interval scheduling Problem star_border

Interval is defined as a span of time with start and end time. You are given N intervals with their start and finish times.

Two intervals can overlap each other if they have any time in common, e.g. Interval(5, 15) and Interval(10,20) are overlapping as time 10 to 15 is shared between them,

whereas Interval(5, 15) and Interval(20, 30) are non-overlapping as they do not have any common time.

Your task is to find the maximum number of intervals that can be scheduled, obviously they need to be non-overlapping.
*/



class store{
    int si, ei;
    store(int si, int ei)
    {
      this.si = si;
      this.ei = ei;
    }
  }
  class Result {
    static int intervalScheduling(int[] start, int[] end) {
      int n = start.length;
      ArrayList<store> li = new ArrayList<>();
      for(int i = 0; i<n; i++)
      {
        li.add(new store(start[i], end[i]));
      }
      li.sort((o1, o2)->o1.ei>o2.ei?1:-1);
      ArrayList<store> li2 = new ArrayList<>();
      li2.add(li.get(0));
      int index = 1;
      int count = 1;
      while(index<n)
      {
        if(li.get(index).si>=li2.get(count-1).ei)
        {
          count++;
          li2.add(li.get(index));
        }
        index++;
      }
      return count;
    }
  }
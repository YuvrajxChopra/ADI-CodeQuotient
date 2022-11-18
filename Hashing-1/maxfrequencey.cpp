/*
Maximum Frequency in a sequence

Given a list of integers, find out the number that has the highest frequency. If there are more than one such numbers, output the smaller one.
*/




#include <bits/stdc++.h>
using namespace std;
int main ()
{
  int t;
  cin >> t;
  while (t--)
    {
      int n;
      cin >> n;
      int arr[n];
      unordered_map < int, int >mp;
      set < int >st;
      for (int i = 0; i < n; i++)
	{
	  cin >> arr[i];
	  st.insert (arr[i]);
	  if (mp.find (arr[i]) != mp.end ())
	    mp[arr[i]] = mp[arr[i]] + 1;
	  else
	    mp[arr[i]] = 1;
	}
      int ans = -1;
      int maxcount = -1;
    for (int i:st)
	{
	  int value = mp[i];
	  if (maxcount < value)
	    {
	      maxcount = value;
	      ans = i;
	    }
	}
      cout << ans << endl;
    }
  return 0;
}
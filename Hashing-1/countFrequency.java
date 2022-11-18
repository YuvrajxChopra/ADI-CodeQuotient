/*
Count frequency of each character

Given a string that contains only lowercase characters. Write a program to print all the distinct characters along with their frequency in the order of their occurrence. For example if the string is “helloworld”, then you should print h1 e1 l3 o2 w1 r1 d1

Complete the given function countFrequency() and print the frequency of each character as per the given statement.
*/



class Result {
    static void countFrequency(String str) {
      HashMap<Character, Integer> map= new HashMap<Character, Integer>();
      for(int i = 0; i<str.length(); i++){
        char c = str.charAt(i);
        if(map.containsKey(c) == true)
          map.put(c, map.get(c)+1);
        else
          map.put(c, 1);
      }
      HashSet<Character> set = new HashSet<Character>();
      for(int i = 0; i<str.length(); i++){
        if(set.contains(str.charAt(i)) == false) {
          set.add(str.charAt(i));
          System.out.print(str.charAt(i));
          System.out.print(map.get(str.charAt(i)));
          System.out.print(" ");
        }
      }
    }
  }
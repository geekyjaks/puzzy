package com.geekyjaks.puzzy.string;

public class FindWord {

  private char data[][] = {
      {'w', 's', 'a', 't', 'g' , 'h'},
      {'a', 'a', 'c', 'h', 'i', 'n'},
      {'k', 'c', 'h', 'u', 'j' , 'i'},
      {'o', 'h', 'i', 'n', 'y', 's'}
  };
  
  public int findWord(String word){

    int count = 0;
    for(int x = 0; x<data.length; x++)
      for (int y = 0; y<data[0].length;y++)
        if (((data.length + data[0].length - 1 - x - y) >= word.length()) && data[x][y] == word.charAt(0)){
          count += find(word, x, y, 0);
        }
      
    return count;
  }
  
  public int find(String word, int x, int y, int p){
    
    if (data[x][y] != word.charAt(p))
      return 0;

    if (p + 1 == word.length())
    return 1;
    
    int count = 0;
      
    if (x + 1 < data.length)
      count += find(word, x +1, y, p +1);
    if (y + 1 < data[0].length)
      count += find(word, x, y + 1, p +1);
    if ((x + 1 < data.length) && (y + 1 < data[0].length))
      count += find(word, x+1, y + 1, p +1);
    
    return count;
  }
  
  public static void main(String[] args) {

    String word = "sachin";
    FindWord fw = new FindWord();
    System.out.println(fw.findWord(word));
  }
}

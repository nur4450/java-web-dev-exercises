package exercises;


import java.util.Scanner;

public class Alice {
  public static void main(String[] args){
    String sentence = "alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought alice 'without pictures or conversation?'";
    Scanner input = new Scanner(System.in);
      System.out.println("Enter search term:");
      String term = input.nextLine();
      System.out.println(sentence.contains(term.toLowerCase()));
      System.out.println( "Index: " + sentence.indexOf(term));
     System.out.println( "Length: " + term.length());
  }
}

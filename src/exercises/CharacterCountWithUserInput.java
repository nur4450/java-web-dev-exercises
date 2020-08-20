package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountWithUserInput {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.println("Enter word for to count characters: ");
        String sentence = input.nextLine().toLowerCase();
        char[] strArray = sentence.toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<Character, Integer>();

        for(char c : strArray){
            if( c >= 'a' && c <= 'z' ) {
                if (characterCount.containsKey(c)) {
                    characterCount.put(c, characterCount.get(c) + 1);
                } else {
                    characterCount.put(c, 1);
                }
            }
        }
        for(Map.Entry<Character, Integer> chars : characterCount.entrySet()){
            System.out.println(chars.getKey() + ": " + chars.getValue());
        }
    }
}

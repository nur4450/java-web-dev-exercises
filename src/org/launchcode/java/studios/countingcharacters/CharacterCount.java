package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args){
        int count = 0;
        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] strArray = sentence.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for(char c : strArray){
         if(charCount.containsKey(c)){
             charCount.put(c, charCount.get(c)+1);
         }else{
             charCount.put(c, 1);
         }
        }
        for (Map.Entry<Character, Integer> chars : charCount.entrySet()) {
            System.out.println(chars.getKey() + ": " + chars.getValue());
        }
        //System.out.println(charCount);
    }
}

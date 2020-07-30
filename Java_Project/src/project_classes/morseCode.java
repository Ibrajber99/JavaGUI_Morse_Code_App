/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_classes;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Ibrahim Jaber
 * MorseCode class that holds the Logic of converting english words to Morse Code
 */
public class morseCode {
    
    /**
     * CTO-R
     * once an object is instantiated the member functions will be called
     * to fill up the HashMap with the letters and numbers values 
     */
    public morseCode(){
        generateLetters();//Fucntion call
        generateNumbers();//Fucntion call
        fillMap();//Function call
    }
    
    //Variabel Declaration and intialization
    private char alphaLetters = 97;
    private char numbers = 48;
    //HahsMap declaration and intialization
    private HashMap<Character, String> morsetable = new HashMap<Character, String>();
    
    //ArrayList declaration and intialization
    private ArrayList<String> lettersValue = new ArrayList<String>();
    private ArrayList<String> numbersvalue = new ArrayList<String>();
    
    /**
     * Function that populates the ArrayList lettersValue with the letters value from A-Z
     */
    private void generateLetters() {
        lettersValue.add(".-");lettersValue.add("-...");lettersValue.add("-.-.");
        lettersValue.add("-..");lettersValue.add("."); lettersValue.add("..-.");
        lettersValue.add("--.");lettersValue.add("....");lettersValue.add("..");
        lettersValue.add(".---");lettersValue.add("-.-");lettersValue.add(".-..");
        lettersValue.add("--");lettersValue.add("-.");lettersValue.add("---");
        lettersValue.add(".--.");lettersValue.add("--.-"); lettersValue.add(".-.");
        lettersValue.add("..."); lettersValue.add("-");lettersValue.add("..-");
        lettersValue.add("...-");lettersValue.add(".--");lettersValue.add("-..-");
        lettersValue.add("-.--");lettersValue.add("--..");
    }
     /**
     * Function that populates the ArrayList numbersvalue with the numbers values from 0-9
     */
    private void generateNumbers() {
        numbersvalue.add("-----");
        numbersvalue.add(".----");
        numbersvalue.add("..---");
        numbersvalue.add("...--");
        numbersvalue.add("....-");
        numbersvalue.add(".....");
        numbersvalue.add("-....");
        numbersvalue.add("--...");
        numbersvalue.add("---..");
        numbersvalue.add("----.");
    }
    /**
     * Function that inserts key and value to the map
     * in the first loop we insert the letters from A-Z
     * by inserting  Integer variable alphaLetters as  a Key and converting that to char to grab the ASCII value and we insert the equivalant 
     * representation the letter in Morse by accessing the value in our ArrayList  and we keep increment Alphaletter variable till we hit 25 
     * 
     * Second loop we do the same but for numbers this time
     */
    private void fillMap() {
        for (int i = 0; i <= 25; i++) {
            morsetable.put((char) alphaLetters, lettersValue.get(i));
            alphaLetters++;
        }
        for (int i = 0; i <= 9; i++) {
            morsetable.put((char) numbers, numbersvalue.get(i));
            numbers++;
        }
    }
    /**
     * 
     * @param s
     * @return String
     * 
     * this function converts the string to the Morse value by first converting that string to Lower case
     * since our map holds lower case alphabet keys and we exchange that with the value and we return the string in Morse Representation
     */
    public String convertCode(String s) {
        String res = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                res += morsetable.get(s.charAt(i)) + " ";
            }

        }
        return res;
    }

}

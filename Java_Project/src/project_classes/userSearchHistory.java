/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_classes;

/**
 *
 * @author Ibrahim Jaber
 * userSearchHistory class to populate data to the table from the data base
 */

public class userSearchHistory {
   //Variable Delcarations 
    private String MorseWord;
    private String englishWord;
    private String dateS;
    
    /***
     * 
     * @param englishWord
     * @param MorseWord
     * @param dateS 
     * CTO-R
     */
    public userSearchHistory(String englishWord,String MorseWord,String dateS){
        this.MorseWord = MorseWord;
        this.englishWord = englishWord;
        this.dateS = dateS;
    }
    /**
     * 
     * @return string
     * 
     */
    public String getEnglishWord(){
        return englishWord;
    }
    /**
     * 
     * 
     * @return  String
     */
    public String getMorseWord(){
        return MorseWord;
    }
    /**
     * 
     * 
     * @return  String
     */
    public String getDateS(){
        return dateS;
    }
}

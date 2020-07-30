/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;
import javafx.util.converter.LocalDateStringConverter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ibrahim Jaber
 * This class holds all the logic to get a connection to the database instance
 * holds some functionality to insert value to a table and extract values as well 
 */
public class DBLogic {
    private boolean flagSuccess = true;
    
    /**
     * Function that tries to establish a connection to the Database Instance
     * and throws an exception if the connection is failed
     */
    public void GetConnection(){
        try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          String url="jdbc:sqlserver://localhost:1433;DatabaseName=javaApp;user=IBRAHIM;password=12345";
          Connection con= DriverManager.getConnection(url);
          String sql = "Select * From javaLogin where username =? and password=?";
          PreparedStatement pst = con.prepareStatement(sql);
        con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }
    /**
     * 
     * 
     * @param userName
     * @param passWord
     * @return boolean
     * function that tries to first establish a connection if it fails it will throw and exception if not it will try
     * validate the user logic credentials by going to the javaLogin table and search for the username and password
     * if there is no match it will show message pop up  and returns true or false based on the result
     */
    public boolean login(String userName,String passWord){
         try{
             //trying to establish connection
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//grabbing the connection URL
          String url="jdbc:sqlserver://localhost:1433;DatabaseName=javaApp;user=IBRAHIM;password=12345";//fillign the connection details
          Connection con= DriverManager.getConnection(url);//connection object that tries to establish the connection
          String sql = "Select * From javaLogin where username =? and password=?";//Sql query
          PreparedStatement pst = con.prepareStatement(sql);//preprared stmt that tries to execute the query
          pst.setString(1,userName);//setting the values where there is ? in the query 
          pst.setString(2,passWord);//setting the values where there is ? in the query 
          ResultSet rs = pst.executeQuery();//executes the query
          if(rs.next()){//if connection has been established and the data has been validated it will return true
              JOptionPane.showMessageDialog(null, "Username and Password matched");
              return true;              
          }else{//if the data is not macthing it will return false 
              JOptionPane.showMessageDialog(null, "Username or password are not correct");
              flagSuccess = false;
          }
        con.close();
        }
        catch(Exception e){//exception handling
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
         return flagSuccess;//return result
    }
    /**
     * 
     * @param userName
     * @param passWord
     * @return boolean
     * function that tries to first establish a connection if it fails it will throw and exception if not it will try
     * to insert the userName string and password values to the javaLogin table and returns true or false based on the result
     */
    public boolean singUp(String userName,String passWord){
        
        try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//grabbing the connection URL
          String url="jdbc:sqlserver://localhost:1433;DatabaseName=javaApp;user=IBRAHIM;password=12345";//fillign the connection details
          Connection con= DriverManager.getConnection(url);//connection object that tries to establish the connection
          String sql = "Select * From javaLogin where username =? and password=?";//Sql query
          PreparedStatement pst = con.prepareStatement(sql);//preprared stmt that tries to execute the query
          if(!userName.isEmpty() && !passWord.isEmpty()){//if the fields are not empty it will return true after exectuing the query 
            PreparedStatement stmt = con.prepareStatement("insert into javaLogin (UserName, Password) values (?, ?)");//Sql Query
            stmt.setString(1, userName);//setting the values where there is ? in the query 
            stmt.setString(2, passWord);//setting the values where there is ? in the query 
            stmt.executeUpdate();
             return true;
          }else{
              flagSuccess = false;
          }
        con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
         return flagSuccess;
    }
    
    /**
     * 
     * @param Englishword
     * @param morseWord
     * @return boolean
     * function that tries to first establish a connection if it fails it will throw and exception if not
     * it  will grab the values of the morse code conversion and the english word 
     * along side i  instantiate a Date object to insert it to the conversionHistory table by executing a stored procedure that accepts 3 params
     * and returns true or false based on the result
     */
    public boolean insertConversionHistory(String Englishword, String morseWord){
        LocalDate ld = LocalDate.now();//Date object
         try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//grabbing the connection URL
          String url="jdbc:sqlserver://localhost:1433;DatabaseName=javaApp;user=IBRAHIM;password=12345";//fillign the connection details
          Connection con= DriverManager.getConnection(url);//connection object that tries to establish the connection
          String sql = "Select * From javaLogin where username =? and password=?";//Sql query
          PreparedStatement pst = con.prepareStatement(sql);//preprared stmt that tries to execute the query
          if(!Englishword.isEmpty() && !morseWord.isEmpty()){//if the field are not empty
            PreparedStatement stmt = con.prepareStatement("EXEC InsertHistory ?,?,?");//excute a stored procedure to insert the data
            stmt.setString(1, Englishword);//setting the values where there is ? in the query 
            stmt.setString(2, morseWord);//setting the values where there is ? in the query 
            stmt.setString(3, ld.toString());//setting the values where there is ? in the query 
            stmt.executeUpdate();//excusting the update on the table
             return true;
          }else{
              flagSuccess = false;
          }
        con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
         return flagSuccess;
    }
    
    /**
     * 
     * @param t
     * @return boolean
     * function that tries to first establish a connection if it fails it will throw and exception if not
     * it will extract the data from searchHistory table by using our userSearchHistory class object to organize the table and the data
     * and then populate that data to our JTable
     */
    public boolean populateConversionHistory(JTable t){
      ArrayList<project_classes.userSearchHistory> histroyData = new ArrayList<>();

       try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//grabbing the connection URL
          String url="jdbc:sqlserver://localhost:1433;DatabaseName=javaApp;user=IBRAHIM;password=12345";//fillign the connection details
          Connection con= DriverManager.getConnection(url);//connection object that tries to establish the connection
          String query1 = "SELECT EnglishWord,MorseWord,ConversionDate FROM searchHistory";//Sql query
          PreparedStatement pst = con.prepareStatement(query1);//preprared stmt that tries to execute the query
          ResultSet rs = pst.executeQuery();//Excuting the query
          while(rs.next()){//while there is connection and results in the table
              //we instantiate an arrya list of userSearchHistory class and grab the vlaues from the table column by column by the help also of the memebr methods in userSearchHistory class
              project_classes.userSearchHistory uL = new project_classes.userSearchHistory(rs.getString("EnglishWord"),rs.getString("MorseWord"),rs.getString("ConversionDate"));
              histroyData.add(uL);
          }
          if(histroyData.isEmpty()){
              JOptionPane.showMessageDialog(null, "No Data to Show Convert words first to see Data");
          }
          
           DefaultTableModel model = (DefaultTableModel)t.getModel();//DefaultTableModel to get the model to popultev our JTable
           Vector<Object> row = new Vector<Object>();//tmeporary vector to hold the values
           for(int i=0; i < histroyData.size();i++){
            row = new Vector<Object>();
           row.add(histroyData.get(i).getEnglishWord());
           row.add(histroyData.get(i).getMorseWord());
           row.add(histroyData.get(i).getDateS()); 
            model.addRow(row);//adding the rows ot our table
        }
          
        con.close();
        }
        catch(Exception e){//throw an exception if the extraction or the connection is failed
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;
        }
       return true;
    }
}

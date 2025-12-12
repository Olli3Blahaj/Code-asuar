/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.asaurs;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.*;
/**
 *
 * @author Ocb19f
 */
public class Func {
   public static boolean Length(String val,int max){
        return val.length() != max;
    }
    public static boolean Present(String val){
        return val.isBlank();
    }
    public static boolean Range (String val,int min,int max){
        return val.length()>min && val.length()<max;
    }
    public static boolean FormatEmail (String val){
        return val.contains("@")&&val.endsWith(".com")||val.endsWith(".co.uk")||val.endsWith(".net")||val.endsWith(".gov");
    }
    public static boolean lookup (String val){
        //In process
        return false;
    }
    
    public static boolean TypeInt(String val){
           try {
            Integer.parseInt(val);
             return true;
            } 
            catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean TypeFloat(String val){
       try {
             Float.parseFloat(val);
             return true;
            } 
            catch (NumberFormatException e) {
            return false;
        }
    }    
    public static int getNewUniqueId() {
        File file = new File("User.txt");

        // If file doesn't exist, ID is 1
        if (!file.exists()) {
            return 1;
        }

        try {
            long lineCount = Files.lines(file.toPath()).count();
            return (int) lineCount + 1;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return -1; // error
    }

    public static int addNewEntry(String data) {
        int newId = getNewUniqueId();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("User.txt", true))) {
            writer.write(newId + ": " + data);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newId;
    }
    public static int AddPage(String name,String tags,String context){
        // save the file loctians
         try (BufferedWriter writer = new BufferedWriter(new FileWriter("Code-asaursIndex.txt", true))) {
            writer.write(name+"/"+"0"+"unrated"+"/"+tags);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // to make the the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name+".txt", true))) {
            writer.write(name+"/"+"0"+"unrated"+"/"+tags+"*");
            writer.newLine();
            writer.write(context);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
       return 0;
        
    }
    public static int Searchofpages(String tags){
       
       return 0;
        
    }
}
   
  



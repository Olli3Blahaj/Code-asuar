/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.asaurs;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
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
    public static void FileWriter(String val){
       FileWriter fw = null;
       try {
           fw = new FileWriter("User.txt",true);
           BufferedWriter bw =new BufferedWriter(fw);
           bw.write(val);
           bw.newLine();
           bw.close();
       } catch (IOException ex) {
           System.getLogger(Func.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
       } finally {
           try {
               fw.close();
           } catch (IOException ex) {
               System.getLogger(Func.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
           }
       }
    }
    private static final String FILE_PATH = "User.text";

    public static int getNewUniqueId() {
        File file = new File(FILE_PATH);

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

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(newId + ": " + data);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newId;
    }
}

  



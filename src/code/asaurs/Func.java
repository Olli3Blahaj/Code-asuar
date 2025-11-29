/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.asaurs;
import java.awt.*;
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
        return Integer.parseInt(val)>min && Integer.parseInt(val)<max;
    }
    public static boolean FormatEmail (String val){
        return val.contains("@")||val.endsWith(".com")||val.endsWith(".co.uk")||val.endsWith(".net")||val.endsWith(".gov");
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
}
  



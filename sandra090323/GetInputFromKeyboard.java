/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sandra280323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author hp
 */
public class GetInputFromKeyboard {
    public static void main(String[]args){
        BufferedReader dataIn =new BufferedReader( new InputStreamReader(System.in)); 
        String name ="";
        int umur = 0;
       
       try{
            System.out.println("Please Enter Your Name : ");
              name= dataIn.readLine();
               System.out.println("Age : ");
               umur = Integer.parseInt(dataIn.readLine());
       }catch(IOException ex) {
                 System.out.println("Error!");
       }
        System.out.println("Hello"+name+"!");
        System.out.println("Umur Anda"+umur+"!");
    }
    
}

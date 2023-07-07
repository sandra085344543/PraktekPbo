/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sandra280323;

/**
 *
 * @author hp
 */
public class Aritmatika {
    
 public int tambah(int a, int b){
 return a+b;
}

public boolean cekGanjil(int a){
  return(a%2==1);
}

public static void main(String[]args){
    //Aritmatika adalah class sedangkan aritmatika adalah objek 
   Aritmatika aritmatika = new Aritmatika();
   //tambah adalah method 
   int c = aritmatika.tambah(12,7 );
   
   System.out.println("Nilai C = "+c);
   System.out.println("Ganjil ? " +aritmatika.cekGanjil(c));
}
}
   

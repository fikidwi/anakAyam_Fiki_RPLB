/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiki_anakayam_rplb;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Fiki_anakAyam_rplB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a,c;
        
        System.out.println("Masukkan angka = ");
        a=sc.nextInt();
        
        for (c=1;c<a;){
            System.out.println("Hehe Hehe Hehe.....");
            System.out.println("Anak ayam turun " +a);
            System.out.println(" mati " +c);
            a=a-c;
            System.out.println(" tinggal " +a);
        }
        System.out.println("Anak ayam turun "+a);
        System.out.println(" mati " +c);
        System.out.println("tinggal induknya");
    }
    
}

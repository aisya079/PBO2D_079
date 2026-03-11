/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;
import java.util.Scanner;
/**
 *
 * @author aisyah ramadhani
 */
public class java {

    
    private String nama;
    private int umur;
    private String jurusan;

    public java(String nama, int umur, String jurusan) {
        
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }


    public void displayInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("Jurusan : " + jurusan);
    }

    public static void main(String[] args) {

        
        java mhs1 = new java("aisya", 19, "Pendidikan Informatika");

      
        mhs1.displayInfo();
    }
}
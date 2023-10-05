/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * author yazid arroji
 * nim 1908896
 */

package com.mycompany.palindrom;

import java.util.Scanner;

/**
 *
 * @author yazidarroji
 */
public class Palindrom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = scanner.nextInt();
        if (cekPalindrom(bilangan)) {
            int cekBilanganBulat = bilangan%2;
            if(cekBilanganBulat != 0){
                System.out.println("Anda Diminta untuk memasukan bilangan bulat palindrom bukan bilangan ganjil");
                System.out.println("Coba lagi dengan memasukan bilangan bulat palindrom!");
            }else{
                System.out.println("Hasil reverse bilangan adalah  "+balik(bilangan));   
                System.out.println(bilangan + " adalah bilangan palindrom.");
            }
        } else {
                //logic untuk menampilkan reverse ketika use memasukan akhir digit 0
                String kata ="";
                String strBilangan = String.valueOf(bilangan);
                for (int i = strBilangan.length() - 1; i >= 0; i--){
                    char ch = strBilangan.charAt(i);
                    if (ch == '0') {
                        kata += "0";
                    }else{
                        kata += ch;
                    }
                }
            System.out.println("Hasil reverse bilangan adalah "+kata);   
            System.out.println(bilangan + " bukan bilangan palindrom.");

        }
    }
    // Mengembalikan nilai true jika bilangan hasilnya palindrom
    public static boolean cekPalindrom(int bilangan) {
        return bilangan == balik(bilangan);
    }

    // Mengembalikan reversal integer, contoh: reverse(456) hasilnya 654
    public static int balik(int bilangan) {
            int hasil = 0;
            while (bilangan > 0) {  
                int digitTerakhir = bilangan % 10;
                hasil = hasil * 10 + digitTerakhir;
                //untuk membagi nilai dari variabel dengan suatu nilai dan kemudian menyimpan hasilnya kembali ke variabel itu sendiri
                bilangan /= 10;
            }
            return hasil;
    }
}

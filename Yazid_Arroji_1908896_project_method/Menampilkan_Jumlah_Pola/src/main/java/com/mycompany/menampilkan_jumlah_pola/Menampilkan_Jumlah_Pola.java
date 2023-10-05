/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * author yazid arroji
 * nim 1908896
 */

package com.mycompany.menampilkan_jumlah_pola;

import java.util.Scanner;

/**
 *
 * @author yazidarroji
 */
public class Menampilkan_Jumlah_Pola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();
        menampilkanPola(n);
    }

    public static void menampilkanPola(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

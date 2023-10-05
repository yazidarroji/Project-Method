/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * author yazid arroji
 * nim 1908896
 */

package com.mycompany.jumlah_digit;

import java.util.Scanner;

/**
 *
 * @author yazidarroji
 */
public class Jumlah_digit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        long bilangan = scanner.nextLong();

        int totalDigit = jumlahDigit(bilangan);

        System.out.println("Jumlah digit dalam bilangan adalah: " + totalDigit);
    }

    public static int jumlahDigit(long n) {
        int total = 0;

        while (n != 0) {
            int digit = (int) (n % 10); // Ambil digit terakhir
            total += digit; // Tambahkan ke total
            n /= 10; // Hapus digit terakhir
        }

        return total;
    }
}

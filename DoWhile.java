/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgdo.pkgwhile;

/**
 *
 * @author vanti
 */import java.util.Scanner;
public class DoWhile {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so nguyen bat ky: ");
        int n = input.nextInt();
        int ketqua = 1;
        int i = 1;
        do {
            ketqua = ketqua * i;
            i++;
        } while (i <= n);
        System.out.printf("\nGiai thua cua %d la: %d", n, ketqua);
        input.close();
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switichcase;

/**
 *
 * @author vanti
 */import java.util.Scanner;

public class Switichcase {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so bat ky tu 1-3: ");
        int n = input.nextInt();
        switch (n) {
            case 1:
                System.out.println("\nMot");
                break;
            case 2:
                System.out.println("\nHai");
                break;
            case 3:
                System.out.println("\nBa");
                break;
            default:
                System.out.println("\nERROR");
                break;
        }
        input.close();
    }
}



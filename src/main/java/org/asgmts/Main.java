package org.asgmts;
import java.util.Scanner;
/**
 *
 * @author bahaa
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Prime num = new Prime();

        System.out.print("Pleas enter a Number: ");
        int numX = scan.nextInt();
        num.setNum(numX);
        num.checkP();

    }

}
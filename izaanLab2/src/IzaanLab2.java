/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * author Izaan Syed
 * date Feb. 22, 2023
 * ProjectName izaanLab2
 * Description Loop lab
 */

public class IzaanLab2 {
public static Scanner scan = new Scanner(System.in);
public static int intUserSelection; // program selection
//public static String inputPostalCode;
public static boolean isNumeric(String str) { // https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java
    try {
        Double.parseDouble(str);
        return true;
    } catch(NumberFormatException e){
        return false;
    }
    }


public static void main(String[] args) {


    while (true) {
        System.out.println("Enter corresponding integer (1 = Postal code, 2 = Multiplication table, 3 = Quit)");
        try {
            intUserSelection = Integer.parseInt(scan.nextLine());
            if (intUserSelection == 1 || intUserSelection == 2 || intUserSelection == 3) break;
            System.out.println("Bad number u idiot");
        } catch (Exception e) {
            System.out.println("Not a number u idiot");
        }
    }

    switch (intUserSelection) {
        case 1 -> {
            while (true) {
                System.out.println("postal code program");
                boolean validFormat = true;
                String inputPostalCode = (scan.nextLine());
                String[] inputPostalCode2 = inputPostalCode.split("");
                System.out.println(Arrays.toString(inputPostalCode2));
                if (inputPostalCode.length() > 7) {
                    System.out.println("your postal code was too long");
                }

                // Checks if format of postal code is correct (A1A 1A1)
                if (isNumeric(inputPostalCode2[0])) {
                    System.out.println("your postal code has a number in the first spot");
                    validFormat = false;
                }
                if (!isNumeric(inputPostalCode2[1])) {
                    System.out.println("your postal code has a letter in the second spot");
                    validFormat = false;
                }
                if (isNumeric(inputPostalCode2[2])) {
                    System.out.println("your postal code has a number in the third spot");
                    validFormat = false;
                }
                if (!isNumeric(inputPostalCode2[4])) {
                    System.out.println("your postal code has a letter in the fourth spot");
                    validFormat = false;
                }
                if (isNumeric(inputPostalCode2[5])) {
                    System.out.println("your postal code has a number in the fifth spot");
                    validFormat = false;
                }
                if (!isNumeric(inputPostalCode2[6])) {
                    System.out.println("your postal code has a letter in the sixth spot");
                    validFormat = false;
                }
                System.out.println("your postal code was " + inputPostalCode);
                if (validFormat) {
                    System.out.println("your postal code was valid");
                    break;
                } else {
                    System.out.println("your postal code was invalid. please try again");
                }
            }

        }


    case 2 ->{
        while (true) {
            System.out.println("multiplication program");
            try{
                String inputMultiplication = (scan.nextLine());
                int number = Integer.parseInt(inputMultiplication);
                for (int i = 1; i <= 12; i++) {
                    System.out.println(number + " x " + i + " = " + (i * number));
                }
                break;
            }catch(Exception e){
                System.out.println("bad input u buffoon");
                }
            }
        }

    case 3 ->{
        System.out.println("u quitted");
        System.exit(0);
    }
}
}
}

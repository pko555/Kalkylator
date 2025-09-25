import java.awt.*;
import java.util.Scanner;

public class Kalkylator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Välkommmen till Kalkylatorn");

        while(true){

            System.out.println("Vad vill du räkna idag?" + " " + "Välj ett alternativ");
            System.out.println("1. Addition +");
            System.out.println("2. Subtrahera -");
            System.out.println("3. Multiplikation *");
            System.out.println("4. Division /");
            System.out.println("0. Avsluta");

            int val =  input.nextInt();
            switch(val)
            {
                case 1:
                    System.out.println("Du valde 1. Addition +");
                    System.out.println("Skriv ditt första tal!");
                    int tal1 = input.nextInt();
                    System.out.println("Skriv ditt andra tal!");
                    int tal2 = input.nextInt();
                    int sum = tal1 + tal2;
                    System.out.println("Resultatet blev:" + sum);

                    break;

                case 2:
                    System.out.println("Du valde 2. Subtrahera -");
                    System.out.println("Skriv in ditt första tal!");
                    int tal3 = input.nextInt();
                    System.out.println("Skriv ditt andra tal!");
                    int tal4 = input.nextInt();
                    int result = tal3 - tal4;
                    System.out.println("Resultatet blev:" + result);

                    break;

                case 3:
                    System.out.println("Du valde 3. Multiplikation *");
                    System.out.println("Skriv in ditt första tal!");
                    int tal5 = input.nextInt();
                    System.out.println("Skriv ditt andra tal!");
                    int tal6 = input.nextInt();
                    int sum2 = tal5 * tal6;
                    System.out.println("Resultatet blev:" + sum2);

                    break;

                case 4:
                    System.out.println("Du valde 4. Division /");
                    System.out.println("Skriv in ditt första tal!");
                    int tal7 = input.nextInt();
                    System.out.println("Skriv ditt andra tal!");
                    int tal8 = input.nextInt();
                    double sum3  = (double) tal7 / tal8;
                    if (tal8 == 0) {
                        System.out.println("Det går tyvärr inte att dela med 0 Försök igen!");
                    }
                    else {
                        System.out.println("Resultatet blev:" + sum3);
                    }

                    break;

                case 0:
                    System.out.println("Du har valt att avsluta programmet! Ha en bra dag! ");
                    return;
                default:
                    System.out.println("Oj du måste tryckt på fel knapp testa igen med en siffra!");

                    break;




            }




        }




    }
}

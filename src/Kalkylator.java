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
                    System.out.println("Resultatet är:" + sum);

                    break;
                case 2:
                    System.out.println("Du valde 2. Subtrahera -");
                    System.out.println("Skriv in ditt första tal!");
                    int tal3 = input.nextInt();
                    System.out.println("Skriv ditt andra tal!");
                    int tal4 = input.nextInt();
                    int result = tal3 - tal4;
                    System.out.println("Resultatet är:" + result);
                    break;
                case 3:
                    System.out.println("Du valde 3. Multiplikation *");
                    break;
                case 4:
                    System.out.println("Du valde 4. Division /");
                    break;
                case 0:
                    System.out.println("Du har valt att avsluta programmet! Ha en bra dag! ");
                    return;
                default:
                    System.out.println("Oj du måste tryckt på fel knapp testa igen med en siffra mellan 4 till 0");
                    break;




            }




        }




    }
}

package Es1;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numeroRettangoli;
        Rettangle[] rettangoli;


        System.out.println("Inserisci quanti rettangoli vuoi creare:");
        numeroRettangoli = Integer.parseInt(scanner.nextLine());
        rettangoli = new Rettangle[numeroRettangoli];

        for (int i = 0; i < numeroRettangoli; i++) {
            long base = rand.nextLong(1, 100);
            long altezza = rand.nextLong(1, 1000);
            Rettangle rettangle = new Rettangle(base, altezza);
            System.out.println("base:\t" + rettangle.getBase() + " " + "altezza:\t" + rettangle.getHeight()
                    + " " + "Perimetro:\t" + rettangle.getPerimeter() + " " + "Area:\t" + rettangle.getArea());
            rettangoli[i] = rettangle;

        }

        {
            long resultArea = 0;
            long resultPerimeter = 0;

            for (Rettangle rettangle : rettangoli) {
                long retArea = rettangle.getArea();
                long retPerimeter = rettangle.getPerimeter();
                resultArea = resultArea + retArea;
                resultPerimeter = resultPerimeter + retPerimeter;
                //System.out.println(resultArea);
            }

            System.out.println("La somma delle aree è:\t" + resultArea);
            System.out.println("La somma dei perimetri è:\t" + resultPerimeter);
        }


    }


}

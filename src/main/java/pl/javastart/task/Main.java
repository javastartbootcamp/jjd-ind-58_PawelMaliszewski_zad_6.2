package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        System.out.println("Podaj rozmiar tablicy:");
        int arraySize = sc.nextInt();
        sc.nextLine();

        double[] arrays = new double[arraySize];

        System.out.println("Wprowadź " + arraySize + " liczb:");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = sc.nextDouble();
        }

        for (double array : arrays) {
            sum += array * array;
        }
        System.out.println("Suma kwadratów wprowadzonych liczb to " + sum);
        sc.close();
    }
}

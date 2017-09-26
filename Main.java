import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int numCars = 0;
        int numWheels = 0;
        int numLights = 0;

        numCars = scnr.nextInt();
        numWheels = numCars * 4;
        numLights = numCars * 2;

        System.out.println("There are " + numCars + " cars.");
        System.out.println("There are " + numWheels + " wheels.");
        System.out.println("There are " + numLights + " lights.");

    }
}
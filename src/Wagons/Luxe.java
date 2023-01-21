package Wagons;

import Passengers.Passenger;

import java.util.Scanner;

public class Luxe extends Wagon {

    public Luxe(int id, int numberOfSeats, double price) {
        super(id, numberOfSeats, price);
    }

    private int[] seats = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1};

    public void takeSeat(int i) {
        seats[i] = 1;
    }


    public int[] getSeats() {
        return this.seats;
    }

    @Override
    public void services() {
        super.services();
        System.out.println("""
                3. Order food.
                4. Cleaning.
                5. Pack luggage.""");
    }

    @Override
    public void showSeats() {
        System.out.println("You've chosen \"Luxe\" wagon class.");
        for (int i = 0; i < this.getNumberOfSeats(); i++) {
            if (this.getSeats()[i] == 0 && i + 1 < 10)
                System.out.print(" " + (i + 1) + "□ ");
            else if (this.getSeats()[i] == 0 && i + 1 >= 10)
                System.out.print((i + 1) + "□ ");
            else if (this.getSeats()[i] == 1 && i + 1 < 10)
                System.out.print(" " + (i + 1) + "■ ");
            else
                System.out.println((i + 1) + "■ ");
            if ((i + 1) % 2 == 0) {
                System.out.println();
            }
        }
    }

    @Override
    public int chooseSeat() {
        Scanner scanner = new Scanner(System.in);
        int seatChoice;
        System.out.print("Please choose your seat: ");
        while (true) {
            seatChoice = scanner.nextInt() - 1;
            if (this.getSeats()[seatChoice] == 0) {
                this.takeSeat(seatChoice);
                break;
            } else {
                System.out.println("This sit has already been taken. Please, choose another sit.");
            }
        }
        return seatChoice;
    }
}

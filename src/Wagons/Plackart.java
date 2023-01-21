package Wagons;

import java.util.Scanner;

public class Plackart extends Wagon {

    public Plackart(int id, int numberOfSeats, double price) {
        super(id, numberOfSeats, price);
    }

    private int[] seatsPlackart = {1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1};

    public void takeSeat(int i) {
        this.seatsPlackart[i] = 1;
    }

    public int[] getSeatsPlackart() {
        return this.seatsPlackart;
    }


    @Override
    public void showSeats() {
        boolean spaceOrEnter1 = false;
        System.out.println("You've chosen \"Plackart\" wagon class.");
        for (int i = 0; i < getNumberOfSeats(); i++) {
            if (this.getSeatsPlackart()[i] == 0 && i + 1 < 10)
                System.out.print(" " + (i + 1) + "□ ");
            else if (this.getSeatsPlackart()[i] == 0 && i + 1 >= 10)
                System.out.print((i + 1) + "□ ");
            else if (this.getSeatsPlackart()[i] == 1 && i + 1 < 10)
                System.out.print(" " + (i + 1) + "■ ");
            else
                System.out.print((i + 1) + "■ ");
            if ((i + 1) % 2 == 0 && !spaceOrEnter1) {
                System.out.print("    ");
                spaceOrEnter1 = true;
            } else if ((i + 1) % 2 == 0 && spaceOrEnter1) {
                System.out.println();
                spaceOrEnter1 = false;
            }
        }
    }

    @Override
    public int chooseSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose your seat: ");
        int seatChoice;
        while (true) {
            seatChoice = scanner.nextInt() - 1;
            if (this.getSeatsPlackart()[seatChoice] == 0) {
                this.takeSeat(seatChoice);
                break;
            } else {
                System.out.println("This sit has already been taken. Please, choose another sit.");
            }
        }
        return seatChoice;
    }
}

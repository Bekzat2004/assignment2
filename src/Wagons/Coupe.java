package Wagons;

import java.util.Scanner;

public class Coupe extends Wagon {
    public Coupe(int id, int numberOfSeats, double price) {
        super(id, numberOfSeats, price);
    }

    private int[] seatsCoupe = {0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1
    };

    public void takeSeat(int i) {
        this.seatsCoupe[i] = 1;
    }

    public int[] getSeatsCoupe() {
        return this.seatsCoupe;
    }


    @Override
    public void showSeats() {
        boolean spaceOrEnter = false;
        System.out.println("You've chosen \"Coupe\" wagon class.");
        for (int i = 0; i < this.getNumberOfSeats(); i++) {
            if (this.getSeatsCoupe()[i] == 0 && i + 1 < 10)
                System.out.print(" " + (i + 1) + "□ ");
            else if (this.getSeatsCoupe()[i] == 0 && i + 1 >= 10)
                System.out.print((i + 1) + "□ ");
            else if (this.getSeatsCoupe()[i] == 1 && i + 1 < 10)
                System.out.print(" " + (i + 1) + "■ ");
            else
                System.out.print((i + 1) + "■ ");
            if ((i + 1) % 2 == 0 && !spaceOrEnter) {
                System.out.print("    ");
                spaceOrEnter = true;
            } else if ((i + 1) % 2 == 0 && spaceOrEnter) {
                System.out.println();
                spaceOrEnter = false;
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
            if (this.getSeatsCoupe()[seatChoice] == 0) {
                this.takeSeat(seatChoice);
                break;
            } else {
                System.out.println("This sit has already been taken. Please, choose another sit.");
            }
        }
        return seatChoice;
    }
}

package Wagons;

import Trains.Lokomotiv;

public abstract class Wagon{
    private final int id;
    private int numberOfSeats;
    private double price;
    public Wagon(int id, int numberOfSeats, double price) {
        this.id = id;
        this.numberOfSeats = numberOfSeats;
        this.price = price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getPrice() {
        return price;
    }

    public void services() {
        System.out.println("1. Cleaning." +
                "\n2. Delivery of bed linen.");
    }

    public abstract void showSeats();

    public abstract int chooseSeat();

}

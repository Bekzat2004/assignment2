package Passengers;
import java.util.Scanner;

public class Passenger {
    Scanner scanner = new Scanner(System.in);
    private static int id;
    private String number;
    private String fullName;

    private String citizenship;
    private int age;
    private boolean disabled;
    private String wagonClass;
    private int seatNumber;
    private double price;

    public Passenger(int id, String number, String fullName, String nationality, int age, boolean disabled, String wagonClass, int seatNumber, double price) {
        this.id = id;
        this.number = number;
        this.fullName = fullName;
        this.citizenship = nationality;
        this.age = age;
        this.disabled = disabled;
        this.wagonClass = wagonClass;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public int getAge() {
        return age;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public static void setId(int id) {
        Passenger.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void inputFullName() {
        this.fullName = scanner.nextLine();
        this.setFullName(fullName);
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getWagonClass() {
        return wagonClass;
    }

    public void setWagonClass(String wagonClass) {
        this.wagonClass = wagonClass;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void buyTicket() {
        System.out.println("You want to buy ticket. Please choose your carriage class: \nLuxe \nCoupe \nReserved seat");
    }

   /* public String checkTicket(Passenger passenger) {
        System.out.println("Here's your ticket:\nNumber: " + passenger.getNumber() + "\nFull name: " +
                passenger.getFullName() + "\nCitizenship: " + passenger.getCitizenship() + "\nAge: " +
                passenger.getAge() + "\nDisabled: " + passenger.isDisabled() + "\nWagon class: " +
                passenger.getWagonClass() + "\nSeat: " + (int) (passenger.getSeatNumber() + 1) + "\nPrice: " +
                passenger.getPrice());
        return null;
    }*/

}

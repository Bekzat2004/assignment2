import Passengers.Passenger;
import Trains.Lokomotiv;
import Trains.Train058X;
import Trains.Talgo052X;
import Wagons.Coupe;
import Wagons.Luxe;
import Wagons.Plackart;
import Wagons.Wagon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Talgo052X talgo = new Talgo052X("120km/h", 25, "AKX->AST");
        Train058X passengerTrain = new Train058X("60km/h", 45, "SHY->ALY");
        Luxe luxe = new Luxe(1, 12, 23000);
        Coupe coupe = new Coupe(2, 24, 14000);
        Plackart plackart = new Plackart(3, 36, 7000);
        tickets.add(new Ticket(new Passenger(1, "87751086440", "Bekzat", "Kazakh", 18, false, "luxe", 1, 23000), talgo, luxe));
        tickets.add(new Ticket(new Passenger(2, "87348572389", "Bala", "Kazakh", 8, false, "plackart", 2, 7000), passengerTrain, plackart));
        tickets.add(new Ticket(new Passenger(3, "87734523452", "Ramin", "Korean", 18, false, "coupe", 4, 14000), talgo, coupe));
        tickets.add(new Ticket(new Passenger(4, "82389457982", "Mustafa", "Kazakh", 19, false, "plackart", 8, 7000), talgo, plackart));
        tickets.add(new Ticket(new Passenger(5, "87239845723", "Asset", "Chinese", 18, true, "luxe", 5, 0), passengerTrain, luxe));
        tickets.add(new Ticket(new Passenger(6, "87123947626", "Bekzhan", "Kazakh", 17, false, "coupe", 3, 14000), talgo, coupe));
        tickets.add(new Ticket(new Passenger(7, "87123476921", "Tair", "Kazakh", 18, false, "luxe", 2, 23000), talgo, luxe));
        tickets.add(new Ticket(new Passenger(8, "81345791763", "Muha", "Kazakh", 17, false, "plackart", 9, 7000), passengerTrain, plackart));
        tickets.add(new Ticket(new Passenger(9, "81345736778", "Damir", "Kazakh", 17, false, "coupe", 10, 14000), passengerTrain, coupe));
        tickets.add(new Ticket(new Passenger(10, "87123412342", "Nurbakhyt", "Kazakh", 18, false, "luxe", 3, 23000), talgo, luxe));
        tickets.add(new Ticket(new Passenger(11, "87751086440", "Andrey", "Russinan", 12, true, "luxe", 7, 0), passengerTrain, luxe));
        tickets.add(new Ticket(new Passenger(12, "83450923458", "Madiyar", "Kazakh", 18, true, "plackart", 36, 0), passengerTrain, luxe));
        tickets.add(new Ticket(new Passenger(13, "81231233546", "Dmitriy", "Russian", 67, false, "luxe", 1, 23000), talgo, luxe));
        tickets.add(new Ticket(new Passenger(14, "81203571892", "Beks", "Kazakh", 18, false, "luxe", 3, 23000), talgo, luxe));
        tickets.add(new Ticket(new Passenger(15, "87312312389", "XDBeks", "Kazakh", 17, false, "plackart", 19, 7000), passengerTrain, plackart));
        tickets.add(new Ticket(new Passenger(16, "87734134222", "Fatima", "Kazakh", 17, false, "coupe", 10, 14000), talgo, coupe));
        tickets.add(new Ticket(new Passenger(17, "81234566982", "Aruzhan", "Kazakh", 19, false, "plackart", 11, 7000), talgo, plackart));
        tickets.add(new Ticket(new Passenger(18, "87239624123", "Dauren", "Chinese", 19, true, "luxe", 9, 0), passengerTrain, luxe));
        tickets.add(new Ticket(new Passenger(19, "87123124216", "Dair", "Kazakh", 19, false, "coupe", 13, 14000), talgo, coupe));
        tickets.add(new Ticket(new Passenger(20, "87123473221", "Eskendir", "Kazakh", 18, false, "luxe", 12, 23000), talgo, luxe));
        tickets.add(new Ticket(new Passenger(21, "81613441763", "Sayat", "Kazakh", 18, false, "plackart", 12, 7000), passengerTrain, plackart));
        tickets.add(new Ticket(new Passenger(22, "82345342378", "Tileukhan", "Kazakh", 19, false, "coupe", 11, 14000), passengerTrain, coupe));
        tickets.add(new Ticket(new Passenger(23, "87123412342", "Nurkanat", "Kazakh", 18, false, "luxe", 10, 23000), talgo, luxe));
        tickets.add(new Ticket(new Passenger(24, "87712353530", "James", "Pendos", 12, true, "luxe", 8, 0), passengerTrain, luxe));
        tickets.add(new Ticket(new Passenger(25, "83451233458", "Adilkan", "Kazakh", 20, false, "plackart", 35, 7000), passengerTrain, luxe));
        tickets.add(new Ticket(new Passenger(26, "81231223546", "Erzen", "Kazakh", 18, false, "luxe", 7, 23000), talgo, luxe));
        tickets.add(new Ticket(new Passenger(27, "81235123521", "Miras", "Kazakh", 20, false, "luxe", 6, 23000), talgo, luxe));
        tickets.add(new Ticket(new Passenger(28, "81202342353", "Daniyar", "Kazakh", 18, false, "luxe", 5, 23000), talgo, luxe));
        tickets.add(new Ticket(new Passenger(29, "87234123432", "Zhangeldy", "Kazakh", 19, false, "plackart", 27, 7000), passengerTrain, plackart));
        tickets.add(new Ticket(new Passenger(30, "87234523455", "Merey", "Kazakh", 19, false, "coupe", 16, 14000), talgo, coupe));
        tickets.add(new Ticket(new Passenger(31, "82389457982", "Haknazar", "Kazakh", 18, false, "plackart", 13, 7000), talgo, plackart));
        tickets.add(new Ticket(new Passenger(32, "87239845723", "Aiym", "Kazakh", 18, false, "luxe", 7, 23000), passengerTrain, luxe));
        tickets.add(new Ticket(new Passenger(33, "87635734564", "Ruslan", "Russian", 22, false, "coupe", 19, 14000), talgo, coupe));
        tickets.add(new Ticket(new Passenger(34, "87123476921", "Timur", "Uzbek", 19, false, "luxe", 8, 23000), talgo, luxe));
        tickets.add(new Ticket(new Passenger(35, "81345791763", "Kirill", "Russian", 44, false, "plackart", 31, 7000), passengerTrain, plackart));
        tickets.add(new Ticket(new Passenger(36, "81345736778", "Leonardo", "Mexican", 123, true, "coupe", 24, 0), passengerTrain, coupe));
        tickets.add(new Ticket(new Passenger(37, "87324123423", "Tom", "Jerry", 5, false, "luxe", 12, 23000), talgo, luxe));
        tickets.add(new Ticket(new Passenger(38, "87234235234", "Billie", "Pendos", 25, true, "luxe", 4, 0), passengerTrain, luxe));
        tickets.add(new Ticket(new Passenger(39, "83345234234", "Kanat", "Kazakh", 23, false, "plackart", 33, 7000), passengerTrain, luxe));
        tickets.add(new Ticket(new Passenger(40, "81632423142", "Aidana", "Kazakh", 15, false, "luxe", 5, 23000), talgo, luxe));
        boolean isContinue = true;
        int count = 0;
        while (isContinue) {
            System.out.print("""
                    Menu:
                    1. Buy ticket
                    2. Remove ticket
                    3. Close the menu
                    """);
            int choice = scanner.nextInt();
            int id;
            switch (choice) {
                case 1 -> {
                    System.out.println("""
                            Choose the train: \s
                            1 - Talgo 052X
                            2 - Train 058X
                            """);
                    int trainChoice = scanner.nextInt();
                    System.out.println("Fill in your personal details:");
                    System.out.print("Full name: ");
                    String fullName = scanner.next();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    System.out.print("Citizenship: ");
                    String citizenship = scanner.next();
                    System.out.print("Number: ");
                    String number = scanner.next();
                    System.out.print("ID: ");
                    id = scanner.nextInt();
                    System.out.print("Disabled(True/False): ");
                    boolean disabled = scanner.nextBoolean();
                    if (trainChoice == 1) {
                        Lokomotiv tempLokomotiv = talgo;
                        System.out.println("""
                                Choose wagon class:\s
                                1 - Plackart
                                2 - Coupe
                                3 - Luxe""");
                        int wagonChoice = scanner.nextInt();

                        if (wagonChoice == 3) {
                            Wagon tempWagon = luxe;
                            luxe.showSeats();
                            int seatChoice = luxe.chooseSeat();
                            if (disabled) {
                                tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Luxe", seatChoice, 0)), tempLokomotiv, tempWagon));
                            } else
                                tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Luxe", seatChoice, luxe.getPrice())), tempLokomotiv, tempWagon));
                        } else if (wagonChoice == 2) {
                            Wagon tempWagon = coupe;
                            coupe.showSeats();
                            int seatChoice = coupe.chooseSeat();
                            if (disabled) {
                                tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Coupe", seatChoice, 0)), tempLokomotiv, tempWagon));
                            } else
                                tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Coupe", seatChoice, coupe.getPrice())), tempLokomotiv, tempWagon));
                        } else if (wagonChoice == 1) {
                            Wagon tempWagon = plackart;
                            plackart.showSeats();
                            int seatChoice = plackart.chooseSeat();
                            if (disabled) {
                                tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Plackart", seatChoice, 0)), tempLokomotiv, tempWagon));
                            } else {
                                tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Plackart", seatChoice, plackart.getPrice())), tempLokomotiv, tempWagon));
                            }
                        }

                        System.out.println(tickets.get(count).checkTicket(tickets, count));
                        count++;
                    } else if (trainChoice == 2) {
                        Lokomotiv tempLokomotiv = talgo;
                        System.out.println("""
                                Choose wagon class:\s
                                1 - Plackart
                                2 - Coupe
                                3 - Luxe""");
                        int wagonChoice = scanner.nextInt();

                        if (wagonChoice == 3) {
                            Wagon tempWagon = luxe;
                            luxe.showSeats();
                            int seatChoice = luxe.chooseSeat();
                            if (disabled) {
                                tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Luxe", seatChoice, 0)), tempLokomotiv, tempWagon));
                            } else
                                tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Luxe", seatChoice, luxe.getPrice())), tempLokomotiv, tempWagon));
                        } else if (wagonChoice == 2) {
                            Wagon tempWagon = coupe;
                            coupe.showSeats();
                            int seatChoice = coupe.chooseSeat();
                            if (disabled) {
                                tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Coupe", seatChoice, 0)), tempLokomotiv, tempWagon));
                            } else
                                tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Coupe", seatChoice, coupe.getPrice())), tempLokomotiv, tempWagon));
                        } else if (wagonChoice == 1) {
                            Wagon tempWagon = plackart;
                            plackart.showSeats();
                            int seatChoice = plackart.chooseSeat();
                            if (disabled) {
                                tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Plackart", seatChoice, 0)), tempLokomotiv, tempWagon));
                            } else {
                                tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Plackart", seatChoice, plackart.getPrice())), tempLokomotiv, tempWagon));
                            }
                        }
                        System.out.println(tickets.get(count).checkTicket(tickets, count));
                        count++;
                    }

                }

                case 2 -> {
                    boolean foundOrNot = false;
                    System.out.println("To change your ticket, please enter your id:");
                    id = scanner.nextInt();
                    for (int i = 0; i < tickets.size(); i++) {
                        if (tickets.get(i).passenger.getId() == id) {
                            String ticketInfo = tickets.get(i).checkTicket(tickets, i);
                            System.out.println(ticketInfo);
                            System.out.println("Here's your current ticket. Are you sure you want to remove it?");
                            foundOrNot = true;
                            String answer = scanner.next();
                            if (answer.equals("yes")) {
                                tickets.remove(i);
                                System.out.println("Your ticket has been removed!");
                            } else {
                                break;
                            }
                        }
                    }
                    if (foundOrNot == false) {
                        System.out.println("Your id cannot be found.");
                    }
                }
                case 3 -> {
                    isContinue = false;
                }
            }
        }
    }
}

/*
добавить методы в отдельные классы вагонов
Поменять билет
Арраулист оф пассанджерс(40 объектов)
 */

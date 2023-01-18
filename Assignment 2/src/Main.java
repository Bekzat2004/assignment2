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

        boolean isContinue = true;

        int count = 0;
        while (isContinue) {
            System.out.print("""
                    Menu:
                    1. Buy ticket
                    2. Change ticket
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
                    System.out.println("To change your ticket, please enter your id:");
                    id = scanner.nextInt();
                    for (int i = 0; i < tickets.size(); i++) {
                        if (id == tickets.get(i).passenger.getId()) {
                            String ticketInfo = tickets.get(i).checkTicket(tickets, count);
                            System.out.println(ticketInfo);
                            System.out.println("Here's your current ticket. Are you sure you want to remove it?");
                            String answer = scanner.next();
                            if (answer.equals("yes")) {
                                tickets.remove(i);
                                System.out.println("Your ticket has been removed! You can buy a new ticket now:");
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

                                    tickets.get(count).checkTicket(tickets, count);
                                    count++;
                                } else if (trainChoice == 2) {
                                    Lokomotiv tempLokomotiv = passengerTrain;
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
                                        } else
                                            tickets.add(new Ticket((new Passenger(id, number, fullName, citizenship, age, disabled, "Coupe", seatChoice, plackart.getPrice())), tempLokomotiv, tempWagon));
                                    }
                                    tickets.get(count).checkTicket(tickets, count);
                                    count++;
                                }
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("Your id cannot be found.");
                            break;
                        }
                    }
                }

                case 3 -> {
                    isContinue = false;
                }
            }

        }
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).passenger != null) {
                System.out.println(tickets.get(i).passenger.getFullName());
            }
        }
    }
}

/*
добавить методы в отдельные классы вагонов
Поменять билет
Арраулист оф пассанджерс(40 объектов)
 */

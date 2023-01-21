import Passengers.Passenger;
import Trains.Lokomotiv;
import Wagons.Wagon;

import java.util.ArrayList;

public class Ticket {
    Passenger passenger;
    Lokomotiv lokomotiv;
    Wagon wagon;
    public void setPassenger(){
        this.passenger = passenger;
    }
    public Ticket(Passenger passenger, Lokomotiv lokomotiv, Wagon wagon) {
        this.passenger = passenger;
        this.lokomotiv = lokomotiv;
        this.wagon = wagon;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Lokomotiv getLokomotiv() {
        return lokomotiv;
    }

    public void setLokomotiv(Lokomotiv lokomotiv) {
        this.lokomotiv = lokomotiv;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }
    public String checkTicket(ArrayList<Ticket> tickets, int count) {
        return (String)("Here's your ticket:\nNumber: " + tickets.get(count).passenger.getNumber() + "\nFull name: " +
                tickets.get(count).passenger.getFullName() + "\nCitizenship: " + tickets.get(count).passenger.getCitizenship() + "\nAge: " +
                tickets.get(count).passenger.getAge() + "\nDisabled: " + tickets.get(count).passenger.isDisabled() + "\nWagon class: " +
                tickets.get(count).passenger.getWagonClass() + "\nSeat: " + (tickets.get(count).passenger.getSeatNumber() + 1) + "\nPrice: " +
                (int)tickets.get(count).passenger.getPrice() + "\nRoute: " + tickets.get(count).lokomotiv.getRoute());
    }
}

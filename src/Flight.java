
public class Flight {
    private int passengers;
    private int seats;

    public Flight(int passengers, int seats) {
        this.passengers = passengers;
        this.seats = seats;
    }

    public boolean hasRoom(Flight flightToCheck){
        int total = getFlightPassengers() + flightToCheck.passengers;
        return total <= seats;
    }

    public int getFlightPassengers() {
        return this.passengers;
    }

    public Flight createNewFlightWithBoth (Flight flightToCheck) {
        Flight newFlight = new Flight(0, 30);
        newFlight.passengers = passengers + flightToCheck.passengers;
        return newFlight;
    }

    public Flight createNewFlightforSurplus (Flight flight1, Flight flight2){
        Flight newFlight = new Flight (0, 30);
        newFlight.passengers = (flight2.passengers + flight1.passengers) - flight1.seats;
        return newFlight;
    }

    public static void main (String[] args){
        Flight LAXtoDEN1 = new Flight(14, 30);
        Flight LAXtoDEN2 = new Flight(17, 30);

        Flight LAXtoDEN3 = null;
        if (LAXtoDEN1.hasRoom(LAXtoDEN2)) {
            LAXtoDEN3 = LAXtoDEN1.createNewFlightWithBoth(LAXtoDEN2);
        }
        //change this to enclose within first scenario
        if (LAXtoDEN3 != null) {
            System.out.println("Flights combined. Total on new flight is: " + LAXtoDEN3.passengers);
        }

        // add surplus scenario and print both flight 1, flight 2 & new flight
        
    }
}


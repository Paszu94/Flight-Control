import javax.swing.*;
import java.util.ArrayList;

public class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public FlightDatabase() {
        this.flights.add(new Flight("Berlin", "Tokyo"));
        this.flights.add(new Flight("Paris", "Berlin"));
        this.flights.add(new Flight("Warsaw", "Paris"));
        this.flights.add(new Flight("Madrid", "Berlin"));
        this.flights.add(new Flight("Berlin", "Warsaw"));
        this.flights.add(new Flight("Paris", "Madrid"));
        this.flights.add(new Flight("Porto", "Warsaw"));
        this.flights.add(new Flight("Madrid", "Porto"));
        this.flights.add(new Flight("Warsaw", "Madrid"));

    }


    //wersja nieuproszczona z funkcja boolean , bardziej dokładna (true -false)
    public void checkIfFlightExists(String start, String end) {
        boolean notExists = true;
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (start.equals(flight.departure) && end.equals(flight.arrival)) {
                System.out.println(("Flight exists!!"));
                notExists = false;
                break;
            }
        }
        if (notExists) {
            System.out.println("Flight with given params not exists");
        }
    }

    ////Wersja uproszczona bez zmiennej bollean (true - false) lecz sprawdza wszystkie loty pokolei aż znajdzie lot
//    public void checkIfFlightExists(String start,String end){
//         for (int i=0; i<this.flights.size(); i++){
//            Flight flight = this.flights.get(i);
//            if (start.equals(flight.departure) && end.equals(flight.arrival)){
//                System.out.println(("Flight exists!!"));
//                return;
//            }
//            System.out.println("Flight with given params not exists");
//        }
//    }
//    //Loty z konkretnego miasta
//    public ArrayList<Flight> getFlightsFromCity(String city) {
//        boolean isNotFound = true;
//        for (int i = 0; i < this.flights.size(); i++) {
//            Flight flight = this.flights.get(i);
//            if (city.equals(flight.departure)) {
//                System.out.println(flight.getDetails());
//                isNotFound = false;
//            }
//            if (isNotFound)
//                System.out.println("Flight not found");
//
//        }
//
//    }
//    //Loty do danego miasta
//    public void getFlightsToCity(String city) {
//        boolean isNotFound = true;
//        for (int i = 0; i < this.flights.size(); i++) {
//            Flight flight = this.flights.get(i);
//            if (city.equals(flight.arrival)) {
//                System.out.println(flight.getDetails());
//                isNotFound = false;
//            }
//            if (isNotFound)
//                System.out.println("Flight not found");
//        }
//    }

    public void displayFlights(ArrayList<Flight> results) {
        if (results.isEmpty()) {
            System.out.println("Flight is not found");
        }
        for (int i = 0; i < results.size(); i++) {
            Flight flight = results.get(i);
            System.out.println(flight.getDetails());
        }
    }
    public ArrayList<Flight> getFlightsFromCity (String city){
        ArrayList<Flight> results = new ArrayList<Flight>();
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (city.equals(flight.departure)) {
                results.add(flight);
            }
        }
        return results;
    }

        public ArrayList<Flight> getFlightsToCity (String city){
            ArrayList<Flight> results = new ArrayList<Flight>();
            for (int i = 0; i < this.flights.size(); i++) {
                Flight flight = this.flights.get(i);
                if (city.equals(flight.arrival)) {
                    results.add(flight);
                }
            }
            return results;
        }
        public void displayFlightFromCity (String city){
            ArrayList<Flight> results = getFlightsFromCity(city);
            displayFlights(results);
        }
        public void displayFlightToCity (String city){
            ArrayList<Flight> results = getFlightsToCity(city);
            displayFlights(results);
        }

        public void getCities(ArrayList<Flight> results){
            for (int i = 0; i < this.flights.size(); i++) {
                Flight flight = this.flights.get(i);
                if ((flight.arrival).equals(flight.arrival)) {
                    return results;

                }


            else{
                    System.out.println("error");
                }
            }


        }






}

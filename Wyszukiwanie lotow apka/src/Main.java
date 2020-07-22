import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        //System.out.println(" Flight from Gdańsk to Warszawa");
//        String first = new String("test");
//        String second = new String ("test");
//        if (first.equals(second)){
//            System.out.println("The same values");
//        }
//        else{
//            System.out.println("They are different");
//        }
//        Flight flight = new Flight("Gdańsk", "Warszawa");
//        flight.getDetails();
//        System.out.println(" ");
        //Zad dom z pętli for poniżej :
//        System.out.println("Homework under this line:");
//        Home home = new Home();
//        home.isDivided(4,18);
//        home.getEvenSum(5,9);
//        home.getNumbers(5, -2);



        FlightDatabase database = new FlightDatabase();
//        database.checkIfFlightExists("Paris", "Madrid");
//        ArrayList<Flight> fromCity = database.getFlightsFromCity("Paris");
//        ArrayList<Flight> toCity = database.getFlightsToCity("Warsaw");
//        database.displayFlights(fromCity);
//        database.displayFlights(toCity);
//        database.getFlightsFromCity("Warsaw");
//        database.getFlightsToCity("Madrid");
//        database.displayFlights();
        System.out.println("check line "); //to samo ale inne działanie
        System.out.println("Departures:");
        database.displayFlightFromCity("Paris");
        System.out.println("Arrivals:");
        database.displayFlightToCity("Warsaw");
        System.out.println("ZAD DOM:");
        database.getCities();



        


    }
}

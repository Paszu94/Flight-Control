public class Flight {
    String departure;
    String arrival;

    public Flight(String departure, String arrival)
    {
        this.departure = departure; //departure = wylot
        this.arrival = arrival; //arrival = przylot

    }
    public String getDetails() {
        return "Flight from " + this.departure + " to " + this.arrival;
    }















}

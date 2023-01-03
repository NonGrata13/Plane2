package Package1;

public class FlightControlGO {
    public static void main(String... args) {
        Plane2 plane = new Plane2("B17", 3);
        plane.setDestination("Home");
        plane.passengerOnBoard("First pilot", 0);
        plane.passengerOnBoard("Second pilot", 1);
        plane.passengerOnBoard("Third pilot", 2);
        plane.passengerOnBoard("4 pilot", 2);
        System.out.println(plane);
        System.out.println("_________________________________________________________");
        Plane2[] airportPlanes = new Plane2[3];
        airportPlanes[0] = new Plane2("Vanship", 2);
        airportPlanes[1] = new Plane2("Silvana", 3);
        airportPlanes[2] = new Plane2("Exile", 2);

        FlightControl airport = new FlightControl(airportPlanes);
        airport.setPlaneDestination("Vanship", "Hell");
        airport.setPlaneDestination("Silvana", "Heaven");
        airport.setPlaneDestination("Exile", "Home");
        createPassengers(airport);
        for (int i = 0; i < airport.passengerNames.length; i++) {
            airport.boardPassenger(i);

        }
    }
        public static void createPassengers(FlightControl airport){
        airport.registerPassenger("Grace", 0,"Vanship", 0);
        airport.registerPassenger("Vell", 1,"Vanship", 1);

        airport.registerPassenger("Ciry", 0,"Silvana", 2);
        airport.registerPassenger("Yen", 1,"Silvana", 3);
        airport.registerPassenger("Triss", 2,"Silvana", 4);

        airport.registerPassenger("Gralt", 0,"Exile", 5);
        airport.registerPassenger("Lambert", 1,"Exile", 6);
        airport.registerPassenger("Eskel", 2,"Exile", 7); // test with no available sit

 }

}

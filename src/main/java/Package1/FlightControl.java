package Package1;

public class FlightControl {
    public Plane2[] planes;
    public String[] passengerNames = new String[8];
    public int[] passengerSits = new int[8];
    public String[] passengerPlaneModel = new String[8];
    public String[] destinations;

    public FlightControl(Plane2[] airportPlanes){
        planes = airportPlanes;
        destinations = new String[] {"Atlanta", "Maldives"};
    }
    public void setPlaneDestination(String model, String destination){
        Plane2 plane = getPlaneByModel(model);
        plane.setDestination(destination);

    }
    public void boardPassenger(int passengerID) {
        String passengerName = passengerNames[passengerID];
        int passengerSit = passengerSits[passengerID];
        String planeModel = passengerPlaneModel[passengerID];


        Plane2 plane = getPlaneByModel(planeModel);
        plane.passengerOnBoard(passengerName, passengerSit);
    }
public Plane2 getPlaneByModel(String planeModel){
    for (int i = 0; i < planes.length; i++) {
        if(planes[i].model.equals(planeModel)){
            return planes[i];
        }
    }
    return null;
}
public void registerPassenger(String passengerName, int passengerSit, String model, int passengerID){
   passengerNames[passengerID] = passengerName;
   passengerSits[passengerID] = passengerSit;
   passengerPlaneModel[passengerID] = model;

}
}


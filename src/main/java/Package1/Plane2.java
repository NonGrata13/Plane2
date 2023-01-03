package Package1;

public class Plane2 {
    public String model;
    private String destination;
    private String[] passengers;

    public Plane2(String model, int numberOfSits) {
        this.model = model;
        passengers = new String[numberOfSits];
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void passengerOnBoard(String name, int sitNumber){
        if (sitNumber < passengers.length && passengers[sitNumber] == null){
            System.out.println("Boarding done for " + name + " on plane " + model + " to " + destination);
            passengers[sitNumber] = name;
            } else {
            offerFreeSit(name);
            }
    }
    public void offerFreeSit(String name){
        System.out.println( name + " ,you can't sit here, it's reserved");
        int freeSit = getFreeSit();
        if(freeSit >=0 && freeSit < passengers.length) {
            passengers[freeSit] = name;
            System.out.println(name + " ,you can sit on " + model);
        }
        else {
            System.out.println(model + " has no free sit for " + name);
        }
    }
    public int getFreeSit(){
        int freeSit = -1;
        for (int i = 0; i < passengers.length; i++) {
            if(passengers[i]==(null)){
              freeSit = i;
                break;
            }
        }
        return freeSit;
    }

}

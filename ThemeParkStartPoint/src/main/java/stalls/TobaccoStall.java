package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall implements ISecurity {
    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return this.parkingSpot;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > 18 ? true : false;
    }
}

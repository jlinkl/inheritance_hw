package stalls;

import behaviours.IReviewed;

public class CandyflossStall extends Stall {

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot, int review) {
        super(name, ownerName, parkingSpot, review);
    }

    @Override
    public int getRating() {
        return 0;
    }
}

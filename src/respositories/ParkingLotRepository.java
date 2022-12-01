package respositories;

import models.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotRepository {

    private static List<ParkingLot> parkingLots = new ArrayList<>();

    private static Long nextId = 0l;

    public static ParkingLot save(ParkingLot parkingLot){
        parkingLot.setId(nextId);
        nextId += 1;
        parkingLots.add(parkingLot);
        return parkingLot;
    }
}

package services;

import models.ParkingLot;
import respositories.ParkingLotRepository;

public class ParkingLotService {

    private ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

    public ParkingLot createParkingLot(String address){
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress(address);
        ParkingLot savedParkingLot = ParkingLotRepository.save(parkingLot);
        return savedParkingLot;
    }
}

package models;

public class ElectricParkingSlot extends BaseModel{
    private ParkingSlot parkingSlot;

    private ElectricCharger electricCharger;

    public ElectricParkingSlot(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }
}

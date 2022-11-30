package models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private List<ParkingSlot> parkingSlotList;

    private int floorNumber;

    public List<ParkingSlot> getSlotList() {
        return parkingSlotList;
    }

    public void setSlotList(List<ParkingSlot> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}

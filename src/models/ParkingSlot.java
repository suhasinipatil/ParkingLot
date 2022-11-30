package models;

public class ParkingSlot extends BaseModel{

    private int slotNumber;

    private ParkingSlotState parkingSlotState;

    private VehicleType vehicleType;

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public ParkingSlotState getSlotState() {
        return parkingSlotState;
    }

    public void setSlotState(ParkingSlotState parkingSlotState) {
        this.parkingSlotState = parkingSlotState;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}

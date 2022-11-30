package models;

import java.util.List;
import java.util.Map;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloorsList;

    private List<Gate> gatesList;

    private String address;

    private Map<VehicleType, VehicleTypePrice> vehicleTypePriceMap;

    public Map<VehicleType, VehicleTypePrice> getVehicleTypePriceMap() {
        return vehicleTypePriceMap;
    }

    public void setVehicleTypePriceMap(Map<VehicleType, VehicleTypePrice> vehicleTypePriceMap) {
        this.vehicleTypePriceMap = vehicleTypePriceMap;
    }

    public List<ParkingFloor> getParkingFloorsList() {
        return parkingFloorsList;
    }

    public void setParkingFloorsList(List<ParkingFloor> parkingFloorsList) {
        this.parkingFloorsList = parkingFloorsList;
    }

    public List<Gate> getGatesList() {
        return gatesList;
    }

    public void setGatesList(List<Gate> gatesList) {
        this.gatesList = gatesList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

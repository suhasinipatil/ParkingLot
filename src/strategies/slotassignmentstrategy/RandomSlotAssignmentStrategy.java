package strategies.slotassignmentstrategy;

import models.*;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy{
    @Override
    public ParkingSlot assignSlot(ParkingLot parkingLot, SlotType slotType, Gate entryGate) {
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloorsList()){
            for(ParkingSlot parkingSlot: parkingFloor.getSlotList()){
                if(parkingSlot.getSlotState().equals(ParkingSlotState.UNOCCUPIED) && parkingSlot.getVehicleType().equals(slotType)){
                    return  parkingSlot;
                }
            }
        }

        return null;
    }
}

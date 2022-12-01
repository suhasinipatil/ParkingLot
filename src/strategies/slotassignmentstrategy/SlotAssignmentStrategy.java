package strategies.slotassignmentstrategy;

import models.Gate;
import models.ParkingLot;
import models.ParkingSlot;
import models.SlotType;

public interface SlotAssignmentStrategy {
    ParkingSlot assignSlot(ParkingLot parkingLot, SlotType slotType, Gate entryGate);
}

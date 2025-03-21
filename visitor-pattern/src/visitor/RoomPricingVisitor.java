package visitor;

import room.DeluxeRoom;
import room.DoubleRoom;
import room.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Pricing Single Room");
        singleRoomObj.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Pricing Double Room");
        doubleRoomObj.roomPrice = 2000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomRoomObj) {
        System.out.println("Pricing Deluxe Room");
        deluxeRoomRoomObj.roomPrice = 5000;
    }
}

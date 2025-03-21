package visitor;

import room.DeluxeRoom;
import room.DoubleRoom;
import room.SingleRoom;

public class RoomMaintenanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Maintenance of Single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Maintenance of Double Room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomRoomObj) {
        System.out.println("Maintenance of Deluxe Room");
    }
}

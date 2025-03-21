package visitor;

import room.DeluxeRoom;
import room.DoubleRoom;
import room.SingleRoom;

public interface RoomVisitor {
    public void visit(SingleRoom singleRoomObj);
    public void visit(DoubleRoom doubleRoomObj);
    public void visit(DeluxeRoom deluxeRoomRoomObj);
}

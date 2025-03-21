import room.DeluxeRoom;
import room.DoubleRoom;
import room.RoomElement;
import room.SingleRoom;
import visitor.RoomMaintenanceVisitor;
import visitor.RoomPricingVisitor;
import visitor.RoomVisitor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RoomElement singleRoomObj = new SingleRoom();
        RoomElement doubleRoomObj = new DoubleRoom();
        RoomElement deluxeRoomObj = new DeluxeRoom();

        RoomVisitor pricingVisitorObj = new RoomPricingVisitor();
        singleRoomObj.accept(pricingVisitorObj);
        System.out.println(((SingleRoom)singleRoomObj).roomPrice);

        doubleRoomObj.accept(pricingVisitorObj);
        System.out.println(((DoubleRoom)doubleRoomObj).roomPrice);

        deluxeRoomObj.accept(pricingVisitorObj);
        System.out.println(((DeluxeRoom)deluxeRoomObj).roomPrice);

        RoomVisitor maintenanceVisitorObj = new RoomMaintenanceVisitor();
        singleRoomObj.accept(maintenanceVisitorObj);
        doubleRoomObj.accept(maintenanceVisitorObj);
        deluxeRoomObj.accept(maintenanceVisitorObj);
    }
}
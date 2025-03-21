package room;

import visitor.RoomVisitor;

public interface RoomElement {
    public void accept(RoomVisitor visitor);
}

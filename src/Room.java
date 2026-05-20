import java.util.ArrayList;
import java.util.List;

public class Room {
    // Instance variables for items
    private String roomName; // room name
    private String roomDescription; // when the player first visits the room
    private String updatedRoomDescription; // for when the player has visited the room
    private List<Items> items; // an array of items in that room
    private Enemy enemy; // which enemy is in that room
    private NPC npc; // which npc is in that room

    // Constructor
    // missing npc hasMeet from constructor, might cause future issues, we will see..
    public Room(String roomName, 
                String roomDescription, 
                String updatedRoomDescription,
                List<Items> items,
                Enemy enemy,
                NPC npc) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.updatedRoomDescription = updatedRoomDescription;
        this.items = new ArrayList<>(items); // not sure about this
        this.enemy = enemy;
        this.npc = npc;
    }
    
    public String getRoomName() {
        return roomName;
    }
    
    public String getRoomDescription() {
        return roomDescription;
    }
    
    public String getUpdatedRD() { // getUpdatedRoomDescription, RD short for RoomDescription
        return updatedRoomDescription;
    }

    public List<Items> getItems() { // not sure about this, will fix later lol..
        return items;
    }

//    public Enemy hasEnemy() { // get the enemy name if there is an enemy in that room
//        //return Enemy.getName(); // not sure why its red
//    }
    
    public NPC getNPC() {
        return npc;
    }

}

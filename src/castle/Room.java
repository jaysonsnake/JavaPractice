package castle;

import java.util.HashMap;

/**
 * @author Coco
 * @date 2020/02/05
 */
public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<>();

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExit(String dir, Room room) {
        exits.put(dir, room);
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }

    public String getExitDesc()
    {
        StringBuffer sb = new StringBuffer();
        for (String dir :exits.keySet()) {
            sb.append(dir).append(" ");
        }
        return sb.toString();
    }

    @Override
    public String toString()
    {
        return description;
    }
}

package bg.tu_varna.sit.map_example2;

import java.util.Objects;

public class WorkPlace implements Comparable<Object> {
    private String room;
    private int computerId;

    public WorkPlace(String room, int computerId) {
        this.room = room;
        this.computerId = computerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkPlace)) return false;
        WorkPlace workPlace = (WorkPlace) o;
        return computerId == workPlace.computerId && room.equals(workPlace.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(room, computerId);
    }

    @Override
    public String toString() {
        return "Зала: " +  room + ", работно място: " + computerId;
    }

    @Override
    public int compareTo(Object o) {
        int roomResult= this.room.compareTo(((WorkPlace)o).room);
        if(roomResult==0) {
            return this.computerId-((WorkPlace)o).computerId;
        }
        return roomResult;
    }
}

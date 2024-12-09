package bg.tu_varna.sit.map_example2;

import java.util.Objects;

public class WorkPlace implements Comparable<WorkPlace> {
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
    public int compareTo(WorkPlace o) {
        int roomResult= this.room.compareTo(o.room);
        if(roomResult==0) {
            return this.computerId-o.computerId;
        }
        return roomResult;
    }
}

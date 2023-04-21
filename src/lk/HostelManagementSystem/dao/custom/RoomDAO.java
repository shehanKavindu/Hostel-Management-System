package lk.HostelManagementSystem.dao.custom;

import lk.HostelManagementSystem.entity.Room;

import java.util.ArrayList;

    public interface RoomDAO extends SQLUtil<Room> {
        Room get(String var1);

        ArrayList<Room> getAll();

}

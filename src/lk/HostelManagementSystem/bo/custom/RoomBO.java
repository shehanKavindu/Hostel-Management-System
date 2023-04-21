package lk.HostelManagementSystem.bo.custom;

import lk.HostelManagementSystem.bo.SuperBO;
import lk.HostelManagementSystem.dto.RoomDTO;

import java.util.ArrayList;

public interface RoomBO extends SuperBO {

    public interface RoomBO extends SuperBO {
        boolean saveRoom(RoomDTO var1);

        boolean deleteRoom(RoomDTO var1);

        boolean updateRoom(RoomDTO var1);

        ArrayList<RoomDTO> loadAll();
    }


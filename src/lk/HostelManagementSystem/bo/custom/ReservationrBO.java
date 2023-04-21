package lk.HostelManagementSystem.bo.custom;

import lk.HostelManagementSystem.bo.SuperBO;
import lk.HostelManagementSystem.dto.ReservationDTO;
import lk.HostelManagementSystem.dto.RoomDTO;

import java.util.ArrayList;

public interface ReservationrBO extends SuperBO {
    RoomDTO getRoom(String var1);

    int getNotAvailableRoomCount(String var1);

    boolean saveRegistration(ReservationDTO var1);

    boolean deleteRegistration(ReservationDTO var1);

    boolean updateRegistration(ReservationDTO var1);

    ArrayList<ReservationDTO> getAll();

    String getLastId();
}
}

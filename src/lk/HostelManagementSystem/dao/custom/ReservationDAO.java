package lk.HostelManagementSystem.dao.custom;

import lk.HostelManagementSystem.entity.Reservation;

import java.util.ArrayList;

public interface ReservationDAO extends SQLUtil<Reservation>{
    int getNotAvailableRoomCount(String room_type_id);

    String getLastId();

    ArrayList<Reservation> getAll();
}

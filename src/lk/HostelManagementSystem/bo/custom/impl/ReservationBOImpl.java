package lk.HostelManagementSystem.bo.custom.impl;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;
import lk.ijse.hostel_management_system.bo.custom.ReservationBO;
import lk.ijse.hostel_management_system.dao.DAOFactory;
import lk.ijse.hostel_management_system.dao.DAOType;
import lk.ijse.hostel_management_system.dao.custom.ReservationDAO;
import lk.ijse.hostel_management_system.dao.custom.RoomDAO;
import lk.ijse.hostel_management_system.dao.custom.StudentDAO;
import lk.ijse.hostel_management_system.dto.ReservationDTO;
import lk.ijse.hostel_management_system.dto.RoomDTO;
import lk.ijse.hostel_management_system.entity.Reservation;
import lk.ijse.hostel_management_system.entity.Room;
import lk.ijse.hostel_management_system.entity.Student;

public class ReservationBOImpl implements ReservationBO {
    private final RoomDAO roomDAO;
    private final ReservationDAO reservationDAO;
    private final StudentDAO studentDAO;

    public ReservationBOImpl() {
        this.roomDAO = (RoomDAO)DAOFactory.getInstance().getDAOType(DAOType.ROOM);
        this.reservationDAO = (ReservationDAO)DAOFactory.getInstance().getDAOType(DAOType.RESERVATION);
        this.studentDAO = (StudentDAO)DAOFactory.getInstance().getDAOType(DAOType.STUDENT);
    }

    public RoomDTO getRoom(String room_type_id) {
        Room room = this.roomDAO.get(room_type_id);
        return new RoomDTO(room.getRoom_type_id(), room.getType(), room.getKey_money(), room.getQty());
    }

    public int getNotAvailableRoomCount(String room_type_id) {
        return this.reservationDAO.getNotAvailableRoomCount(room_type_id);
    }

    public boolean saveRegistration(ReservationDTO dto) {
        Student student = new Student();
        student.setStudent_id(dto.getStudent_id());
        Room room = new Room();
        room.setRoom_type_id(dto.getRoom_type_id());
        return this.reservationDAO.save(new Reservation(dto.getRes_id(), dto.getDate(), student, room, dto.getStatus()));
    }

    public boolean deleteRegistration(ReservationDTO dto) {
        Student student = new Student();
        student.setStudent_id(dto.getStudent_id());
        Room room = new Room();
        room.setRoom_type_id(dto.getRoom_type_id());
        return this.reservationDAO.delete(new Reservation(dto.getRes_id(), dto.getDate(), student, room, dto.getStatus()));
    }

    public boolean updateRegistration(ReservationDTO dto) {
        Student student = new Student();
        student.setStudent_id(dto.getStudent_id());
        Room room = new Room();
        room.setRoom_type_id(dto.getRoom_type_id());
        return this.reservationDAO.update(new Reservation(dto.getRes_id(), dto.getDate(), student, room, dto.getStatus()));
    }

    public ArrayList<ReservationDTO> getAll() {
        ArrayList<Reservation> arrayList = this.reservationDAO.getAll();
        ArrayList<ReservationDTO> dtos = new ArrayList();
        Iterator var5 = arrayList.iterator();

        while(var5.hasNext()) {
            Reservation r = (Reservation)var5.next();
            Student student = r.getStudent();
            Room room = r.getRoom();
            dtos.add(new ReservationDTO(r.getRes_id(), r.getDate(), student.getStudent_id(), room.getRoom_type_id(), r.getStatus()));
        }

        return dtos;
    }

    public String getLastId() {
        return this.reservationDAO.getLastId();
    }
}

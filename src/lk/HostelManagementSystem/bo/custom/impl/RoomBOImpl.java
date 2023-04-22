package lk.HostelManagementSystem.bo.custom.impl;


import lk.HostelManagementSystem.bo.custom.RoomBO;
import lk.HostelManagementSystem.dao.DAOFactory;
import lk.HostelManagementSystem.dao.custom.DAOType;
import lk.HostelManagementSystem.dao.custom.RoomDAO;
import lk.HostelManagementSystem.dto.RoomDTO;
import lk.HostelManagementSystem.entity.Room;

import java.util.ArrayList;
import java.util.Iterator;

public class RoomBOImpl implements RoomBO {
    private RoomDAO roomDAO;

    public RoomBOImpl() {
        this.roomDAO = (RoomDAO) DAOFactory.getInstance().getDAOType(DAOType.ROOM);
    }

    public boolean saveRoom(RoomDTO dto) {
        return this.roomDAO.save(new Room(dto.getRoom_type_id(), dto.getType(), dto.getKey_money(), dto.getQty()));
    }

    public boolean deleteRoom(RoomDTO dto) {
        return this.roomDAO.delete(new Room(dto.getRoom_type_id(), dto.getType(), dto.getKey_money(), dto.getQty()));
    }

    public boolean updateRoom(RoomDTO dto) {
        return this.roomDAO.update(new Room(dto.getRoom_type_id(), dto.getType(), dto.getKey_money(), dto.getQty()));
    }

    public ArrayList<RoomDTO> loadAll() {
        ArrayList<Room> rooms = this.roomDAO.getAll();
        ArrayList<RoomDTO> roomDTOS = new ArrayList();
        Iterator var3 = rooms.iterator();

        while(var3.hasNext()) {
            Room r = (Room)var3.next();
            roomDTOS.add(new RoomDTO(r.getRoom_type_id(), r.getType(), r.getKey_money(), r.getQty()));
        }

        return roomDTOS;
    }
}

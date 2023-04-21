package lk.HostelManagementSystem.bo.custom.impl;

import lk.ijse.hostel_management_system.bo.custom.SettingBO;
import lk.ijse.hostel_management_system.dao.DAOFactory;
import lk.ijse.hostel_management_system.dao.DAOType;
import lk.ijse.hostel_management_system.dao.custom.UserDAO;
import lk.ijse.hostel_management_system.dto.UserDTO;
import lk.ijse.hostel_management_system.entity.User;

public class SettingBOImpl implements SettingBO {
    private final UserDAO userDAO;

    public SettingBOImpl() {
        this.userDAO = (UserDAO)DAOFactory.getInstance().getDAOType(DAOType.USER);
    }

    public boolean updateUserNameAndPassword(UserDTO dto) {
        return this.userDAO.save(new User(dto.getUserName(), dto.getPassword()));
    }
}

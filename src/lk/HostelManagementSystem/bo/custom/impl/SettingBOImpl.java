package lk.HostelManagementSystem.bo.custom.impl;

import lk.HostelManagementSystem.bo.custom.SettingBO;

public class SettingBOImpl implements SettingBO {
    private final UserDAO userDAO;

    public SettingBOImpl() {
        this.userDAO = (UserDAO)DAOFactory.getInstance().getDAOType(DAOType.USER);
    }

    public boolean updateUserNameAndPassword(UserDTO dto) {
        return this.userDAO.save(new User(dto.getUserName(), dto.getPassword()));
    }
}

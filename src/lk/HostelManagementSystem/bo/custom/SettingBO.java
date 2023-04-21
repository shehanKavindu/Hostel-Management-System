package lk.HostelManagementSystem.bo.custom;

import lk.HostelManagementSystem.bo.SuperBO;
import lk.ijse.hostel_management_system.bo.SupperBO;
import lk.ijse.hostel_management_system.dto.UserDTO;

public interface SettingBO extends SuperBO {
    boolean updateUserNameAndPassword(UserDTO var1);
}

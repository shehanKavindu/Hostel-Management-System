package lk.HostelManagementSystem.bo.custom;

import lk.HostelManagementSystem.bo.SuperBO;
import lk.HostelManagementSystem.dto.CustomDTO;

import java.util.ArrayList;

public interface PayementBO extends SuperBO{
    ArrayList<CustomDTO> getAllPendingPayementStudent();
}

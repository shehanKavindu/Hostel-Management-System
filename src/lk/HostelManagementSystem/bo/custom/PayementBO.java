package lk.HostelManagementSystem.bo.custom;

import lk.HostelManagementSystem.dto.CustomDTO;

import java.util.ArrayList;

public interface PayementDetailsBO extends SupperBO {
    ArrayList<CustomDTO> getAllPendingPayementStudent();
}

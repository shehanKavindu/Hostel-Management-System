package lk.HostelManagementSystem.dao.custom;

import lk.HostelManagementSystem.dao.SuperDAO;

import java.util.ArrayList;

public interface QueryDAO extends SuperDAO {
    ArrayList<CustomEntity> getAllPendingPayementStudent();
}

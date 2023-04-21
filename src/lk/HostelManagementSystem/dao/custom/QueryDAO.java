package lk.HostelManagementSystem.dao.custom;

import lk.HostelManagementSystem.dao.SuperDAO;
import lk.HostelManagementSystem.entity.CustomEntity;

import java.util.ArrayList;

    public interface QueryDAO extends SuperDAO {
        ArrayList<CustomEntity> getAllPendingPaymentStudent();
    }



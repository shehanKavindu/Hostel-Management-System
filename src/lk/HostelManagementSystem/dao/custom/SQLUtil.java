package lk.HostelManagementSystem.dao.custom;


import lk.HostelManagementSystem.dao.SuperDAO;

public interface SQLUtil<T> extends SuperDAO {
        boolean save(T var1);

        boolean delete(T var1);

        boolean update(T var1);


}

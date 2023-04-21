package lk.HostelManagementSystem.dao.custom;

import lk.HostelManagementSystem.entity.User;


    public interface UserDAO extends SQLUtil<User> {
        User get(String var1);
    }



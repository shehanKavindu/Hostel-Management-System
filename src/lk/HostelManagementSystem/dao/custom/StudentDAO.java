package lk.HostelManagementSystem.dao.custom;

import lk.HostelManagementSystem.entity.Student;

import java.util.ArrayList;

    public interface StudentDAO extends SQLUtil<Student> {
        ArrayList<Student> getAllStudent();
    }



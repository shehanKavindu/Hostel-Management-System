package lk.HostelManagementSystem.bo.custom.impl;


import java.util.ArrayList;
import lk.ijse.hostel_management_system.bo.custom.AddUserBO;
import lk.ijse.hostel_management_system.dao.DAOFactory;
import lk.ijse.hostel_management_system.dao.DAOType;
import lk.ijse.hostel_management_system.dao.custom.StudentDAO;
import lk.ijse.hostel_management_system.dto.StudentDTO;
import lk.ijse.hostel_management_system.entity.Student;

public class AddUserBOImpl implements AddUserBO {
    private StudentDAO studentDAO;

    public AddUserBOImpl() {
        this.studentDAO = (StudentDAO)DAOFactory.getInstance().getDAOType(DAOType.STUDENT);
    }

    public boolean saveStudent(StudentDTO dto) {
        return this.studentDAO.save(new Student(dto.getStudent_id(), dto.getName(), dto.getAddress(), dto.getContact_no(), dto.getDob(), dto.getGender()));
    }

    public boolean deleteStudent(StudentDTO dto) {
        return false;
    }

    public boolean updateStudent(StudentDTO dto) {
        return false;
    }

    public ArrayList<StudentDTO> getAllStudent() {
        return null;
    }
}

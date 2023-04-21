//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lk.HostelManagementSystem.bo.custom.impl;

import lk.HostelManagementSystem.bo.custom.StudentBO;

public class StudentBOImpl implements StudentBO {
    private StudentDAO studentDAO;

    public StudentBOImpl() {
        this.studentDAO = (StudentDAO)DAOFactory.getInstance().getDAOType(DAOType.STUDENT);
    }

    public boolean saveStudent(StudentDTO dto) {
        return this.studentDAO.save(new Student(dto.getStudent_id(), dto.getName(), dto.getAddress(), dto.getContact_no(), dto.getDob(), dto.getGender()));
    }

    public boolean deleteStudent(StudentDTO dto) {
        return this.studentDAO.delete(new Student(dto.getStudent_id(), dto.getName(), dto.getAddress(), dto.getContact_no(), dto.getDob(), dto.getGender()));
    }

    public boolean updateStudent(StudentDTO dto) {
        return this.studentDAO.update(new Student(dto.getStudent_id(), dto.getName(), dto.getAddress(), dto.getContact_no(), dto.getDob(), dto.getGender()));
    }

    public ArrayList<StudentDTO> getAllStudent() {
        ArrayList<Student> allStudent = this.studentDAO.getAllStudent();
        ArrayList<StudentDTO> studentDTOS = new ArrayList();
        Iterator var3 = allStudent.iterator();

        while(var3.hasNext()) {
            Student s = (Student)var3.next();
            studentDTOS.add(new StudentDTO(s.getStudent_id(), s.getName(), s.getAddress(), s.getContact_no(), s.getDob(), s.getGender()));
        }

        return studentDTOS;
    }
}

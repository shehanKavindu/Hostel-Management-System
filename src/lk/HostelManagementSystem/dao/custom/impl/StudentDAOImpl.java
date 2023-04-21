package lk.HostelManagementSystem.dao.custom.impl;

import java.util.ArrayList;
import java.util.List;

    public class StudentDAOImpl implements StudentDAO {
        public StudentDAOImpl() {
        }

        public boolean save(Student entity) {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            try {
                session.save(entity);
                transaction.commit();
                session.close();
                return true;
            } catch (Exception var5) {
                transaction.rollback();
                session.close();
                var5.printStackTrace();
                return false;
            }
        }

        public boolean delete(Student entity) {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            try {
                session.delete(entity);
                transaction.commit();
                session.close();
                return true;
            } catch (Exception var5) {
                transaction.rollback();
                session.close();
                var5.printStackTrace();
                return false;
            }
        }

        public boolean update(Student entity) {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            try {
                session.update(entity);
                transaction.commit();
                session.close();
                return true;
            } catch (Exception var5) {
                transaction.rollback();
                session.close();
                var5.printStackTrace();
                return false;
            }
        }

        public ArrayList<Student> getAllStudent() {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            try {
                NativeQuery nativeQuery = session.createSQLQuery("SELECT * FROM Student");
                nativeQuery.addEntity(Student.class);
                List<Student> studentList = nativeQuery.list();
                transaction.commit();
                session.close();
                return (ArrayList)studentList;
            } catch (Exception var5) {
                transaction.rollback();
                session.close();
                var5.printStackTrace();
                return null;
            }
        }
}

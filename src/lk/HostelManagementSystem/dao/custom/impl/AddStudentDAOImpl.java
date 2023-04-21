package lk.HostelManagementSystem.dao.custom.impl;

import lk.HostelManagementSystem.dao.custom.UserDAO;

public class AddStudentDAOImpl {
import lk.HostelManagementSystem.dao.custom.UserDAO;
import lk.HostelManagementSystem.entity.User;
import lk.HostelManagementSystem.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

    public class UserDAOImpl implements UserDAO {
        public UserDAOImpl() {
        }

        public boolean save(User entity) {
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

        public boolean delete(User entity) {
            return false;
        }

        public User get(String userName) {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            try {
                User user = (User)session.get(User.class, userName);
                transaction.commit();
                session.close();
                return user;
            } catch (Exception var5) {
                transaction.rollback();
                session.close();
                var5.printStackTrace();
                return null;
            }
        }

        public boolean update(User entity) {
            return false;
        }
    }


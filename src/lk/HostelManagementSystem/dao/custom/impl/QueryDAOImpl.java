package lk.HostelManagementSystem.dao.custom.impl;

import lk.HostelManagementSystem.dao.custom.QueryDAO;
import lk.HostelManagementSystem.entity.CustomEntity;

import javax.management.Query;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    public class QueryDAOImpl implements QueryDAO {
        public QueryDAOImpl() {
        }

        public ArrayList<CustomEntity> getAllPendingPaymentStudent() {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            try {
                Query query = session.createQuery("SELECT s.student_id,s.name,s.address,s.contact_no,s.dob,s.gender FROM\nStudent s INNER JOIN Reservation r ON s.student_id=r.student.student_id WHERE r.status=:status");
                query.setParameter("status", "Pending payment");
                List<Object[]> list = query.list();
                transaction.commit();
                session.close();
                ArrayList<CustomEntity> customEntities = new ArrayList();
                Iterator var6 = list.iterator();

                while(var6.hasNext()) {
                    Object[] o = (Object[])var6.next();
                    customEntities.add(new CustomEntity((String)o[0], (String)o[1], (String)o[2], (String)o[3], (LocalDate)o[4], (String)o[5]));
                }

                return customEntities;
            } catch (Exception var8) {
                transaction.rollback();
                session.close();
                var8.printStackTrace();
                return null;
            }
        }
    }



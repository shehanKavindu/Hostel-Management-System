package lk.HostelManagementSystem.dao.custom.impl;

import java.util.ArrayList;
import java.util.List;

public class RoomDAOImpl {
    ublic class RoomDAOImpl implements RoomDAO {
        public RoomDAOImpl() {
        }

        public boolean save(Room entity) {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            try {
                try {
                    Room room = (Room)session.get(Room.class, entity.getRoom_type_id());
                    Query query = session.createQuery("UPDATE Room SET qty=:add_qty WHERE room_type_id=:room_id");
                    query.setParameter("add_qty", room.getQty() + entity.getQty());
                    query.setParameter("room_id", entity.getRoom_type_id());
                    boolean var6 = query.executeUpdate() > 0;
                } catch (NullPointerException var7) {
                    session.save(entity);
                }

                transaction.commit();
                session.close();
                return true;
            } catch (Exception var8) {
                transaction.rollback();
                session.close();
                var8.printStackTrace();
                return false;
            }
        }

        public boolean delete(Room entity) {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            try {
                Room room = (Room)session.get(Room.class, entity.getRoom_type_id());
                String hql = "UPDATE Room SET qty=:delete_qty WHERE room_type_id=:room_id";
                Query query = session.createQuery(hql);
                query.setParameter("delete_qty", room.getQty() - entity.getQty());
                query.setParameter("room_id", entity.getRoom_type_id());
                boolean isDeleted = query.executeUpdate() > 0;
                transaction.commit();
                session.close();
                return isDeleted;
            } catch (Exception var8) {
                transaction.rollback();
                session.close();
                var8.printStackTrace();
                return false;
            }
        }

        public boolean update(Room entity) {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            try {
                String hql = "UPDATE Room SET key_money=:update_key_money WHERE room_type_id=:room_id";
                Query query = session.createQuery(hql);
                query.setParameter("update_key_money", entity.getKey_money());
                query.setParameter("room_id", entity.getRoom_type_id());
                boolean isDeleted = query.executeUpdate() > 0;
                transaction.commit();
                session.close();
                return isDeleted;
            } catch (Exception var7) {
                transaction.rollback();
                session.close();
                var7.printStackTrace();
                return false;
            }
        }

        public Room get(String room_type_id) {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            try {
                Room room = (Room)session.get(Room.class, room_type_id);
                transaction.commit();
                session.close();
                return room;
            } catch (Exception var5) {
                transaction.rollback();
                session.close();
                var5.printStackTrace();
                return null;
            }
        }

        public ArrayList<Room> getAll() {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            try {
                NativeQuery nativeQuery = session.createSQLQuery("SELECT * FROM Room");
                nativeQuery.addEntity(Room.class);
                List<Room> studentList = nativeQuery.list();
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


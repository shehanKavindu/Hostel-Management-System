package lk.HostelManagementSystem.dao;


import lk.HostelManagementSystem.dao.custom.DAOType;
import lk.HostelManagementSystem.dao.custom.impl.*;

public class DAOFactory
        private static DAOFactory daoFactory;

        private DAOFactory() {
        }

        public static DAOFactory getInstance() {
            return daoFactory == null ? (daoFactory = new DAOFactory()) : daoFactory;
        }

        public SuperDAO getDAOType(DAOType daoType) {
            switch (daoType) {
                case ROOM:
                    return new RoomDAOImpl();
                case STUDENT:
                    return new StudentDAOImpl();
                case RESERVATION:
                    return new ReservationDAOImpl();
                case USER:
                    return new UserDAOImpl();
                case QUERY:
                    return new QueryDAOImpl();
                default:
                    return null;
            }
        }
    }



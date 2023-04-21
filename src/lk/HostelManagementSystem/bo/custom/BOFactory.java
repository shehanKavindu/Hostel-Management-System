package lk.HostelManagementSystem.bo.custom;

import lk.HostelManagementSystem.bo.custom.impl.PayementBOImpl;

public class BOFactory {
    public class BOFactory {
        private static BOFactory boFactory;

        private BOFactory() {
        }

        public static BOFactory getInstance() {
            return boFactory == null ? (boFactory = new BOFactory()) : boFactory;
        }

        public SuperBO getBOType(BOType boType) {
            switch (boType) {
                case USER:
                    return new UserBOImpl();
                case STUDENT:
                    return new StudentBOImpl();
                case ROOM:
                    return new RoomBOImpl();
                case RESERVATION:
                    return new ReservationBOImpl();
                case ADDUSER:
                    return new AddUserBOImpl();
                case SETTING:
                    return new SettingBOImpl();
                case LOGIN:
                    return new LogInBOImpl();
                case PAYEMENt:
                    return new PayementBOImpl();
                default:
                    return null;
            }
        }
    }


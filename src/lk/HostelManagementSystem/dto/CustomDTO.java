package lk.HostelManagementSystem.dto;

import lk.HostelManagementSystem.entity.Room;
import lk.HostelManagementSystem.entity.Student;

import java.time.LocalDate;


    public class CustomDTO {
        private String res_id;
        private LocalDate date;
        private Student student;
        private Room room;
        private String status;
        private String room_type_id;
        private String type;
        private double key_money;
        private int qty;
        private String student_id;
        private String name;
        private String address;
        private String contact_no;
        private LocalDate dob;
        private String gender;
        private String userName;
        private String password;

        public CustomDTO(String student_id, String name, String address, String contact_no, LocalDate dob, String gender) {
            this.student_id = student_id;
            this.name = name;
            this.address = address;
            this.contact_no = contact_no;
            this.dob = dob;
            this.gender = gender;
        }

        public CustomDTO(String res_id, LocalDate date, Student student, Room room, String status, String room_type_id, String type, double key_money, int qty, String student_id, String name, String address, String contact_no, LocalDate dob, String gender, String userName, String password) {
            this.res_id = res_id;
            this.date = date;
            this.student = student;
            this.room = room;
            this.status = status;
            this.room_type_id = room_type_id;
            this.type = type;
            this.key_money = key_money;
            this.qty = qty;
            this.student_id = student_id;
            this.name = name;
            this.address = address;
            this.contact_no = contact_no;
            this.dob = dob;
            this.gender = gender;
            this.userName = userName;
            this.password = password;
        }

        public CustomDTO() {
        }

        public String getRes_id() {
            return this.res_id;
        }

        public LocalDate getDate() {
            return this.date;
        }

        public Student getStudent() {
            return this.student;
        }

        public Room getRoom() {
            return this.room;
        }

        public String getStatus() {
            return this.status;
        }

        public String getRoom_type_id() {
            return this.room_type_id;
        }

        public String getType() {
            return this.type;
        }

        public double getKey_money() {
            return this.key_money;
        }

        public int getQty() {
            return this.qty;
        }

        public String getStudent_id() {
            return this.student_id;
        }

        public String getName() {
            return this.name;
        }

        public String getAddress() {
            return this.address;
        }

        public String getContact_no() {
            return this.contact_no;
        }

        public LocalDate getDob() {
            return this.dob;
        }

        public String getGender() {
            return this.gender;
        }

        public String getUserName() {
            return this.userName;
        }

        public String getPassword() {
            return this.password;
        }

        public void setRes_id(String res_id) {
            this.res_id = res_id;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public void setStudent(Student student) {
            this.student = student;
        }

        public void setRoom(Room room) {
            this.room = room;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setRoom_type_id(String room_type_id) {
            this.room_type_id = room_type_id;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setKey_money(double key_money) {
            this.key_money = key_money;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public void setStudent_id(String student_id) {
            this.student_id = student_id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setContact_no(String contact_no) {
            this.contact_no = contact_no;
        }

        public void setDob(LocalDate dob) {
            this.dob = dob;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof CustomDTO)) {
                return false;
            } else {
                CustomDTO other = (CustomDTO)o;
                if (!other.canEqual(this)) {
                    return false;
                } else if (Double.compare(this.getKey_money(), other.getKey_money()) != 0) {
                    return false;
                } else if (this.getQty() != other.getQty()) {
                    return false;
                } else {
                    label196: {
                        Object this$res_id = this.getRes_id();
                        Object other$res_id = other.getRes_id();
                        if (this$res_id == null) {
                            if (other$res_id == null) {
                                break label196;
                            }
                        } else if (this$res_id.equals(other$res_id)) {
                            break label196;
                        }

                        return false;
                    }

                    Object this$date = this.getDate();
                    Object other$date = other.getDate();
                    if (this$date == null) {
                        if (other$date != null) {
                            return false;
                        }
                    } else if (!this$date.equals(other$date)) {
                        return false;
                    }

                    label182: {
                        Object this$student = this.getStudent();
                        Object other$student = other.getStudent();
                        if (this$student == null) {
                            if (other$student == null) {
                                break label182;
                            }
                        } else if (this$student.equals(other$student)) {
                            break label182;
                        }

                        return false;
                    }

                    label175: {
                        Object this$room = this.getRoom();
                        Object other$room = other.getRoom();
                        if (this$room == null) {
                            if (other$room == null) {
                                break label175;
                            }
                        } else if (this$room.equals(other$room)) {
                            break label175;
                        }

                        return false;
                    }

                    label168: {
                        Object this$status = this.getStatus();
                        Object other$status = other.getStatus();
                        if (this$status == null) {
                            if (other$status == null) {
                                break label168;
                            }
                        } else if (this$status.equals(other$status)) {
                            break label168;
                        }

                        return false;
                    }

                    Object this$room_type_id = this.getRoom_type_id();
                    Object other$room_type_id = other.getRoom_type_id();
                    if (this$room_type_id == null) {
                        if (other$room_type_id != null) {
                            return false;
                        }
                    } else if (!this$room_type_id.equals(other$room_type_id)) {
                        return false;
                    }

                    label154: {
                        Object this$type = this.getType();
                        Object other$type = other.getType();
                        if (this$type == null) {
                            if (other$type == null) {
                                break label154;
                            }
                        } else if (this$type.equals(other$type)) {
                            break label154;
                        }

                        return false;
                    }

                    Object this$student_id = this.getStudent_id();
                    Object other$student_id = other.getStudent_id();
                    if (this$student_id == null) {
                        if (other$student_id != null) {
                            return false;
                        }
                    } else if (!this$student_id.equals(other$student_id)) {
                        return false;
                    }

                    label140: {
                        Object this$name = this.getName();
                        Object other$name = other.getName();
                        if (this$name == null) {
                            if (other$name == null) {
                                break label140;
                            }
                        } else if (this$name.equals(other$name)) {
                            break label140;
                        }

                        return false;
                    }

                    Object this$address = this.getAddress();
                    Object other$address = other.getAddress();
                    if (this$address == null) {
                        if (other$address != null) {
                            return false;
                        }
                    } else if (!this$address.equals(other$address)) {
                        return false;
                    }

                    Object this$contact_no = this.getContact_no();
                    Object other$contact_no = other.getContact_no();
                    if (this$contact_no == null) {
                        if (other$contact_no != null) {
                            return false;
                        }
                    } else if (!this$contact_no.equals(other$contact_no)) {
                        return false;
                    }

                    label119: {
                        Object this$dob = this.getDob();
                        Object other$dob = other.getDob();
                        if (this$dob == null) {
                            if (other$dob == null) {
                                break label119;
                            }
                        } else if (this$dob.equals(other$dob)) {
                            break label119;
                        }

                        return false;
                    }

                    label112: {
                        Object this$gender = this.getGender();
                        Object other$gender = other.getGender();
                        if (this$gender == null) {
                            if (other$gender == null) {
                                break label112;
                            }
                        } else if (this$gender.equals(other$gender)) {
                            break label112;
                        }

                        return false;
                    }

                    Object this$userName = this.getUserName();
                    Object other$userName = other.getUserName();
                    if (this$userName == null) {
                        if (other$userName != null) {
                            return false;
                        }
                    } else if (!this$userName.equals(other$userName)) {
                        return false;
                    }

                    Object this$password = this.getPassword();
                    Object other$password = other.getPassword();
                    if (this$password == null) {
                        if (other$password != null) {
                            return false;
                        }
                    } else if (!this$password.equals(other$password)) {
                        return false;
                    }

                    return true;
                }
            }
        }

        protected boolean canEqual(Object other) {
            return other instanceof CustomDTO;
        }

        public int hashCode() {
            int PRIME = true;
            int result = 1;
            long $key_money = Double.doubleToLongBits(this.getKey_money());
            result = result * 59 + (int)($key_money >>> 32 ^ $key_money);
            result = result * 59 + this.getQty();
            Object $res_id = this.getRes_id();
            result = result * 59 + ($res_id == null ? 43 : $res_id.hashCode());
            Object $date = this.getDate();
            result = result * 59 + ($date == null ? 43 : $date.hashCode());
            Object $student = this.getStudent();
            result = result * 59 + ($student == null ? 43 : $student.hashCode());
            Object $room = this.getRoom();
            result = result * 59 + ($room == null ? 43 : $room.hashCode());
            Object $status = this.getStatus();
            result = result * 59 + ($status == null ? 43 : $status.hashCode());
            Object $room_type_id = this.getRoom_type_id();
            result = result * 59 + ($room_type_id == null ? 43 : $room_type_id.hashCode());
            Object $type = this.getType();
            result = result * 59 + ($type == null ? 43 : $type.hashCode());
            Object $student_id = this.getStudent_id();
            result = result * 59 + ($student_id == null ? 43 : $student_id.hashCode());
            Object $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            Object $address = this.getAddress();
            result = result * 59 + ($address == null ? 43 : $address.hashCode());
            Object $contact_no = this.getContact_no();
            result = result * 59 + ($contact_no == null ? 43 : $contact_no.hashCode());
            Object $dob = this.getDob();
            result = result * 59 + ($dob == null ? 43 : $dob.hashCode());
            Object $gender = this.getGender();
            result = result * 59 + ($gender == null ? 43 : $gender.hashCode());
            Object $userName = this.getUserName();
            result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
            Object $password = this.getPassword();
            result = result * 59 + ($password == null ? 43 : $password.hashCode());
            return result;
        }

        public String toString() {
            return "CustomDTO(res_id=" + this.getRes_id() + ", date=" + this.getDate() + ", student=" + this.getStudent() + ", room=" + this.getRoom() + ", status=" + this.getStatus() + ", room_type_id=" + this.getRoom_type_id() + ", type=" + this.getType() + ", key_money=" + this.getKey_money() + ", qty=" + this.getQty() + ", student_id=" + this.getStudent_id() + ", name=" + this.getName() + ", address=" + this.getAddress() + ", contact_no=" + this.getContact_no() + ", dob=" + this.getDob() + ", gender=" + this.getGender() + ", userName=" + this.getUserName() + ", password=" + this.getPassword() + ")";
        }
    }

}

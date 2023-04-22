package lk.HostelManagementSystem.view.tm;

import java.time.LocalDate;

    public class StudentTM {
        private String student_id;
        private String name;
        private String address;
        private String contact_no;
        private LocalDate dob;
        private String gender

        public StudentTM() {
        }

        public StudentTM(String student_id, String name, String address, String contact_no, LocalDate dob, String gender) {
            this.student_id = student_id;
            this.name = name;
            this.address = address;
            this.contact_no = contact_no;
            this.dob = dob;
            this.gender = gender;
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

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof StudentTM)) {
                return false;
            } else {
                StudentTM other = (StudentTM)o;
                if (!other.canEqual(this)) {
                    return false;
                } else {
                    Object this$student_id = this.getStudent_id();
                    Object other$student_id = other.getStudent_id();
                    if (this$student_id == null) {
                        if (other$student_id != null) {
                            return false;
                        }
                    } else if (!this$student_id.equals(other$student_id)) {
                        return false;
                    }

                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name != null) {
                            return false;
                        }
                    } else if (!this$name.equals(other$name)) {
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

                    label62: {
                        Object this$contact_no = this.getContact_no();
                        Object other$contact_no = other.getContact_no();
                        if (this$contact_no == null) {
                            if (other$contact_no == null) {
                                break label62;
                            }
                        } else if (this$contact_no.equals(other$contact_no)) {
                            break label62;
                        }

                        return false;
                    }

                    label55: {
                        Object this$dob = this.getDob();
                        Object other$dob = other.getDob();
                        if (this$dob == null) {
                            if (other$dob == null) {
                                break label55;
                            }
                        } else if (this$dob.equals(other$dob)) {
                            break label55;
                        }

                        return false;
                    }

                    Object this$gender = this.getGender();
                    Object other$gender = other.getGender();
                    if (this$gender == null) {
                        if (other$gender != null) {
                            return false;
                        }
                    } else if (!this$gender.equals(other$gender)) {
                        return false;
                    }

                    return true;
                }
            }
        }

        protected boolean canEqual(Object other) {
            return other instanceof StudentTM;
        }

        public int hashCode() {
            int PRIME = true;
            int result = 1;
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
            return result;
        }

        public String toString() {
            return "StudentTM(student_id=" + this.getStudent_id() + ", name=" + this.getName() + ", address=" + this.getAddress() + ", contact_no=" + this.getContact_no() + ", dob=" + this.getDob() + ", gender=" + this.getGender() + ")";
        }
    }



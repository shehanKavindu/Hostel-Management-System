package lk.HostelManagementSystem.view.tm;

import java.time.LocalDate;

public class ResevationTM {
        private String res_id;
        private LocalDate date;
        private String student_id;
        private String room_type_id;
        private String status;

        public ReservationTM() {
        }

        public ReservationTM(String res_id, LocalDate date, String student_id, String room_type_id, String status) {
            this.res_id = res_id;
            this.date = date;
            this.student_id = student_id;
            this.room_type_id = room_type_id;
            this.status = status;
        }

        public String getRes_id() {
            return this.res_id;
        }

        public LocalDate getDate() {
            return this.date;
        }

        public String getStudent_id() {
            return this.student_id;
        }

        public String getRoom_type_id() {
            return this.room_type_id;
        }

        public String getStatus() {
            return this.status;
        }

        public void setRes_id(String res_id) {
            this.res_id = res_id;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public void setStudent_id(String student_id) {
            this.student_id = student_id;
        }

        public void setRoom_type_id(String room_type_id) {
            this.room_type_id = room_type_id;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof ReservationTM)) {
                return false;
            } else {
                ReservationTM other = (ReservationTM)o;
                if (!other.canEqual(this)) {
                    return false;
                } else {
                    label71: {
                        Object this$res_id = this.getRes_id();
                        Object other$res_id = other.getRes_id();
                        if (this$res_id == null) {
                            if (other$res_id == null) {
                                break label71;
                            }
                        } else if (this$res_id.equals(other$res_id)) {
                            break label71;
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

                    label57: {
                        Object this$student_id = this.getStudent_id();
                        Object other$student_id = other.getStudent_id();
                        if (this$student_id == null) {
                            if (other$student_id == null) {
                                break label57;
                            }
                        } else if (this$student_id.equals(other$student_id)) {
                            break label57;
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

                    Object this$status = this.getStatus();
                    Object other$status = other.getStatus();
                    if (this$status == null) {
                        if (other$status == null) {
                            return true;
                        }
                    } else if (this$status.equals(other$status)) {
                        return true;
                    }

                    return false;
                }
            }
        }

        protected boolean canEqual(Object other) {
            return other instanceof ReservationTM;
        }

        public int hashCode() {
            int PRIME = true;
            int result = 1;
            Object $res_id = this.getRes_id();
            result = result * 59 + ($res_id == null ? 43 : $res_id.hashCode());
            Object $date = this.getDate();
            result = result * 59 + ($date == null ? 43 : $date.hashCode());
            Object $student_id = this.getStudent_id();
            result = result * 59 + ($student_id == null ? 43 : $student_id.hashCode());
            Object $room_type_id = this.getRoom_type_id();
            result = result * 59 + ($room_type_id == null ? 43 : $room_type_id.hashCode());
            Object $status = this.getStatus();
            result = result * 59 + ($status == null ? 43 : $status.hashCode());
            return result;
        }

        public String toString() {
            return "ReservationTM(res_id=" + this.getRes_id() + ", date=" + this.getDate() + ", student_id=" + this.getStudent_id() + ", room_type_id=" + this.getRoom_type_id() + ", status=" + this.getStatus() + ")";
        }
    }



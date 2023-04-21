package lk.HostelManagementSystem.dto;

    public class UserDTO {
        private String userName;
        private String password;

        public UserDTO() {
        }

        public UserDTO(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        public String getUserName() {
            return this.userName;
        }

        public String getPassword() {
            return this.password;
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
            } else if (!(o instanceof UserDTO)) {
                return false;
            } else {
                UserDTO other = (UserDTO)o;
                if (!other.canEqual(this)) {
                    return false;
                } else {
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
            return other instanceof UserDTO;
        }

        public int hashCode() {
            int PRIME = true;
            int result = 1;
            Object $userName = this.getUserName();
            result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
            Object $password = this.getPassword();
            result = result * 59 + ($password == null ? 43 : $password.hashCode());
            return result;
        }

        public String toString() {
            return "UserDTO(userName=" + this.getUserName() + ", password=" + this.getPassword() + ")";
        }
    }

}

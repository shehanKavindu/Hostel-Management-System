package lk.HostelManagementSystem.dto;

public class RoomDTO {
    private String room_type_id;
    private String type;
    private double key_money;
    private int qty;

    public RoomDTO() {
    }

    public RoomDTO(String room_type_id, String type, double key_money, int qty) {
        this.room_type_id = room_type_id;
        this.type = type;
        this.key_money = key_money;
        this.qty = qty;
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

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof RoomDTO)) {
            return false;
        } else {
            RoomDTO other = (RoomDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (Double.compare(this.getKey_money(), other.getKey_money()) != 0) {
                return false;
            } else if (this.getQty() != other.getQty()) {
                return false;
            } else {
                label40: {
                    Object this$room_type_id = this.getRoom_type_id();
                    Object other$room_type_id = other.getRoom_type_id();
                    if (this$room_type_id == null) {
                        if (other$room_type_id == null) {
                            break label40;
                        }
                    } else if (this$room_type_id.equals(other$room_type_id)) {
                        break label40;
                    }

                    return false;
                }

                Object this$type = this.getType();
                Object other$type = other.getType();
                if (this$type == null) {
                    if (other$type != null) {
                        return false;
                    }
                } else if (!this$type.equals(other$type)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof RoomDTO;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        long $key_money = Double.doubleToLongBits(this.getKey_money());
        result = result * 59 + (int)($key_money >>> 32 ^ $key_money);
        result = result * 59 + this.getQty();
        Object $room_type_id = this.getRoom_type_id();
        result = result * 59 + ($room_type_id == null ? 43 : $room_type_id.hashCode());
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "RoomDTO(room_type_id=" + this.getRoom_type_id() + ", type=" + this.getType() + ", key_money=" + this.getKey_money() + ", qty=" + this.getQty() + ")";
    }


}

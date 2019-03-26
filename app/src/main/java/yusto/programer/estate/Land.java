package yusto.programer.estate;

public class Land {
    private String location;
    private int thumbNail;
    private String Rent_amout;

    public Land(String location, int thumbNail, String rent_amout) {
        this.location = location;
        this.thumbNail = thumbNail;
        Rent_amout = rent_amout;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getThumbNail() {
        return thumbNail;
    }

    public void setThumbNail(int thumbNail) {
        this.thumbNail = thumbNail;
    }

    public String getRent_amout() {
        return Rent_amout;
    }

    public void setRent_amout(String rent_amout) {
        Rent_amout = rent_amout;
    }
}

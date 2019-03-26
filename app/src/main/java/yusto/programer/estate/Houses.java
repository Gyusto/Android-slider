package yusto.programer.estate;

public class Houses {
    private String region;
    private String noOfHouses;
    private int thumbnail;

    public Houses(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Houses(String region, String noOfHouses, int thumbnail) {
        this.region = region;
        this.noOfHouses = noOfHouses;
        this.thumbnail = thumbnail;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNoOfHouses() {
        return noOfHouses;
    }

    public void setNoOfHouses(String noOfHouses) {
        this.noOfHouses = noOfHouses;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}

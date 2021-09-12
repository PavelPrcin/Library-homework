public class Address {
    private String streetName;
    private String streetNumber;
    private String city;
    private String country;

    public Address(String streetName, String streetNumber, String city, String country) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return this.streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "{" + " streetName='" + getStreetName() + "'" + ", streetNumber='" + getStreetNumber() + "'" + ", city='"
                + getCity() + "'" + ", country='" + getCountry() + "'" + "}";
    }

}

// street name, street number, city and country
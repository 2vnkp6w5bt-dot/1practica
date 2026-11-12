package mirea.lab2;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String country, String region, String city, String street, String house, String building, String apartment) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.building = building;
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Страна: " + country +
                " | Регион: " + region +
                " | Город: " + city +
                " | Улица: " + street +
                " | Дом: " + house +
                " | Корпус: " + building +
                " | Квартира: " + apartment;
    }
}
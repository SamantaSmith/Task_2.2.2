package web.controller;

public class CarModel {

    private String carBrand;
    private int serial;
    private String color;

    public CarModel(String carBrand, int serial, String color) {
        this.carBrand = carBrand;
        this.serial = serial;
        this.color = color;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

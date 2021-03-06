package pl.firma.projekt.carbase.entity;

import java.util.Objects;

public class Car {

    private int id;
    private String make;
    private String model;
    private int productionYear;
    private String fuel;
    private String engineVolume;

    public Car() {}

    public Car(String make, String model, int productionYear, String fuel, String engineVolume) {
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.fuel = fuel;
        this.engineVolume = engineVolume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", fuel='" + fuel + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                productionYear == car.productionYear &&
                Objects.equals(make, car.make) &&
                Objects.equals(model, car.model) &&
                Objects.equals(fuel, car.fuel) &&
                Objects.equals(engineVolume, car.engineVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make, model, productionYear, fuel, engineVolume);
    }
}

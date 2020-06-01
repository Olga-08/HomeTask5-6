package cars;

import interfaces.Movable;
import interfaces.Sellable;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Car implements Movable, Sellable {
    protected String name;
    protected String color;
    protected String typeOfEngine;
    protected Calendar releaseDate;
    protected CarBrand carBrand;
    protected boolean moving;
    protected int number;
    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd MMMM yyyy");

    public Car() {

    }

    public Car(String name, int number, String color, int year, int month, int dayOfMonth, CarBrand carBrand,
               boolean moving, String typeOfEngine) {
        this.name = name;
        this.typeOfEngine = typeOfEngine;
        this.number = number;
        this.color = color;
        this.releaseDate = new Calendar.Builder().setDate(year, month, dayOfMonth).build();
        this.carBrand = carBrand;
        this.moving = moving;
        this.typeOfEngine = typeOfEngine;
    }

    public abstract boolean move();

    public abstract boolean brake();

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return name.equals(car.name) &&
                carBrand.equals(car.carBrand) &&
                color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("cars.Car{").append("name='").append(name).append("'")
                .append(", number=").append(number)
                .append(", color='").append(color).append("'")
                .append(", releaseDate=").append(getReleaseDate())
                .append(", carBrand=").append(carBrand)
                .append(", moving=").append(moving)
                .append('}');
        return str.toString();
    }

    public String getReleaseDate() {
        return DATE_FORMAT.format(releaseDate.getTime());
    }
}

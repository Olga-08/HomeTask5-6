package cars;

public class PoliceCar extends Car {

    private int maxSpeed;
    private boolean flashingLight;
    private boolean walkieTalkie;
    private boolean intruder;
    private boolean timeToPatrol;
    private int price;

    public PoliceCar(String name, int number, String color, int dayOfMonth, int month, int year,
                     CarBrand carBrand, boolean moving, String typeOfEngine, boolean flashingLight,
                     boolean walkieTalkie, int maxSpeed, boolean intruder, int price) {
        super(name, number, color, year, month, dayOfMonth, carBrand, moving, typeOfEngine);
        this.flashingLight = flashingLight;
        this.walkieTalkie = walkieTalkie;
        this.maxSpeed = maxSpeed;
        this.intruder = intruder;
        this.price = price;
    }

    @Override
    public boolean move() {
        return timeToPatrol = true;
    }

    @Override
    public boolean brake() {
        return timeToPatrol = false;
    }

    public String persecution() {
        String policeCarWork;
        if (intruder) {
            policeCarWork = "Pursue!";
            setFlashingLight(true);
        } else {
            policeCarWork = "Patrol";
            setFlashingLight(false);
        }
        return policeCarWork;
    }

    public String persecution2() {
        String policeCarWork = "Wait for an order";
        return intruder ? (policeCarWork = "Pursue!") : (policeCarWork = "Patrol");
    }

    //метод, который определяет, включена мигалка или нет в зависимости от действий полици из пердыдущего метода
    public boolean isFlashingLight() {
        persecution();
        return flashingLight;
    }

    public String getName() {
        return name;
    }

    public void setFlashingLight(boolean flashingLight) {
        this.flashingLight = flashingLight;
    }

    public boolean getWalkieTalkie() {
        return walkieTalkie;
    }

    public void setWalkieTalkie(boolean walkieTalkie) {
        this.walkieTalkie = walkieTalkie;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean getIntruder() {
        return intruder;
    }

    public void setIntruder(boolean intruder) {
        this.intruder = intruder;
    }

    public int getPrice() {
        return price;
    }

}

public class EliteCar extends Car {


    private String typeOfUpholstery;
    private boolean longBase;
    private boolean bar;
    private boolean table;

    public EliteCar(String name, int number, String color, int dayOfMonth, int month, int year, CarBrand carBrand,
                    boolean moving, String typeOfEngine, String typeOfUpholstery, boolean longBase,
                    boolean bar, boolean table) {
        super(name, number, color, year, month, dayOfMonth, carBrand, moving, typeOfEngine);
        this.typeOfUpholstery = typeOfUpholstery;
        this.longBase = longBase;
        this.bar = bar;
        this.table = table;
    }

    public void openBar(int amountOfPassengers) {
        int champagneGlasses = 4;
        if (bar) {
            if (amountOfPassengers <= champagneGlasses) {
                System.out.println("Вдарим по шампусику");
            } else {
                System.out.println("Кто-то будет пить виски");
            }
        } else {
            System.out.println("Водитель! Где ближайший винный бутик?");
        }
    }

    public String readySteadyGo(TrafficLight lightColor) {
        String carState = "Waiting for traffic light";
        switch (lightColor) {
            case RED:
                carState = "Stop!";
                break;
            case YELLOW:
                carState = "Wait!";
                break;
            case GREEN:
                carState = "Go!";
                break;
        }
        return carState;
    }

    @Override
    public boolean move() {
        return true;
    }

    @Override
    public boolean brake() {
        return false;
    }

    public String getTypeOfUpholstery() {
        return typeOfUpholstery;
    }

    public void setTypeOfUpholstery(String typeOfUpholstery) {
        this.typeOfUpholstery = typeOfUpholstery;
    }

    public boolean getLongBase() {
        return longBase;
    }

    public void setLongBase(boolean longBase) {
        this.longBase = longBase;
    }

    public boolean getBar() {
        return bar;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }

    public boolean getTable() {
        return table;
    }

    public void setTable(boolean table) {
        this.table = table;
    }
}

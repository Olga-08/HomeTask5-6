package cars;


import java.util.Arrays;

public class EliteCar extends Car {

    public BarContent miniBar;
    private String typeOfUpholstery;
    private boolean longBase;
    private boolean bar;
    private boolean table;
    private int price;

    public EliteCar(String name, int number, String color, int dayOfMonth, int month, int year, CarBrand carBrand,
                    boolean moving, String typeOfEngine, String typeOfUpholstery, boolean longBase,
                    boolean bar, boolean table, int price) {
        super(name, number, color, year, month, dayOfMonth, carBrand, moving, typeOfEngine);
        this.typeOfUpholstery = typeOfUpholstery;
        this.longBase = longBase;
        this.bar = bar;
        this.table = table;
        this.price = price;
        miniBar = new BarContent(new String[]{"champagne", "whiskey", "mojito", "vine", "scotch", "water"});
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

    public class BarContent {
        private String[] drinks;

        public BarContent(String[] drinks) {
            this.drinks = drinks;
        }

        public boolean isEmpty() {
            return drinks.length == 0;
        }

        public void printBarContent() {
            for (int i = 0; i < drinks.length; i++) {
                System.out.println(i + ". " + drinks[i]);
            }
        }

        public String chooseDrink(int index) {
            String drink;
            if (drinks.length == 0) {
                drink = "The bar is empty";
            } else if (index >= drinks.length || index < 0) {
                drink = "Such drink isn't exist";
            } else {
                drink = drinks[index];
                String[] tempDrinks = new String[drinks.length - 1];
                System.arraycopy(drinks, 0, tempDrinks, 0, index);
                System.arraycopy(drinks, index + 1, tempDrinks, index, drinks.length - index - 1);
                drinks = tempDrinks;
            }
            return drink;
        }

        public String[] replenishBar(String[] newDrinks) {
            String[] tempDrinks = new String[drinks.length + newDrinks.length];
            tempDrinks = Arrays.copyOf(drinks, drinks.length + newDrinks.length);
            System.arraycopy(newDrinks, 0, tempDrinks, drinks.length, newDrinks.length);
            drinks = tempDrinks;
            return drinks;
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
        return moving = true;
    }

    @Override
    public boolean brake() {
        return moving = false;
    }

    @Override
    public String getName() {
        return name;
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

    public int getPrice() {
        return price;
    }
}

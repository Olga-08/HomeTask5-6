import bicycles.Bicycle;
import bicycles.FrameSize;
import cars.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import store.Store;
import tanks.Commands;
import tanks.Tank;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Car continental = new EliteCar("Bentley", 5555, "red", 15, Calendar.MARCH,
                2015, CarBrand.BENTLEY, false, "V8", "leather",
                false, true, false, 260_000);
        System.out.println("Is car moving? " + ((EliteCar) continental).move());
        ((EliteCar) continental).openBar(7);
        System.out.println("cars.Car in process " + ((EliteCar) continental).readySteadyGo(TrafficLight.GREEN));
        System.out.println((continental) + "\n");

        Car policeMazda = new PoliceCar("Mazda", 2587, "white-blue", 26, Calendar.OCTOBER,
                2015, CarBrand.MAZDA, true, "V6", false, false, 280,
                false, 35_000);
        System.out.println("Is car moving? " + policeMazda.move());
        System.out.println("Police car work is " + ((PoliceCar) policeMazda).persecution());
        System.out.println("Is flashlight on? " + ((PoliceCar) policeMazda).isFlashingLight());
        System.out.println((policeMazda) + "\n");

        System.out.println("cars.Car comparison " + continental.equals(policeMazda) + "\n");

        Bicycle bicycle1 = new Bicycle("GT", " Aggressor Comp", "Mountain", "aluminum",
                "black", 27, FrameSize.SIZE_19, 24, true, false, 450);
        System.out.println("Is bicycle moving? " + bicycle1.move());
        System.out.println("Is bicycle moving on border? " + bicycle1.moveOnTheBorder(6));
        System.out.println("Is this bicycle good for me? " + bicycle1.chooseBicycle(168));
        System.out.println(bicycle1 + "\n");

        Tank tank1 = new Tank("T90", "Composite", 492, 125, 43, 3,
                46.5, 3_500_000);
        System.out.println("Is tank moving now? " + tank1.move(Commands.GO));
        System.out.println("Is tank is braking now? " + tank1.brake(Commands.GO));
        System.out.println("Command for tank is " + tank1.command(26));
        System.out.println("Type of tank by weight is " + tank1.byWeight());
        System.out.println(tank1 + "\n");

        System.out.println("Home task 6");

        Bicycle bicycle2 = new Bicycle("Stels", "Navigator 210 Lady Z010", "crossCountry",
                "steel", "blue", 26,
                FrameSize.SIZE_19, 0, false, true, 210);

        Bicycle bicycle3 = new Bicycle("Merida", "Big.Nine 10-MD", "Mountain",
                "aluminum", "silver", 29, FrameSize.SIZE_18, 21, true,
                false, 380);

        Bicycle[] bicycles = {bicycle1, bicycle2, bicycle3};
        Store<Bicycle> YourBicycle = new Store<>(bicycles, 350);
        System.out.println();

        System.out.println("Cash at cash box " + YourBicycle.getCashBox());
        System.out.println("Products in stoke");
        YourBicycle.printProducts();
        System.out.println();

        System.out.println("Purchase");
        Bicycle bicycle4 = YourBicycle.purchase(1, 1000);
        System.out.println("Products in stoke");
        YourBicycle.printProducts();
        System.out.println();

        System.out.println("Sell product");
        YourBicycle.sell(bicycle4, 210);
        System.out.println("Products in stoke");
        YourBicycle.printProducts();
        System.out.println();

        System.out.println("Elit Car. Inner class");
        System.out.println("Is mini bar empty? " + ((EliteCar) continental).miniBar.isEmpty());
        System.out.println("Minibar content is:");
        ((EliteCar) continental).miniBar.printBarContent();
        System.out.println("Choose some drink, please");
        System.out.println("You've chosen " + ((EliteCar) continental).miniBar.chooseDrink(5));
        String[] newDrinks = new String[]{"liquor", "rum", "prosecco"};
        System.out.println("Replenish the bar, please");
        ((EliteCar) continental).miniBar.replenishBar(newDrinks);
        System.out.println("Minibar content is:");
        ((EliteCar) continental).miniBar.printBarContent();
    }
}

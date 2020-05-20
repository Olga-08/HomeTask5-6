import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Car continental = new EliteCar("Bentley", 5555, "red", 15, Calendar.MARCH,
                2015, CarBrand.BENTLEY, false, "V8", "leather",
                false, true, false);
        System.out.println("Is car moving " + ((EliteCar) continental).move());
        ((EliteCar) continental).openBar(7);
        System.out.println("Car in process " + ((EliteCar) continental).readySteadyGo(TrafficLight.GREEN));
        System.out.println((continental) + "\n");

        Car policeMazda = new PoliceCar("Mazda", 2587, "white-blue", 26, Calendar.OCTOBER,
                2015, CarBrand.MAZDA, true, "V6", false, false, 280,
                false);
        System.out.println("Is car moving? " + policeMazda.move());
        System.out.println("Police car work is " + ((PoliceCar) policeMazda).persecution());
        System.out.println("Is flashlight on? " + ((PoliceCar) policeMazda).isFlashingLight());
        System.out.println((policeMazda) + "\n");

        System.out.println("Car comparison " + continental.equals(policeMazda) + "\n");

        Bicycle GT = new Bicycle("Mountain", "aluminum", "black", 27,
                FrameSize.SIZE_19, 24, true, false);
        System.out.println("Is bicycle moving? "+GT.move());
        System.out.println("Is bicycle moving on border? "+GT.moveOnTheBorder(6));
        System.out.println("Is this bicycle good for me? "+GT.chooseBicycle(168));
        System.out.println(GT+"\n");

        Tank T90 = new Tank("Composite", 492, 125, 43, 3,46.5);
        System.out.println("Command for tank is "+T90.command(26));
        System.out.println("Type of tank by weight is "+T90.byWeight());
        System.out.println(T90);

    }
}

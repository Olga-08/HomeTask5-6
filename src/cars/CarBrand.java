package cars;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public enum CarBrand {
    MAZDA("Mazda", "Japan", "JujiroMatsuda",
            new Calendar.Builder().setDate(1920, Calendar.JANUARY, 30).build()),
    MAYBACH("Maybach", "Germany", "August Wilhelm Maybach",
            new Calendar.Builder().setDate(1909, Calendar.APRIL, 14).build()),
    SKODA("Skoda", "Czech Republic", "Count Wallenstein-Wartenberg",
            new Calendar.Builder().setDate(1895, Calendar.DECEMBER, 18).build()),
    BENTLEY("Bentley", "Great Britain", "W.O. Bentley, H. M. Bentley",
            new Calendar.Builder().setDate(1919, Calendar.JANUARY, 18).build()),
    VOLKSWAGEN("Volkswagen", "Germany", "DAF",
            new Calendar.Builder().setDate(1937, Calendar.MAY, 28).build()),
    ROLLS_ROYCE("Rolls-Royce", "Great Britain", "Charles Rolls and Henry Royce",
            new Calendar.Builder().setDate(1904, Calendar.MAY, 1).build());

    private String name;
    private String country;
    private String creator;
    private Calendar foundingDate;
    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd MMMM yyyy");

    CarBrand(String name, String country, String creator, Calendar foundingDate) {
        this.name = name;
        this.country = country;
        this.creator = creator;
        this.foundingDate = foundingDate;
    }

    public String getFoundingDate() {
        return DATE_FORMAT.format(foundingDate.getTime());
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCreator() {
        return creator;
    }
}



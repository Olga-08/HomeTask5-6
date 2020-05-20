public class Bicycle implements Movable {

    private String typeOfBicycle;
    private String frameMaterial;
    private String color;
    private int wheelRadius;
    private FrameSize frameSize;
    private int numberOfGears;
    private boolean damping;
    private boolean basket;


    public Bicycle() {

    }

    public Bicycle(String typeOfBicycle, String frameMaterial, String color, int wheelRadius, FrameSize frameSize,
                   int numberOfGears, boolean damping, boolean basket) {
        this.typeOfBicycle = typeOfBicycle;
        this.frameMaterial = frameMaterial;
        this.color = color;
        this.wheelRadius = wheelRadius;
        this.frameSize = frameSize;
        this.numberOfGears = numberOfGears;
        this.damping = damping;
        this.basket = basket;
    }

    public boolean move() {
        return true;
    }

    public boolean moveOnTheBorder(int heightOfBorder) {

        final int MAX_HEIGHT_IN_PERCENTS = 15;

        boolean can = false;
        if (wheelRadius * 15 / 100 >= heightOfBorder) {
            can = true;
        }
        return can;
    }

    public boolean chooseBicycle(int height) {
        return !(height < frameSize.getMinHeight() || height > frameSize.getMaxHeight());
    }

    public boolean chooseBicycle(FrameSize frameSize) {
        return frameSize.equals(this.frameSize);
    }

    public String getTypeOfBicycle() {
        return typeOfBicycle;
    }

    public void setTypeOfBicycle(String typeOfBicycle) {
        this.typeOfBicycle = typeOfBicycle;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public String getColor() {
        return color;
    }


    public int getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius() {
        this.wheelRadius = wheelRadius;
    }

    public FrameSize getFrameSize() {
        return frameSize;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public boolean isDampingDamping() {
        return damping;
    }

    public void setDamping(boolean damping) {
        this.damping = damping;
    }

    public boolean isBasket() {
        return basket;
    }

    public void setBasket(boolean basket) {
        this.basket = basket;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Bicycle bicycle = (Bicycle) obj;
        return typeOfBicycle.equals(bicycle.typeOfBicycle) &&
                frameMaterial.equals(bicycle.frameMaterial) &&
                color.equals(bicycle.color);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Bicycle{").append("typeOfBicycle='").append(typeOfBicycle).append("'")
                .append(", frameMaterial='").append(frameMaterial).append("'")
                .append(", color='").append(color).append("'")
                .append(", wheelRadius=").append(wheelRadius)
                .append(", frameSize=").append(frameSize)
                .append(", numberOfGears=").append(numberOfGears)
                .append(", damping=").append(damping)
                .append(", basket=").append(basket)
                .append('}');
        return str.toString();
    }
}

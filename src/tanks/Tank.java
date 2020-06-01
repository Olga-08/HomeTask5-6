package tanks;

import interfaces.Movable;
import interfaces.Sellable;

import static tanks.Commands.*;

public class Tank implements Movable, Sellable {

    private String name;
    private String armor;
    private int clearance;
    private int caliber;
    private int gunAmmunition;
    private int crew;
    private double combatMass;
    private Commands command;
    private int price;

    public Tank() {

    }

    public Tank(String name, String armor, int clearance, int caliber, int gunAmmunition, int crew, double combatMass,
                int price) {
        this.armor = armor;
        this.clearance = clearance;
        this.caliber = caliber;
        this.gunAmmunition = gunAmmunition;
        this.crew = crew;
        this.combatMass = combatMass;
        this.price = price;
    }

    public boolean move(Commands command) {
        this.command = command;
        return move();
    }

    @Override
    public boolean move() {
        return command == GO;
    }

    public boolean brake() {
        boolean result;
        switch (command) {
            case STOP:
            case FIRE:
                result = true;
                break;
            default:
                result = false;
        }
        return result;
    }

    public boolean brake(Commands command) {
        this.command = command;
        return brake();
    }

    public String command(int currentGunAmmunition) {
        if (currentGunAmmunition > 0 & currentGunAmmunition <= gunAmmunition) {
            return "Fire!";
        } else {
            return "Reload gun!";
        }
    }

    public String byWeight() {
        if (combatMass >= 3 & combatMass < 5) {
            return "small tank";
        } else if (combatMass >= 5 & combatMass < 20) {
            return "light tank";
        } else if (combatMass >= 20 & combatMass < 40) {
            return "medium tank";
        } else if (combatMass >= 40 & combatMass < 80) {
            return "heavy tank";
        } else if (combatMass <= 80 & combatMass <= 200) {
            return "super-heavy tank";
        } else {
            return "Such tank doesn't exist";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public int getClearance() {
        return clearance;
    }

    public void setClearance(int clearance) {
        this.clearance = clearance;
    }

    public int getCaliber() {
        return caliber;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public int getGunAmmunition() {
        return gunAmmunition;
    }

    public void setGunAmmunition(int gunAmmunition) {
        this.gunAmmunition = gunAmmunition;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public double getCombatMass() {
        return combatMass;
    }

    public void setCombatMass(double combatMass) {
        this.combatMass = combatMass;
    }

    public Commands getCommand() {
        return command;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null && obj.getClass() != this.getClass()) {
            return false;
        }
        Tank tank = (Tank) obj;
        return armor.equals(tank.armor);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("tanks.Tank{").append("armor='").append(armor).append("'")
                .append(", clearance=").append(clearance)
                .append(", caliber=").append(caliber)
                .append(", gunAmmunition=").append(gunAmmunition)
                .append(", crew=").append(crew)
                .append(", combatMass=").append(combatMass)
                .append('}');
        return str.toString();
    }
}

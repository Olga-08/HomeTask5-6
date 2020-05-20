public class Tank implements Movable {

    private String armor;
    private int clearance;
    private int caliber;
    private int gunAmmunition;
    private int crew;
    private double combatMass;

    public Tank() {

    }

    public Tank(String armor, int clearance, int caliber, int gunAmmunition, int crew, double combatMass) {
        this.armor = armor;
        this.clearance = clearance;
        this.caliber = caliber;
        this.gunAmmunition = gunAmmunition;
        this.crew = crew;
        this.combatMass = combatMass;
    }

    public boolean move() {
        return true;
    }

    public String command(int currentGunAmmunition) {
        if(currentGunAmmunition > 0 & currentGunAmmunition<= gunAmmunition) {
            return "Fire!";
        }
        else {
            return "Reload gun!";
        }
    }

    public String byWeight() {
        if(combatMass>=3 & combatMass <5) {
            return "It's a small tank";
        }
        else if(combatMass>=5 & combatMass<20){
            return "It's a light tank";
        }
        else if(combatMass>=20 & combatMass<40) {
            return "It's medium tank";
        }
        else if(combatMass>=40 & combatMass<80) {
            return "It's a heavy tank";
        }
        else if (combatMass<=80 & combatMass<=200) {
            return "It's a super-heavy tank";
        }
        else {
            return "Such tank doesn't exist";
        }
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
         str.append("Tank{").append("armor='").append( armor ).append("'")
                 .append(", clearance=").append( clearance )
                 .append(", caliber=").append( caliber )
                 .append(", gunAmmunition=" ).append( gunAmmunition )
                 .append(", crew=" ).append( crew )
                 .append(", combatMass=" ).append( combatMass )
                 .append('}');
         return str.toString();
    }
}

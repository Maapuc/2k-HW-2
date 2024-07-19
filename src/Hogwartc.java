public class Hogwartc {

    private String Name;
    private int magicPower;
    private int transgressionDitsance;


    public Hogwartc(String name, int magicPower, int transgressionDitsance) {
        Name = name;
        this.magicPower = magicPower;
        this.transgressionDitsance = transgressionDitsance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDitsance() {
        return transgressionDitsance;
    }

    public void setTransgressionDitsance(int transgressionDitsance) {
        this.transgressionDitsance = transgressionDitsance;
    }

    public int sumPoweraMagic() {
        return magicPower + transgressionDitsance;
    }

    public static void powerStudent(Griffindor griffindorOne, Slizarin slizarinTwo) {
        if (griffindorOne.sumPoweraMagic() < slizarinTwo.sumPoweraMagic()) {
            System.out.println(griffindorOne + " обладает бОльшей мощностью магии, чем " + slizarinTwo);
        } else if (griffindorOne.sumPower() > slizarinTwo.sumPower()) {
            System.out.println(griffindorOne + " обладает бОльшей мощностью магии, чем " + slizarinTwo);
        } else {
            System.out.println(griffindorOne + " они равны " + slizarinTwo);
        }
    }

    @Override
    public String toString() {
        return "Name='" + Name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDitsance=" + transgressionDitsance;
    }
}
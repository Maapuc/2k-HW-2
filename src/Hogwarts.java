public class Hogwarts {

    private String name;
    private int magicPower;
    private int transgressionDitsance;


    public Hogwarts(String name, int magicPower, int transgressionDitsance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDitsance = transgressionDitsance;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        name = name;
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
        } else if (griffindorOne.sumPoweraMagic() > slizarinTwo.sumPoweraMagic()) {
            System.out.println(griffindorOne + " обладает бОльшей мощностью магии, чем " + slizarinTwo);
        } else {
            System.out.println(griffindorOne + " они равны " + slizarinTwo);
        }
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDitsance=" + transgressionDitsance;
    }
}
public class Kogtevran extends Hogwarts {

    public int mind;
    public int wisdom;
    public int wit;
    public int creation;

    public Kogtevran(String name, int magicPower, int transgressionDitsance, int mind, int wisdom, int wit, int creation) {
        super(name, magicPower, transgressionDitsance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int sumPower() {
        return mind + wisdom + wit + creation;
    }

    public static void bestStudent(Kogtevran kogtevranOne, Kogtevran kogtevranTwo) {
        if (kogtevranOne.sumPower() < kogtevranTwo.sumPower()) {
            System.out.println(kogtevranOne + " лучший Когтевранец, чем " + kogtevranTwo);
        } else if (kogtevranOne.sumPower() > kogtevranTwo.sumPower()) {
            System.out.println(kogtevranOne + " лучший Когтевранец, чем " + kogtevranTwo);
        } else {
            System.out.println(kogtevranOne + " то они равны " + kogtevranTwo);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation;
    }
}


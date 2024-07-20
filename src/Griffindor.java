public class Griffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magicPower, int transgressionDitsance, int honor, int bravery, int nobility) {
        super(name, magicPower, transgressionDitsance);
        this.honor = honor;
        this.bravery = bravery;
        this.nobility = nobility;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int sumPower() {
        return nobility + honor + bravery;
    }

    public static void bestStudent(Griffindor griffindorOne, Griffindor griffindorTwo) {
        if (griffindorOne.sumPower() < griffindorTwo.sumPower()) {
            System.out.println(griffindorOne + " лучший Гриффиндорец, чем " + griffindorTwo);
        } else if (griffindorOne.sumPower() > griffindorTwo.sumPower()) {
            System.out.println(griffindorOne + " лучший Гриффиндорец, чем " + griffindorTwo);
        } else {
            System.out.println(griffindorOne + " то они равны " + griffindorTwo);
        }
    }
    @Override

    public String toString() {
        return super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }


}

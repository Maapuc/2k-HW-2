public class Puffedyi extends Hogwarts {

    public int hardWorking;
    public int loyalty;
    public int honesty;

    public Puffedyi(String name, int magicPower, int transgressionDitsance, int hardWorking, int loyalty, int honesty) {
        super(name, magicPower, transgressionDitsance);
        this.hardWorking = hardWorking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public void setHardWorking(int hardWorking) {
        this.hardWorking = hardWorking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int sumPower() {
        return hardWorking + loyalty + honesty;
    }

    public static void bestStudent(Puffedyi puffedyiOne, Puffedyi puffedyiTwo) {
        if (puffedyiOne.sumPower() < puffedyiTwo.sumPower()) {
            System.out.println(puffedyiOne + " лучший Когтевранец, чем " + puffedyiTwo);
        } else if (puffedyiOne.sumPower() > puffedyiTwo.sumPower()) {
            System.out.println(puffedyiOne + " лучший Когтевранец, чем " + puffedyiTwo);
        } else {
            System.out.println(puffedyiOne + " то они равны " + puffedyiTwo);


        }
    }
    @Override
    public String toString () {
        return super.toString() +
                ", hardWorking=" + hardWorking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
}

}



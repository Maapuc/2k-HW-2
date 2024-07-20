public class Slizarin extends Hogwarts {

    public int cuning;
    public int determination;
    public int ambition;
    public int resourcefulness;
    public int lustPower;

    public Slizarin(String name,
                    int magicPower,
                    int transgressionDitsance,
                    int cuning,
                    int lustPower,
                    int resourcefulness,
                    int ambition,
                    int determination) {
        super(name, magicPower, transgressionDitsance);
        this.cuning = cuning;
        this.lustPower = lustPower;
        this.resourcefulness = resourcefulness;
        this.ambition = ambition;
        this.determination = determination;
    }

    public int getCuning() {
        return cuning;
    }

    public void setCuning(int cuning) {
        this.cuning = cuning;
    }

    public int getLustPower() {
        return lustPower;
    }

    public void setLustPower(int lustPower) {
        this.lustPower = lustPower;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int sumPower() {
        return cuning + lustPower + resourcefulness + ambition + determination;
    }

    public static void bestStudent(Slizarin slizarinOne, Slizarin slizarinTwo) {
        if (slizarinOne.sumPower() < slizarinTwo.sumPower()) {
            System.out.println(slizarinOne + " лучший Когтевранец, чем " + slizarinTwo);
        } else if (slizarinOne.sumPower() > slizarinTwo.sumPower()) {
            System.out.println(slizarinOne + " лучший Когтевранец, чем " + slizarinTwo);
        } else {
            System.out.println(slizarinOne + " то они равны " + slizarinTwo);


        }

    }

    @Override
    public String toString() {
        return super.toString() +
                ", cuning=" + cuning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustPower=" + lustPower +
                '}';
    }
}


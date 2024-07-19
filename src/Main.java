public class Main {
    private static Griffindor[] griffindor = new Griffindor[3];
    private static Kogtevran[] kogtevran = new Kogtevran[3];
    private static Puffedyi[] puffedyi = new Puffedyi[3];
    private static Slizarin[] slizarin = new Slizarin[3];

    public static void main(String[] args) {

        griffindor[0] = new Griffindor("Гари потер", 99, 80, 99, 99, 95);
        griffindor[1] = new Griffindor("Гермиона Грейнджер", 99, 70, 89, 69, 85);
        griffindor[2] = new Griffindor("Рон Уизли", 60, 80, 69, 89, 75);

        kogtevran[0] = new Kogtevran("Чжоу Чанг", 11, 60, 79, 9, 85, 33);
        kogtevran[1] = new Kogtevran("Падма Патил", 22, 50, 69, 56, 95, 53);
        kogtevran[2] = new Kogtevran("Маркус Белби", 99, 80, 39, 49, 95, 43);

        puffedyi[0] = new Puffedyi("Захария Смит", 44, 80, 49, 89, 95);
        puffedyi[1] = new Puffedyi("Седрик Диггори", 55, 70, 59, 79, 35);
        puffedyi[2] = new Puffedyi("Джастин Финч-Флетчли", 66, 90, 69, 59, 45);

        slizarin[0] = new Slizarin("Драко Малфой,", 89, 40, 96, 67, 67, 49, 94);
        slizarin[1] = new Slizarin("Грэхэм Монтегю", 79, 60, 45, 45, 56, 95, 85);
        slizarin[2] = new Slizarin("Грегори Гойл", 49, 50, 76, 34, 87, 84, 75);

        Griffindor.beastStudent(griffindor[0], griffindor[1]);
        Kogtevran.beastStudent(kogtevran[1], kogtevran[2]);
        Puffedyi.beastStudent(puffedyi[0], puffedyi[1]);
        Slizarin.beastStudent(slizarin[2], slizarin[1]);

        Hogwartc.powerStudent(griffindor[0],slizarin[0]);

    }



}


public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 50, 60, 76, 43, 100);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 80, 97, 87,84,79);
        Gryffindor ronWisly = new Gryffindor("Рон Уизли", 68,53,67,85,52);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 78,87,56,98,67,45,87);
        hermioneGranger.compare(dracoMalfoy);
        ronWisly.compare(dracoMalfoy);
        harryPotter.compare(ronWisly);


    }
}

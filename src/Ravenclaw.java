public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgression, int smart, int wise, int witty, int creativity) {
        super(name, magicPower, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    private int calculateCompositePower() {
        return this.smart + this.wise + this.witty + this.creativity;
    }

    public void compare(Ravenclaw student) {
        if (this.calculateCompositePower() > student.calculateCompositePower()) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return getName() + "\n" +
                "студент факультета Когтевран\n" +
                "magicPower = " + getMagicPower() + "\n" +
                "transgression = " + getTransgression() + "\n" +
                "smart = " + smart + "\n" +
                "wise = " + wise + "\n" +
                "witty = " + witty + "\n" +
                "creativity = " + creativity;
    }
}

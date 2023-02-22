public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgression, int nobility, int honor, int bravery) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
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

    private int calculateCompositePower() {
        return this.nobility + this.honor + this.bravery;
    }

    public void compare(Gryffindor student) {
        if (this.calculateCompositePower() > student.calculateCompositePower()) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return getName() + "\n" +
                "студент факультета Гриффендор\n" +
                "magicPower = " + getMagicPower() + "\n" +
                "transgression = " + getTransgression() + "\n" +
                "nobility = " + nobility + "\n" +
                "honor = " + honor + "\n" +
                "bravery = " + bravery;
    }
}

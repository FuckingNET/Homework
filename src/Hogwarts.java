public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgression;

    public Hogwarts(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void compare(Hogwarts student) {
        if (this.magicPower + this.transgression > student.magicPower + student.transgression) {
            System.out.println(this.name + " владеет магией лучше, чем " + student.name);
        } else {
            System.out.println(student.name + " владеет магией лучше, чем " + this.name);
        }
    }
}

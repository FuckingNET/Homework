public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int fealty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgression, int hardworking, int fealty, int honesty) {
        super(name, magicPower, transgression);
        this.hardworking = hardworking;
        this.fealty = fealty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getFealty() {
        return fealty;
    }

    public void setFealty(int fealty) {
        this.fealty = fealty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int calculateCompositePower() {
        return this.hardworking + this.fealty + this.honesty;
    }

    public void compare(Hufflepuff student) {
        if (this.calculateCompositePower() > student.calculateCompositePower()) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучший Пуффендуец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return getName() + "\n" +
                "студент факультета Пуффендуй\n" +
                "magicPower = " + getMagicPower() + "\n" +
                "transgression = " + getTransgression() + "\n" +
                "hardworking = " + hardworking + "\n" +
                "fealty = " + fealty + "\n" +
                "honesty = " + honesty;
    }
}

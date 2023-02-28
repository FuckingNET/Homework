public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgression, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    private int calculateCompositePower() {
        return this.trick + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
    }

    public void compare(Slytherin student) {
        if (this.calculateCompositePower() > student.calculateCompositePower()) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return getName() + "\n" +
                "студент факультета Слизерин\n" +
                "magicPower = " + getMagicPower() + "\n" +
                "transgression = " + getTransgression() + "\n" +
                "trick = " + trick + "\n" +
                "determination = " + determination + "\n" +
                "ambition = " + ambition + "\n" +
                "resourcefulness = " + resourcefulness + "\n" +
                "lustForPower = " + lustForPower;
    }
}

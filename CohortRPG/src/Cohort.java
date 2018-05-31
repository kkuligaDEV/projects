public class Cohort {
    private int soldiers;
    private String name;
    private int cohortStrength;
    private RandomGenerator generator = new RandomGenerator(7,12) ;

    public Cohort() {
        this("UNKNOWN",false);
    }

    public Cohort(String name, boolean enemy) {
        this.name = name;
        if (!enemy) {
            this.soldiers = 500;
            this.cohortStrength = 10;
        } else {
            this.cohortStrength = generator.nextInt();
            generator.changeRanges(120,640);
            this.soldiers = generator.nextInt();
        }

    }



    public int getCohortStrength() {
        return cohortStrength;
    }

    public void setCohortStrength(int cohortStrength) {
        this.cohortStrength = cohortStrength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(int soldiers) {
        this.soldiers = soldiers;
    }

    @Override
    public String toString() {
        return "Cohort{" +
                "soldiers=" + soldiers +
                ", name='" + name + '\'' +
                ", cohortStrength=" + cohortStrength +
                '}';
    }
}

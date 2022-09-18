public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudent(String name, int magik, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magik, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
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
    private int ability () {return cunning + determination + ambition + resourcefulness + lustForPower;}



    public void compareSlytherin (SlytherinStudent slytherinStudent) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n", getName(), slytherinStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n", slytherinStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Слизеринец %s такой же, как слизеринец %s: %d VS %d%n", slytherinStudent.getName(), getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s, хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d; жажда власти: %d", super.toString(), cunning, determination, ambition, resourcefulness, lustForPower);
    }
}

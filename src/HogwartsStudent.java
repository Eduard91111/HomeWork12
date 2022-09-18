public abstract class HogwartsStudent {
    private String name;
    private int magik;
    private int transgression;

    public HogwartsStudent(String name, int magik, int transgression) {
        this.name = name;
        this.magik = magik;
        this.transgression = transgression;
    }

    public String getName() { return name; }

    public int getMagik() { return magik; }

    public int getTransgression() { return transgression; }

    public void setName(String name) { this.name = name; }

    public void setMagik(int magik) { this.magik = magik; }

    public void setTransgression(int transgression) { this.transgression = transgression; }

    private int ability () {return magik + transgression;}
    public void print () { System.out.println(this); }

    public void compareHogwarts (HogwartsStudent hogwartsStudent){
        int ability1 = ability ();
        int ability2 = hogwartsStudent.ability ();
        if (ability1 > ability2) {
            System.out.printf ("Студент %s лучше, чем студент %s: %d VS %d%n", getName (), hogwartsStudent.getName (), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", hogwartsStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n", hogwartsStudent.getName(), getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгрессии: %d", name, magik, transgression);
    }
}


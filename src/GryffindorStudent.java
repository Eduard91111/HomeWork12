public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent (String name, int magik, int transgression, int nobility, int honor, int bravery) {
        super(name, magik, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() { return nobility; }

    public int getHonor() { return honor; }

    public int getBravery() { return bravery; }

    public void setName(int nobility) { this.nobility = nobility; }

    public void setHonor(int honor) { this.honor = honor; }

    public void setBravery(int bravery) { this.bravery = bravery; }

    private int ability () {return nobility + honor + bravery;}


    public void compareGryffindor (GryffindorStudent gryffindorStudent){
        int ability1 = ability ();
        int ability2 = gryffindorStudent.ability ();
        if (ability1 > ability2) {
            System.out.printf ("Грифендорец %s лучше, чем грифендорец %s: %d VS %d%n", getName (), gryffindorStudent.getName (), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Грифендорец %s лучше, чем грифендорец %s: %d VS %d%n", gryffindorStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Грифендорец %s такой же, как грифендорец %s: %d VS %d%n", gryffindorStudent.getName(), getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s, благородство: %d; честь: %d; храбрость: %d", super.toString(), nobility, honor, bravery);
    }
}

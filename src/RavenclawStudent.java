public class RavenclawStudent extends HogwartsStudent {
    private int smart;
    private int wise;
    private int witty;
    private int creative;


    public RavenclawStudent (String name, int magik, int transgression, int industriousness, int loyalty, int honesty, int creative) {
        super(name, magik, transgression);
        this.smart = industriousness;
        this.wise = loyalty;
        this.witty = honesty;
        this.creative = creative;
    }

    public int getSmart() { return smart; }

    public int getWise() { return wise; }

    public int getWitty() { return witty; }
    public int getСreative() { return creative; }

    public void setName(int industriousness) { this.smart = industriousness; }

    public void setWise(int wise) { this.wise = wise; }

    public void setWitty(int witty) { this.witty = witty; }

    public void setCreative(int creative) {this.creative = creative;}

    private int ability () {return smart + wise + witty + creative;}


    public void compareRavenclaw (RavenclawStudent ravenclawStudent){
        int ability1 = ability ();
        int ability2 = ravenclawStudent.ability ();
        if (ability1 > ability2) {
            System.out.printf ("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n", getName (), ravenclawStudent.getName (), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n", ravenclawStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Когтевранец %s такой же, как когтевранец %s: %d VS %d%n", ravenclawStudent.getName(), getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s, ум: %d; мудрость: %d; остроумие: %d; творчество: %d", super.toString(), smart, wise, witty, creative);
    }
}

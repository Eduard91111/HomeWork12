public class HufflepuffStudent extends HogwartsStudent {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent (String name, int magik, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magik, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() { return industriousness; }

    public int getLoyalty() { return loyalty; }

    public int getHonesty() { return honesty; }

    public void setName(int industriousness) { this.industriousness = industriousness; }

    public void setLoyalty(int loyalty) { this.loyalty = loyalty; }

    public void setHonesty(int honesty) { this.honesty = honesty; }

    private int ability () {return industriousness + loyalty + honesty;}


    public void compareHufflepuff (HufflepuffStudent hufflepuffStudent){
        int ability1 = ability ();
        int ability2 = hufflepuffStudent.ability ();
        if (ability1 > ability2) {
            System.out.printf ("Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n", getName (), hufflepuffStudent.getName (), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n", hufflepuffStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Пуффендуец %s такой же, как пуффендуец %s: %d VS %d%n", hufflepuffStudent.getName(), getName(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s, благородство: %d; честь: %d; храбрость: %d", super.toString(), industriousness, loyalty, honesty);
    }
}

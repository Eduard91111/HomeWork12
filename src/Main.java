import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent ("Гарри Поттер");
        GryffindorStudent ron = generateGryffindorStudent ("Рон Уизли");
        RavenclawStudent luna = generatyRavenclawStudent ("Полумна Лавгуд");
        SlytherinStudent draco = generatySlytherinStudent ("Драко Малфой");
        HufflepuffStudent cedrik = generatyHufflepuffStudent ("Седрик Диггери");

        harry.print();
        ron.print();
        luna.print();
        draco.print();
        cedrik.print();

        harry.compareHogwarts(cedrik);
        harry.compareGryffindor(ron);
    }
    private static GryffindorStudent generateGryffindorStudent (String name) {
        return new GryffindorStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static RavenclawStudent generatyRavenclawStudent (String name) {
        return new RavenclawStudent (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static SlytherinStudent generatySlytherinStudent (String name) {
        return new SlytherinStudent (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static HufflepuffStudent generatyHufflepuffStudent (String name) {
        return new HufflepuffStudent (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

}
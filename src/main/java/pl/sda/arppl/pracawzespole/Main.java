package pl.sda.arppl.pracawzespole;

public class Main {
    public static void main(String[] args) {

        Triangle equaliteral = new Triangle(6, 6, 6);     //równoboczny
        Triangle isosceles = new Triangle(6, 6, 4);      //równoramienny
        Triangle pythagorean = new Triangle(3,4,5);       //pitagorejski
        Triangle triangle = new Triangle(1, 3, 10);       //na pewno trójkąt?

        System.out.println(equaliteral.isValid());
        System.out.println(isosceles.isValid());
        System.out.println(pythagorean.isValid());
        System.out.println(triangle.isValid());

        System.out.println(equaliteral.getField());
        System.out.println(isosceles.getField());
        System.out.println(pythagorean.getField());
        System.out.println(triangle.getField());

        System.out.println("bok A: " + pythagorean.getA());
        System.out.println("bok B: " + pythagorean.getB());
        System.out.println("bok C: " + pythagorean.getC());
        System.out.println("poprawny: " + (pythagorean.isValid() ? "tak" : "nie"));
        if (pythagorean.isValid()) {
            System.out.println("pole: " + pythagorean.getField());
            System.out.println("obwód: " + pythagorean.getPerimeter());


        }
    }
}

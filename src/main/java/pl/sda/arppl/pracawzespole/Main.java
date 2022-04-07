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





    }

}

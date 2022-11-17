import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area; //El área a calcular
        double radio; //Radio a ingresar

        System.out.println("Ingresa el radio de un circulo: ");
        radio = scanner.nextDouble();
        area = Math.PI * Math.pow(radio,2);

        System.out.println("El área de una circunferencia de radio " + radio + "es: " + area);
    }
}

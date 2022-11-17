import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String [] colores = {"azul","amarillo","rojo","verde","blanco","rojo"};

        double random = Math.random(); //Muestra un numero aleatorio
        System.out.println("random = " + random);
        random *=colores.length; //Multiplicamos por 7
        System.out.println("random = " + random);

        random = Math.floor(random); //Redondeamos hacia abajo
        System.out.println("random = " + random);

        System.out.println("Colores = " + colores[(int)random]); //Se realiza un cast

        Random randomObj = new Random();
        int randomInt = 15 +  randomObj.nextInt(25-15+1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}

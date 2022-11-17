public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3); //Muestra el numero absoluto de un numero
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max =  Math.max(3.5,1.2); //Muestra el número más alto
        System.out.println("max = " + max);

        double min = Math.min(3.5,1.2); //Muestra el número menor
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5); //Permite redondear número con punto decimal. Hacia arriba
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5); //Permite redondear número con punto decimal. Hacia abajo
        System.out.println("piso = " + piso);

        long entero = Math.round(3.5); //Redondea de manera automatica
        System.out.println("entero = " + entero);

        long entero2 = Math.round(3.4); //Redondea de manera automatica
        System.out.println("entero = " + entero2);

        long entero3 = Math.round(Math.PI);
        System.out.println("entero PI= " + entero3);

        double exp = Math.exp(2); //Exponencial
        System.out.println("exp = " + exp);

        double log = Math.log(10);//Logaritmo natural
        System.out.println("log = " + log);

        double potencia =  Math.pow(10,3);//Potencia
        System.out.println("potencia = " + potencia);

        double raiz =  Math.sqrt(5);//Raiz cuadrada
        System.out.println("raiz = " + raiz);

        //Trigonometria

        double grados = Math.toDegrees(1.57); //Convertir a radianes
        grados = Math.round(grados); //Redondeamos
        System.out.println("Convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00); //Convertir a grados
        System.out.println("Convertir grados a radianes = " + radianes);

        System.out.println("sin(90) = " + Math.sin(radianes)); //Coseno
        System.out.println("cos(90) = " + Math.cos(radianes)); //Seno

        radianes =  Math.toRadians(180.00);
        System.out.println("Cos(180.00) = " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("Cos(0) = " + Math.cos(radianes));
    }
}

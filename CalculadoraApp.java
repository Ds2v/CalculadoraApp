import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {

            try {
                System.out.println("***** CALCULADORA APP *****");
                //Llamamos a la función para mostrar el menú
                mostarMenu();

                System.out.print("Digite la operación deseada: ");
                var operacion = Integer.parseInt(scan.nextLine());

                if (operacion >= 1 && operacion <= 4) {
                    //Llamamos a la función para ejecutar la operacion solicitada
                    ejecutarOperacion(operacion, scan);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto!!!");
                    break;
                } else System.out.println("La opción ingresada no es valida: " + operacion);

            }catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static void mostarMenu(){
        System.out.println("""
                        1. Sumar
                        2. Restar
                        3. Multiplicar
                        4. Dividir
                        5. Salir
                        """);
    }
    private static void ejecutarOperacion(int operacion, Scanner scan){
        System.out.print("Ingrese el primer valor: ");
        var num1 = Double.parseDouble(scan.nextLine());
        System.out.print("Ingrese el segundo valor: ");
        var num2 = Double.parseDouble(scan.nextLine());
        double result;
        switch (operacion) {
            case 1 -> { //Suma
                result = num1 + num2;
                System.out.println("El resultado de la operación suma es: " + result);
            }
            case 2 -> { //Resta
                result = num1 - num2;
                System.out.println("El resultado de la operación resta es: " + result);
            }
            case 3 -> { //Multiplicación
                result = num1 * num2;
                System.out.println("El resultado de la operación multiplicación es: " + result);
            }
            case 4 -> { //División
                result = num1 / num2;
                System.out.println("El resultado de la operación división es: " + result);
            }
            default -> System.out.println("La opción ingresada no es valida: " + operacion);
        }

    }
}
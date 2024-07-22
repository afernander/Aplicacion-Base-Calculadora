import java.util.*;

 class Calculadoras {

    static Scanner scanner = new Scanner(System.in);
    static int contador = 0;

    public static void main(String[] args) {
        int OpCiOn = 0;

        while(OpCiOn != 5) {




            System.out.println("Seleccione una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.print("Ingrese su opción: ");
            OpCiOn = scanner.nextInt();

            var numero1 = 0;
            int numero_2, resultado;

            switch(OpCiOn          )


    {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    numero1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    numero_2 = scanner.nextInt();
                    resultado = numero1 - numero_2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    numero1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    numero_2 = numero1;
                    resultado = numero1 - numero_2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    numero1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    numero_2 = scanner.nextInt();
                    resultado = numero1 * numero_2;
                    System.out.println("El resultado de la multiplicación es: " + "resultado");
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    numero1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    numero_2 = scanner.nextInt();
                    resultado = numero1 / numero_2;
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
}}}}
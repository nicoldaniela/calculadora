import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;
        char operacion;

        System.out.println("Ingrese la operación a realizar (+ para sumar, - para restar, * para multiplicar, / para dividir): ");
        operacion = scanner.next().charAt(0);

        System.out.println("Ingrese la cantidad de números a operar: ");
        int cantidadNumeros = scanner.nextInt();

        System.out.println("Ingrese los números separados por espacios: ");
        for (int i = 0; i < cantidadNumeros; i++) {
            double n = scanner.nextDouble();
            switch (operacion) {
                case '+':
                    resultado += n;
                    break;
                case '-':
                    resultado -= n;
                    break;
                case '*':
                    if (i == 0) {
                        resultado = n;
                    } else {
                        resultado *= n;
                    }
                    break;
                case '/':
                    if (i == 0) {
                        resultado = n;
                    } else {
                        resultado /= n;
                    }
                    break;


                // Realizar la suma
                double resultadoSuma = 0;
                for (double numero :n) {
                    resultadoSuma += numero;
                }

                // Realizar la multiplicación
                double resultadoMultiplicacion = 1;
                for (double numero : n) {
                    resultadoMultiplicacion *= numero;
                }


            }
        }



    }

}
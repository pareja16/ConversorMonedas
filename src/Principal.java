import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda = null;
        int opcion = 0;
        double monto = 0.0;

        while(opcion != 9) {
            System.out.println("********************************************");
            System.out.println("bienvenido al conversor de monedas =)");
            System.out.println("""
                    1. Dolares a Pesos chilenos.
                    2. Pesos chilenos a Dolares.
                    3. Dolares a Bolivares.
                    4. Bolivares a Dolares.
                    5. Dolares a Euros.
                    6. Euros a Dolares
                    7. Dolares a Pesos Argentinos.
                    8. Pesos Argentinos a Dolares
                    9. SALIR.""");
            System.out.println("********************************************");
            System.out.println("Ingrese la opción que desea:");
            try{
                opcion = Integer.parseInt(scan.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la cantidad a cambiar:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("USD","CLP", monto);

                        System.out.println("El monto es: " + moneda.conversion_result() + " Pesos chilenos");
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad a cambiar:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("CLP","USD", monto);

                        System.out.println("El monto es: " + moneda.conversion_result() + " Dolares");
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad a cambiar:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("USD","VES", monto);

                        System.out.println("El monto es: " + moneda.conversion_result() + " Bolivares");
                        break;
                    case 4:
                        System.out.println("Ingrese la cantidad a cambiar:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("VES","USD", monto);

                        System.out.println("El monto es: " + moneda.conversion_result() + " Dolares");
                        break;
                    case 5:
                        System.out.println("Ingrese la cantidad a cambiar:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("USD","EUR", monto);

                        System.out.println("El monto es: " + moneda.conversion_result() + " Euros");
                        break;
                    case 6:
                        System.out.println("Ingrese la cantidad a cambiar:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("EUR","USD", monto);

                        System.out.println("El monto es: " + moneda.conversion_result() + " Dolares");
                        break;
                    case 7:
                        System.out.println("Ingrese la cantidad a cambiar:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("USD","ARS", monto);

                        System.out.println("El monto es: " + moneda.conversion_result() + " Pesos argentinos");
                        break;
                    case 8:
                        System.out.println("Ingrese la cantidad a cambiar:");
                        monto  = Double.parseDouble(scan.nextLine());
                        moneda = consulta.buscaMoneda("ARS","USD", monto);

                        System.out.println("El monto es: " + moneda.conversion_result() + " Dolares");
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
            }catch (NumberFormatException e){
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}

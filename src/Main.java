import modules.RequestApi;
import modules.RequestDatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var respuesta = true;
        while (respuesta){
            try {
                System.out.println("Conversor de monedas");
                System.out.println("******************************");
                System.out.println("""
                Selecione una opcion a continuacion:
                
                1) UDS ==>> ARS
                2) ARS ==>> USD
                3) USD ==>> BRL
                4) BRL ==>> USD
                5) USD ==>> COP
                6) COP ==>> USD
                7) SALIR
                
                """);

                int opcionIngresada;
                int valorConvertir;
                String usd = "USD";
                String ars = "ARS";
                String blr = "BLR";
                String cop = "COP";

                RequestApi consulta = new RequestApi();

                Scanner leer = new Scanner(System.in);
                opcionIngresada = Integer.valueOf(leer.nextLine());

                System.out.println("Ingresa el valor que deseas convertir");
                switch (opcionIngresada){
                    case 1:
                        valorConvertir = Integer.valueOf(leer.nextLine());
                        RequestDatos conversion = consulta.seleccionMoneda(usd,ars,valorConvertir);
                        System.out.println("La conversion de "+valorConvertir+" "+usd+ " a "+ars+ " es: "+conversion.conversion_result()+" "+ars+".");
                        System.out.println("******************************");
                        break;

                    case 2:
                        valorConvertir = Integer.valueOf(leer.nextLine());
                        conversion = consulta.seleccionMoneda(ars,usd,valorConvertir);
                        System.out.println("La conversion de "+valorConvertir+" "+ars+ " a "+usd+ " es: "+conversion.conversion_result()+" "+usd+".");
                        System.out.println("******************************");
                        break;
                    case 3:
                        valorConvertir = Integer.valueOf(leer.nextLine());
                        conversion = consulta.seleccionMoneda(usd,blr,valorConvertir);
                        System.out.println("La conversion de "+valorConvertir+" "+usd+ " a "+blr+ " es: "+conversion.conversion_result()+" "+blr+".");
                        System.out.println("******************************");
                        break;
                    case 4:
                        valorConvertir = Integer.valueOf(leer.nextLine());
                        conversion = consulta.seleccionMoneda(blr,usd,valorConvertir);
                        System.out.println("La conversion de "+valorConvertir+" "+blr+ " a "+usd+ " es: "+conversion.conversion_result()+" "+usd+".");
                        System.out.println("******************************");
                        break;
                    case 5:
                        valorConvertir = Integer.valueOf(leer.nextLine());
                        conversion = consulta.seleccionMoneda(usd,cop,valorConvertir);
                        System.out.println("La conversion de "+valorConvertir+" "+usd+ " a "+cop+ " es: "+conversion.conversion_result()+" "+cop+".");
                        System.out.println("******************************");
                        break;
                    case 6:
                        valorConvertir = Integer.valueOf(leer.nextLine());
                        conversion = consulta.seleccionMoneda(cop,usd,valorConvertir);
                        System.out.println("La conversion de "+valorConvertir+" "+cop+ " a "+usd+ " es: "+conversion.conversion_result()+" "+usd+".");
                        System.out.println("******************************");
                        break;
                    case 7:
                        leer.close();
                        respuesta=false;
                        break;
                    default:
                        System.out.println("Ingrese un numero valido");
                        break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


        RequestApi consulta = new RequestApi();

        //RequestApi datos
        //System.out.println(datos);
    }
}
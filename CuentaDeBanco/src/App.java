import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        int opcion = 0;
        double montoDepositar, montoRetirar;

        CuentaBancaria mensajero = new CuentaBancaria();

        mensajero.cambiarSaldoBalance(500);

        do{

            System.out.println("Bienvenido a la cuenta de banco");
            System.out.println(".....................");
            System.out.println(".    OPCIONES       .");
            System.out.println(". 1 -> depositar    .");
            System.out.println(". 2 -> retirar      .");
            System.out.println(". 3 -> salir        .");
            System.out.println(".....................");
            System.out.print("Elija la opcion: ");
            opcion = entrada.nextInt();
            System.out.println();

            System.out.print("Ingrese su nombre: ");
            String nombre = entrada.next();
            System.out.print("Ingrese su email: ");
            String email = entrada.next();
            System.out.print("Ingrese su numero telefonico: ");
            int numeroTelefonico = Integer.parseInt(entrada.next());
            System.out.println();

            mensajero.cambiarNombreCliente(nombre);
            mensajero.cambiarEmail(email);
            mensajero.cambiarNumeroTelefonico(numeroTelefonico);
              
            switch (opcion) {

                case 1: 

                    int repeticion1 = 0;

                    System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
                    System.out.println("Depositar efectivo");
                    System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

                    while(repeticion1 < 3){ 

                        try{ 

                            System.out.print("Cuanto desea depositar: ");
                            montoDepositar = Double.parseDouble(entrada.next());

                            if(montoDepositar > 0){

                               mensajero.depositarFondo(montoDepositar);
                                
                               repeticion1 = 3;

                            }else{

                                System.out.println("No se ingresan numeros negativos.");
                                System.out.println();

                                repeticion1++;

                                if(repeticion1 == 3){

                                    System.out.println("Error! se intento varias veces.");

                                }
                            }

                        }catch(java.lang.NumberFormatException e){

                            System.out.println("Ingrese valores numericos.");
                            System.out.println();

                            repeticion1++;

                            if (repeticion1 == 3) {

                                System.out.println("Error! se intento varias veces.");
                                System.out.println();
                            
                            }

                        }
                    }

                break;

                case 2: 

                    int repeticion2 = 0;

                    System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
                    System.out.println("Retirar efectivo");
                    System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

                    while(repeticion2 < 3){

                        try{

                            System.out.print("Cuanto desea retirar: ");
                            montoRetirar = Double.parseDouble(entrada.next());

                            if(montoRetirar > 0){

                                mensajero.retirarFondo(montoRetirar);
                              
                                repeticion2 = 3;

                            }else{

                                System.out.println("No se ingresan numeros negativos.");
                                System.out.println();

                                repeticion2++;

                                if(repeticion2 == 3){

                                   System.out.println("Error! se intento varias veces.");

                                }

                                
                            }

                        }catch(java.lang.NumberFormatException e){

                            System.out.println("Ingrese valores numericos.");
                            System.out.println();

                            repeticion2++;

                            if (repeticion2 == 3) {

                                System.out.println("Error! se intento varias veces.");
                                System.out.println();
                            
                            }
                        }
                    }

                break;

                case 3:
             
                  System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
                  System.out.println("Gracias por utilizar el cajero.");
                  System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
                    
                break;
        
                default: 
                  
                    System.out.println("No existe esta opcion."); 

                break;
            }

        } while(opcion != 3);

        entrada.close();
    }
}

public class CuentaBancaria {

    private double saldoBalance;
    private String nombreCliente;
    private String email;
    private int numeroTelefonico;

    public void cambiarSaldoBalance(double saldoBalance) {
        this.saldoBalance = saldoBalance;
    }

    public void cambiarNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void cambiarEmail(String email) {
        this.email = email;
    }

    public void cambiarNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }


    public double mostrarSaldoBalance() {
        return saldoBalance;
    }
    
    public String mostrarNombreCliente() {
        return nombreCliente;
    }
    
    public String mostrarEmail() {
        return email;
    }
    
    public int mostrarNumeroTelefonico() {
        return numeroTelefonico;
    }


    public void depositarFondo(double monto){

        cambiarSaldoBalance(mostrarSaldoBalance() + monto);

        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Nombre: " + mostrarNombreCliente());
        System.out.println("Email: " + mostrarEmail());
        System.out.println("Numero telefonico: " + mostrarNumeroTelefonico());
        System.out.println("Su deposito es de: " + monto);
        System.out.println("El total depositado es: " + mostrarSaldoBalance());
        System.out.println("----------------------------");
        System.out.println();

    }

    public void retirarFondo(double monto){

        if(monto <= mostrarSaldoBalance()){

            cambiarSaldoBalance(mostrarSaldoBalance() - monto);

            System.out.println();
            System.out.println("-----------------------");
            System.out.println("Nombre: " + mostrarNombreCliente());
            System.out.println("Email: " + mostrarEmail());
            System.out.println("Numero telefonico: " + mostrarNumeroTelefonico());
            System.out.println("Su retiro es de: " + monto);
            System.out.println("El total de retiro es: " + mostrarSaldoBalance());
            System.out.println("-----------------------");
            System.out.println();

        }else if(monto > mostrarSaldoBalance()){

            System.out.println("No existen fondos suficientes para el retiro.");
            System.out.println();
        }
        
    }
}
  
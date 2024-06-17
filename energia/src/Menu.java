import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner leer = new Scanner(System.in);
    private ArrayList<aparatoelectrico> aparato= new ArrayList<>();


    public void agregaraparatos(){

while (true) {
    try {
        System.out.println("Ingrese el nombre del aparato electronico a agregar");
        String nombre= leer.nextLine();
 
        System.out.println("Cuantas horas al dia suele ocuparlo?");
        double horasdiaria=leer.nextDouble();

        System.out.println("Bien! Ahora revise su producto y digite los Volteos que tiene (W)");
        double volteos = leer.nextDouble();

                double consumodiario = (volteos / 1000.0) * horasdiaria;
                double consumomensual = consumodiario * 30 * 6.446;

                
                aparato.add(new aparatoelectrico(nombre, horasdiaria, volteos, consumomensual));
                 leer.nextLine();
                  break;
        
    } catch (Exception e) {
        System.out.println("Ingrese datos correctos");
        leer.nextLine();
    }
}


    }

    public void calcularconsumodetodosaparatos(){
        double total = 0.0;
        for (aparatoelectrico aparatoelectrico2 : aparato) {
            total+=aparatoelectrico2.getConsumomensual();
        }
        System.out.println("Costo total al final de mes según los aparatos registrados es: " + total + " C$");

    }
    
    public void mostraraparatos(){

        for (aparatoelectrico aparatoelectrico2 : aparato) {

            System.out.println("Nombre: " + aparatoelectrico2.getName() + 
            " | Horas de uso: " + aparatoelectrico2.getUsodiario() + 
            " | Voltaje: " + aparatoelectrico2.getVolteos() + 
            " | Consumo al mes: " + aparatoelectrico2.getConsumomensual() + " C$");
            System.out.println("----------------------------------------------");
            
        }

    }

    public void menu(){
     boolean salir = false;

     do {
        
        try {
            System.out.println("-------------------------------BIENVENIDO------------------------------------- ");
            System.out.println("SISTEMA PARA CALCULAR EL COSTO APROXIMADO DE ENERGIA DE SUS APARATOS ELECTRICOS");
            System.out.println("1-Agregar aparato electronico");
            System.out.println("2-Mostrar aparatos electronico");
            System.out.println("3-Calcular costo de energia de los productos añadidos");
            System.out.println("4- Salir ");
            System.out.print("--Porfavor ingrese una opcion--"); 
            int opcion = leer.nextInt();

            leer.nextLine();
     
             switch (opcion) {
                 case 1:
                     agregaraparatos();
                      break;
     
                      case 2:
                     mostraraparatos();
                      break;
     
                      case 3:
                      calcularconsumodetodosaparatos();
                      break;
     
                      case 4:
                      System.out.println("Gracias por usar nuestro sistema");
                      salir=true;
                      break;
             
                 default:
                 System.out.println("Error ingrese un valor valido");
                 leer.nextLine();
                     break;
             }
     
     
        } catch (Exception e) {
            System.out.println("Ingrese un valor valido");
            leer.nextLine();
        }




     } while (!salir);


     


    }

    public void imprimirfactura(){
// esto lo hace jeferson aron flores corea 
    }

    









    public ArrayList<aparatoelectrico> getAparato() {
        return aparato;
    }
    public void setAparato(ArrayList<aparatoelectrico> aparato) {
        this.aparato = aparato;
    }

    
}

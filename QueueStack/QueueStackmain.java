package QueueStack;
import java.util.Scanner;

public class QueueStackmain {
//Viktor Chargoy Espino 183003 Actividad7 Menu de pilas y colas.

    public static void main(String [] Args){
            Scanner scan=new Scanner(System.in);
            int opcion=0, accion=0;
            char entradaChar;
            String linea;

            while(opcion!=5){
            System.out.println("Selecciona la accion a realizar: \n 1.Usar cola \n 2. Usar pila \n 3. Invertir cadena \n 4. Verificar si una palabra es palindromo\n Otro numero:salir");
            linea=scan.nextLine();
            opcion=Integer.parseInt(linea);
            //Declaramos ambos objetos
            Queue objetoCola=new Queue();
            Stack objetoPila=new Stack();

            switch (opcion) {
                case 1://Usar cola
                    //Queue objetoCola=new Queue();
                    accion=0;
                    while(accion!=5){//ciclo para ejecutar cola
                    System.out.println("Selecciona la accion a realizar: \n 1.Insertar elemento \n 2. Eliminar elemento \n 3. Imprimir queue \n Otro numero: Salir");
                    linea=scan.nextLine();
                    accion=Integer.parseInt(linea);
                        switch (accion) {
                            case 1:
                                System.out.println("Ingresa la letra ");
                                linea=scan.nextLine();
                                entradaChar=linea.charAt(0);
                                    objetoCola.anadir(entradaChar);

                                break;
                            case 2:
                                System.out.println("Eliminamos elemento");
                                    objetoCola.eliminar();
                                break;
                            case 3:
                                objetoCola.imprimir();
                                break;
                        
                            default:
                                System.out.println("Saliendo de opcion");
                                accion=5;
                                break;
                        }
                    }
                    break;
                case 2://Usar pila, stack
                    //Stack objetoPila=new Stack();
                    accion=0;
                    while(accion!=5){//ciclo para ejecutar cola
                    System.out.println("Selecciona la accion a realizar: \n 1.Insertar elemento \n 2. Eliminar elemento \n 3. Imprimir stack \n Otro numero: Salir");
                    linea=scan.nextLine();
                    accion=Integer.parseInt(linea);
                        switch (accion) {
                            case 1:
                                System.out.println("Ingresa la letra ");
                                linea=scan.nextLine();
                                entradaChar=linea.charAt(0);
                                    objetoPila.insertar(entradaChar);

                                break;
                            case 2:
                                System.out.println("Eliminamos elemento");
                                    objetoPila.eliminar();
                                break;
                            case 3:
                                objetoPila.imprimirPila();
                                break;
                        
                            default:
                                System.out.println("Saliendo de opcion");
                                accion=5;
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingresa la cadena a invertir: ");
                    linea=scan.nextLine();
                    objetoPila.invertirCadena(linea);
                    break;
                case 4:
                    System.out.println("Ingresa la cadena para verificar si es palindromo: ");
                    linea=scan.nextLine();
                    objetoPila.verificarPalindromo(linea);
                    break;
                default:
                    System.out.println("Saliendo...");
                    opcion=5;
                    break;
            }
           
            }

    scan.close();
    }
    
}
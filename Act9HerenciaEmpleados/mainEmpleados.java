package Act9HerenciaEmpleados;

public class mainEmpleados {
    public static void main(String [] args){
        Contador Pablo=new Contador("Pablo","Garcia",823,24,"Soltero",14000,"9:00","17:00",8,7);
        Programador Luis=new Programador("Luis","Hernandez",394,36,"Casado",45000,270,"Java");
        Secretaria Andrea=new Secretaria("Andrea","Perez",142,21,"Soltera","8:30","4:30",10000,2000,2);

        Pablo.CalcularSalariototal();
        Pablo.imprimirInformacion();
        Pablo.mostrarClasificacion();
        Pablo.aumentarSalario(3);

        System.out.println("");
        Luis.imprimirInformacion();
        Luis.mostrarClasificacion();
        Luis.aumentarSalario(5);

        System.out.println("");
        Andrea.CalcularSalariototal();
        Andrea.imprimirInformacion();
        Andrea.mostrarClasificacion();
        Andrea.aumentarSalario(3);
    }
}

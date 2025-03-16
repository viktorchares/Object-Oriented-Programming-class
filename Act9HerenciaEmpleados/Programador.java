package Act9HerenciaEmpleados;

public class Programador extends Empleado{
    int lineasDeCodigoPorHora;
    String lenguajeDominante;
    public Programador(String nombre,String apellido,int cedula,  int edad, String estadoCivil, int salario,int lineasDeCodigoPorHora, String lenguajeDominante){
        super(nombre,apellido,cedula,edad,estadoCivil,salario);
        this.lineasDeCodigoPorHora=lineasDeCodigoPorHora;
        this.lenguajeDominante=lenguajeDominante;
    }

    public Programador(){

    }

    public void aumentarSalario(double porcentajeAAumentar){
        System.out.println("Se aumenta el salario de "+nombre+" un "+porcentajeAAumentar+ "%");
        salario*=(1+(porcentajeAAumentar/100));
        System.out.println("Salario actualizado: $"+salario);
    }

    //@Override
    public void imprimirInformacion() {
        System.out.println("Se imprime la informacion del empleado");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Ocupacion: Programador");
        System.out.println("Cedula: "+cedula);
        System.out.println("Edad: "+edad);
        System.out.println("Estado civil: "+estadoCivil);
        System.out.println("Salario: $"+salario);
        System.out.println("Lineas de codigo por hora: "+lineasDeCodigoPorHora);
        System.out.println("Lenguaje de programacion dominante "+lenguajeDominante);
    }
}
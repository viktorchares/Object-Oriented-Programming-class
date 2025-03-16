package Act9HerenciaEmpleados;

public abstract class Administrativo extends Empleado {
    String horarioDeEntrada,horarioDeSalida;
    public Administrativo(String nombre,String apellido,int cedula, int edad, String estadoCivil ,int salario,String horarioDeEntrada, String horarioDeSalida){
        super(nombre,apellido,cedula,edad,estadoCivil,salario);
        this.horarioDeEntrada=horarioDeEntrada;
        this.horarioDeSalida=horarioDeSalida;
    }
    public Administrativo(String nombre,String apellido,int cedula, int edad, String estadoCivil ,String horarioDeEntrada, String horarioDeSalida){
        super(nombre,apellido,cedula,edad,estadoCivil);
        this.horarioDeEntrada=horarioDeEntrada;
        this.horarioDeSalida=horarioDeSalida;
    }
    
    public Administrativo(){

    }
}

package Act9HerenciaEmpleados;

public class Secretaria extends Administrativo {
    int salarioBase,prestaciones,retardos;
    public Secretaria(String nombre,String apellido,int cedula, int edad, String estadoCivil ,String horarioDeEntrada, String horarioDeSalida,int salarioBase,int prestaciones, int retardos){

        super(nombre,apellido,cedula,edad,estadoCivil,horarioDeEntrada,horarioDeSalida);
        //salario no lo incluimos en constructor, seria duplicado con salario base
        this.salarioBase=salarioBase;
        this.prestaciones=prestaciones;
        this.retardos=retardos;
        CalcularSalariototal();
    }
    public Secretaria(){
        
    }

    public void CalcularSalariototal(){
        //le ponemos algun limite?
        super.salario=salarioBase+prestaciones-(retardos*100);
        if(salario<0)salario=0;
    }

    public void aumentarSalario(double porcentajeAAumentar){
        System.out.println("Se aumenta el salario de "+nombre+" un "+porcentajeAAumentar+ "%");
        salarioBase*=(1+(porcentajeAAumentar/100));
        prestaciones*=(1+(porcentajeAAumentar/100));
        CalcularSalariototal();
        System.out.println("Salario actualizado, incluyendo penalizaciones: $"+salario);
    }


    public void imprimirInformacion() {
        CalcularSalariototal();
        System.out.println("Se imprime la informacion del empleado");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Ocupacion: Secretaria");
        System.out.println("Cedula: "+cedula);
        System.out.println("Edad: "+edad);
        System.out.println("Estado civil: "+estadoCivil);
        System.out.println("Salario: $"+salario);
        System.out.println("salario base: $"+salarioBase);
        System.out.println("Prestaciones: $"+prestaciones);
        System.out.println("Horario de entrada: "+horarioDeEntrada);
        System.out.println("Horario de salida: "+horarioDeSalida);  
        System.out.println("Retardos: "+retardos);      
        
    }
}

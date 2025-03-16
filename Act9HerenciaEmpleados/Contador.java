package Act9HerenciaEmpleados;

public class Contador extends Administrativo{
    int cuentasACargo,reportesMensuales,salarioConComisiones;
    public Contador(String nombre,String apellido,int cedula, int edad, String estadoCivil ,int salario,String horarioDeEntrada, String horarioDeSalida,int cuentasACargo,int reportesMensuales){
        super(nombre,apellido,cedula,edad,estadoCivil,salario,horarioDeEntrada,horarioDeSalida);
        //salariototal lo metemos en salario, o por afuera?
        this.reportesMensuales=reportesMensuales;
        this.cuentasACargo=cuentasACargo;
    }
    public Contador(){
        
    }

    public void CalcularSalariototal(){
        salarioConComisiones=salario;
        if(cuentasACargo>4)salarioConComisiones+=salario*(cuentasACargo-4)*.1;
        //es de interes simple
    }
    
    public void aumentarSalario(double porcentajeAAumentar){
        System.out.println("Se aumenta el salario de "+nombre+" un "+porcentajeAAumentar+ "%");
        salario*=(1+(porcentajeAAumentar/100));
        CalcularSalariototal();
        System.out.println("Salario actualizado, incluyendo comisiones: $"+salarioConComisiones);
    }


    public void imprimirInformacion() {
        System.out.println("Se imprime la informacion del empleado");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Ocupacion: Contador");
        System.out.println("Cedula: "+cedula);
        System.out.println("Edad: "+edad);
        System.out.println("Estado civil: "+estadoCivil);
        System.out.println("Salario: $"+salarioConComisiones);
        System.out.println("Horario de entrada: "+horarioDeEntrada);
        System.out.println("Horario de salida: "+horarioDeSalida);  
        System.out.println("Cuentas a cargo: "+cuentasACargo);  
        System.out.println("Reportes mensuales: "+reportesMensuales);    
    }
}

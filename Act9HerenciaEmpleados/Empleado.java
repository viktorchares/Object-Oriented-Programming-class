package Act9HerenciaEmpleados;

public abstract class Empleado {
    //atributos
    String nombre,apellido, estadoCivil;
    int cedula,edad,salario;
    public Empleado(String nombre,String apellido,int cedula, int edad, String estadoCivil ,int salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.salario=salario;
        this.edad=edad;//le ponemos algun limite a edad?
        this.estadoCivil=estadoCivil;
    }

    public Empleado(String nombre,String apellido,int cedula, int edad, String estadoCivil){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.edad=edad;//le ponemos algun limite a edad?
        this.estadoCivil=estadoCivil;
    }

    public Empleado(){

    }
    public void mostrarClasificacion(){
        System.out.println("De acuerdo a su edad, el empleado pertenece a la clasificacion:");
        if(edad<=21){
            System.out.println("Principiante");
        }else if(edad>=22 && edad<=35){
            System.out.println("Intermedio");
        }else if(edad>35){
            System.out.println("Senior");
        }else{
            System.out.println("Hay un problema con la edad");
        }
    }
    public abstract void imprimirInformacion();

    public abstract void aumentarSalario(double porcentajeAAumentar);
}

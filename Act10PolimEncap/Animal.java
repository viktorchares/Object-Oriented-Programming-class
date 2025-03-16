package Act10PolimEncap;

public abstract class Animal {
    //3 atributos private, uno de ellos bolean, acceso a traves de get y set
     //2 metodos al menos uno abstracto y al menos uno protected
     private int edad=0;
     private String nombre="";
     private boolean sexo=false;

     public Animal(String nombre, boolean sexo, int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
     }
     public Animal(){

     }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
     public void getNombre(){
        System.out.println("El nombre del animal es: "+nombre);
     }

     public void setSexo(boolean sexo){
        this.sexo=sexo;
     }

     public void getSexo(){
        if(!sexo)System.out.println("Su sexo es: Masculino");
        else System.out.println("Su sexo es: Femenino");
     }

     public void setEdad(int edad){
        this.edad=edad;
    }
     public void getEdad(){
        System.out.println("Su edad es de: "+edad+" años");
     }


     protected void imprimirInformacionBasica(){
        getNombre();
        getSexo();
        getEdad();
     }

     public abstract void imprimirInformacion();

}

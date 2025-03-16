package Act10PolimEncap;

public class Mamifero extends Animal {
    //2 atributos unicos de la clase
    private int cantidadGlandulasSudoriparas=0;
    private int duracionLactancia=0;

    public Mamifero(String nombre, boolean sexo, int edad,int cantidadGlandulasSudoriparas, int duracionLactancia){
       super(nombre, sexo, edad);
       this.cantidadGlandulasSudoriparas=cantidadGlandulasSudoriparas;
       this.duracionLactancia=duracionLactancia;
       
    }
    public Mamifero(){

    }
    
    public void setCantidadGlandulasSudoriparas(int cantidadGlandulasSudoriparas){
        this.cantidadGlandulasSudoriparas=cantidadGlandulasSudoriparas;
    }
    public void getCantidadGlandulasSudoriparas(){
        System.out.println("Cuenta con: "+cantidadGlandulasSudoriparas+" glandulas sudoriparas");
    }

    public void setDuracionLactancia(int duracionLactancia){
        this.duracionLactancia=duracionLactancia;
    }

    public void getDuracionLactancia(){
        System.out.println("Su lactancia tiene una duracion de: "+duracionLactancia+" meses");
    }
    

    public void imprimirInformacion(){
        System.out.println("El animal es un mamifero");
        super.imprimirInformacionBasica();
        getCantidadGlandulasSudoriparas();
        getDuracionLactancia();
    }   
    
}

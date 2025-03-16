package Act10PolimEncap;

public class Ave extends Animal{
    //2 atributos unicos de la clase
    private int distanciaDeVuelo=0;
    private int nidosCreados=0;

    public Ave(String nombre, boolean sexo, int edad,int distanciaDeVuelo, int nidosCreados){
        super(nombre, sexo, edad);
        this.distanciaDeVuelo=distanciaDeVuelo;
        this.nidosCreados=nidosCreados;
    }

    public Ave(){

    }

    public void setDistanciaDeVuelo(int distanciaDeVuelo){
        this.distanciaDeVuelo=distanciaDeVuelo;
    }

    public void getDistanciaDeVuelo(){
        System.out.println("La distancia de vuelo es de: "+distanciaDeVuelo+" kilometros");
    }

    public void setNidosCreados(int nidosCreados){
        this.nidosCreados=nidosCreados;
    }

    public void getNidosCreados(){
        System.out.println("El numero de nidos creados es: "+nidosCreados);
    }


    public void imprimirInformacion(){
        System.out.println("El animal es un ave");
        super.imprimirInformacionBasica();
        getDistanciaDeVuelo();
        getNidosCreados();
    }
    
}

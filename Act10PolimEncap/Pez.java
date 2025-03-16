package Act10PolimEncap;

public class Pez extends Animal {
    //2 atributos unicos de la clase
    private int distanciaNadada=0;
    private int huevosColocadosEnAgua=0;

    public Pez(String nombre, boolean sexo, int edad,int distanciaNadada, int huevosColocadosEnAgua){
        super(nombre, sexo, edad);
        this.distanciaNadada=distanciaNadada;
        this.huevosColocadosEnAgua=huevosColocadosEnAgua;
    }

    public Pez(){

    }

    public void setDistanciaNadada(int distanciaNadada){
        this.distanciaNadada=distanciaNadada;
    }
    public void getDistanciaNadada(){
        System.out.println("La distancia nadada es de: "+distanciaNadada+" kilometros");
    }

    public void setHuevosColocadosEnAgua(int huevosColocadosEnAgua){
        this.huevosColocadosEnAgua=huevosColocadosEnAgua;
    }
    public void getHuevosColocadosEnAgua(){
        System.out.println("La cantidad de huevos colocados en agua es de: "+huevosColocadosEnAgua+" huevos");
    }

    public void imprimirInformacion(){
        System.out.println("El animal es un pez");
        super.imprimirInformacionBasica();
        getDistanciaNadada();
        getHuevosColocadosEnAgua();
    }

}

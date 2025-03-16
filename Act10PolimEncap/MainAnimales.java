package Act10PolimEncap;
import java.util.Random;


public class MainAnimales {
    public static void main(String [] args){
        //iniciamos objeto random
        Random rand=new Random();
        //elegir de manera aleatoria 10 objetos a crear
        Mamifero mamiferos[]=new Mamifero[10];
        Ave aves[]=new Ave[10];
        Pez peces[]=new Pez[10];
        int indicePeces=0,indiceAves=0, indiceMamiferos=0,temp=0,opcion=0;
        //20 nombres, es valido?
        String nombresPosibles[]={"José", "María", "Juan", "Luis", "Carlos","Ana", "Francisco", "Guadalupe", "Fernando", "Diana","Miguel", "Alejandro", "Ricardo", "Jorge", "Patricia","Daniel", "Sofía", "Roberto", "Gabriela", "Antonio"};
        //sexo de acuerdo a su nombre, false hombre y true mujer
        boolean[] arregloSexos = {false, true, false, false, false, true, false, true, false, true, false, false, false, false, true, false, true, false, true, false};
        for(int i=0;i<10;i++){
            opcion=rand.nextInt(3);
            System.out.println("\nAnimal numero: "+(i+1));
            switch (opcion) {
                case 0://nuevo mamifero
                    mamiferos[indiceMamiferos]=new Mamifero();
                    temp=rand.nextInt(20);
                    mamiferos[indiceMamiferos].setNombre(nombresPosibles[temp]);
                    mamiferos[indiceMamiferos].setEdad(rand.nextInt(100));
                    mamiferos[indiceMamiferos].setSexo(arregloSexos[temp]);
                    mamiferos[indiceMamiferos].setCantidadGlandulasSudoriparas(rand.nextInt(5123456));
                    mamiferos[indiceMamiferos].setDuracionLactancia(rand.nextInt(100));

                    mamiferos[indiceMamiferos].imprimirInformacion();
                    indiceMamiferos++;
                    break;
                case 1://nueva ave
                    aves[indiceAves]=new Ave();
                    temp=rand.nextInt(20);
                    aves[indiceAves].setNombre(nombresPosibles[temp]);
                    aves[indiceAves].setEdad(rand.nextInt(100));
                    aves[indiceAves].setSexo(arregloSexos[temp]);
                    aves[indiceAves].setDistanciaDeVuelo(rand.nextInt(100000));
                    aves[indiceAves].setNidosCreados(rand.nextInt(200));

                    aves[indiceAves].imprimirInformacion();
                    indiceAves++;
                    
                    break;
                case 2://nuevo pez
                    peces[indicePeces]=new Pez();
                    temp=rand.nextInt(20);
                    peces[indicePeces].setNombre(nombresPosibles[temp]);
                    peces[indicePeces].setEdad(rand.nextInt(100));
                    peces[indicePeces].setSexo(arregloSexos[temp]);
                    peces[indicePeces].setDistanciaNadada(rand.nextInt(100000));
                    peces[indicePeces].setHuevosColocadosEnAgua(rand.nextInt(100000000));

                    peces[indicePeces].imprimirInformacion();
                    indicePeces++;
                    break;

            
                default:
                    break;
            }
        }


    }
}

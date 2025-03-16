package QueueStack;

public class Queue{
//Viktor Chargoy Espino 183003 Actividad7 Cola
static int limite=50;
char arregloCola[]=new char [limite];
int indiceInicio=0, indiceParaAnadir=0;
String cadena;

Queue(String entrada){
    cadena=entrada;
}
Queue(){
    cadena="";
}

public void construirCola(){
    int i=0;
    for(i=0;i<cadena.length()&&i<limite;i++){
        arregloCola[i]=cadena.charAt(i);
        indiceParaAnadir++;
    }
}

public void anadir(char entrada){
    if(indiceParaAnadir<limite){
        arregloCola[indiceParaAnadir]=entrada;
        indiceParaAnadir++;
    }else{
        System.out.println("Error, la cola alcanzo su tamano maximo");
    }

}

public void eliminar(){
    if(indiceInicio!=indiceParaAnadir){
        arregloCola[indiceInicio]=0;
        indiceInicio++;
    }else{
        System.out.println("Error, la cola no tiene elementos por eliminar");
    }
    
}

public void imprimir(){
    int i=0;
    System.out.println("La cola tiene los siguientes elementos: ");
    for(i=indiceInicio;i<indiceParaAnadir&&i<limite;i++){
        System.out.print(arregloCola[i]+" ");
    }
    System.out.print("\n");
}
public static void main(String [] Args){
    //QueueStackmain objeto=new QueueStackmain();
    //objeto.main();
}
}
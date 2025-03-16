package QueueStack;

public class Stack {
//Viktor Chargoy Espino 183003 Actividad7 Pila
static int limite=50;
int indiceParaManipular=0;
String cadena;
char arregloStack[]=new char [limite];

Stack(String entrada){
cadena=entrada;
}
Stack(){

}

public void construirStack(){
    cadena.split("");
    char entradaChar[]= cadena.toCharArray();
    int i=0;
    indiceParaManipular=0;
    for(i=0;i<cadena.length()&&i<limite;i++){//insert
        arregloStack[i]=entradaChar[i];
        indiceParaManipular++;
    }
}

public void insertar(char entrada){
    if(indiceParaManipular<limite){
        arregloStack[indiceParaManipular]=entrada;
        indiceParaManipular++;
    }else{
        System.out.println("Error, la pila alcanzo su tamano maximo");
    }
}

public void eliminar(){
    indiceParaManipular--;
    if(indiceParaManipular>=0)arregloStack[indiceParaManipular]=0;
    else System.out.println("Error, la pila no tiene elementos por eliminar");
}

public char elementoTop(){
    if(indiceParaManipular>0)return arregloStack[indiceParaManipular-1];
    return 0;
}

public void imprimirPila(){//imprimir los elementos de la pila
    System.out.println("La pila tiene los siguientes elementos: ");
    for(int i=indiceParaManipular-1;i>=0;i--){
        System.out.print(arregloStack[i]+" ");
    }
    System.out.print("\n");
}

public void invertirCadena(String entrada){
    cadena=entrada;
    construirStack();
    //imprimirPila(true);
    System.out.println("La cadena invertida queda:");
    char topChar=1;
    while(indiceParaManipular>0){
        topChar=elementoTop();
        System.out.print(topChar);
        eliminar();
    }
    System.out.print("\n");
    
}

public void verificarPalindromo(String entrada){
    cadena=entrada;
    construirStack();
    int i=0;
    boolean flg=true;
    for(i=0;i<cadena.length()&&i<limite&&flg;i++){
        if(elementoTop()==cadena.charAt(i)){
            eliminar();
        }else{
            flg=false;
        }
    }
    if(!flg){
        System.out.println("La cadena no es un palindromo");
    }else{
        System.out.println("La cadena si es un palindromo");
    }
}

public static void main(String [] Args){
    //QueueStackmain objeto=new QueueStackmain();
    //objeto.main();
}
}

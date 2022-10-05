package javaapplication20;
public class pilaLig {
    Nodo tope;
    class Nodo{
    String dato;
    Nodo liga;
    public Nodo(){
        liga = null;
    }
    public Nodo (String item){
        dato =  item;
        liga = null;
    }    
}
    pilaLig(){
        tope = null;
    }
    public boolean pilaVacia(){
         return tope == null;
    }
    public void push(String item){
        Nodo nuevoNodo;
        nuevoNodo = new Nodo(item);
        nuevoNodo.liga = tope;
        tope = nuevoNodo;
    }
    public String pop(){
        String dato;
        if(!pilaVacia()){
            dato = tope.dato;
            tope = tope.liga;
        }
        else{
            dato = "Underflow";
        }
        return dato;
    }
}
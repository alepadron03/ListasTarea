/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalinked;

/**
 *
 * @author alexp
 */
public class Lista {
    private Nodo pFirst;
    private Nodo pNext;
    private Nodo pLast;
    private int size;

    public Lista() {
        this.pFirst = pFirst;
        this.pNext = pNext;
        this.size = 0;
    }

    public Nodo getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    public Nodo getpNext() {
        return pNext;
    }

    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }

    public Nodo getpLast() {
        return pLast;
    }

    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

  
    
    
   public boolean esVacia(){
       return this.pFirst==null;
      
       
   }
  public int size(){
        int i = 0;
        
        if (esVacia()){
            return 0;
        }
        Nodo pAux= this.pFirst;
        while (pAux!=null){
            pAux.getpNext();
            i++;
        }
        return i;
    }
   public void InsertarInicio(int dato){
      Nodo nuevo= new Nodo(dato);
      if(esVacia()){
          nuevo.pNext=pFirst;
          pFirst=nuevo;
          
      }
      else{
          this.pFirst=nuevo;
      }
      
      
   }
   
    public void InsertarFinal(int dato){
        Nodo nuevo=new Nodo(dato);
        if(esVacia()){
            nuevo.pNext=pLast;
            pLast=nuevo;
        }
        else{
            this.pLast=nuevo;
        }
        
    }
    public void Insertar(int dato, int i) {
        if (esVacia() || i == 0) {
            this.InsertarInicio(dato);
        } else if (i >= (size() - 1)) {
            this.InsertarFinal(dato);
        } else if (i < 0) {
            this.Insertar(dato, size() + i);
        }else {
            Nodo  n = new Nodo(dato);
            Nodo aux = this.pFirst; // Nodo previo
            int count = 0;
            while(count < i -1) {
                aux = aux.getpNext();
                count++;
            }
            n.setpNext(aux.getpNext());
            aux.setpNext(n);
        }
    }
    
//    public abstract void Insertar(int dato, int size);
    public void print() {
        if (esVacia()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo aux = this.pFirst;
            
            while (aux != null) {
                System.out.print(aux.getDato()+ " ");
                aux = aux.getpNext();
               
            }
            System.out.println("");
        }
        }
    
}

package oop.inheritance.example.overload;
public class SuperClasse {
    public String atributo1;
    public int atributo2;
    
    public SuperClasse(){
        
    }
    public SuperClasse(String atributo1, int atributo2){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        
    }
    public void mtedo1(){
        System.out.println("Chamando metodo1 da SuperClasse");
        
    }
    public void metodo2(){
        System.out.println("Chamando metodo2 da SuperClasse");
    }
 
    
}

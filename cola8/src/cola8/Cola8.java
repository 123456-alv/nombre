/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola8;
import java.util.Scanner;

public class Cola8 {
int g;
int A;

String v1;
String nom[];
 String[] nombre=new String[4];
    public void vector(){
       System.out.println("ingresa el tamaño del arreglo de 1 a 4");
        Scanner Teclado = new Scanner(System.in);
        A = Teclado.nextInt();
       
       nom = new String[A];
      
}
    
    public void llenarcola(){
        
        Scanner Teclado = new Scanner(System.in);
        System.out.println("ingresar nombre");
        v1 = Teclado.nextLine();
        nom[g++] = v1;
 for(int i=0; i<A;i++){
            System.out.println("valor de la pocison es "+nom[i]);
        }
 String nom = Teclado.nextLine();
if(nom.length()>=4 && nom.length()<=6){
            System.out.println("nombre correcto");
            g++;
       } else {
    } 
    }


    
    public void eliminarcola(){
        A--;
        System.out.println("elemento borrado");
    }
    public static void main(String[] args){
     
        Cola8 c = new Cola8();
        Scanner sc = new Scanner(System.in);
         int opt=0; 
         do{
             System.out.println("1 tamaño del vector");
             System.out.println("2 ingresar nombres");
             System.out.println("3 eliminar nombre");
             System.out.println("4 salir");
           switch(opt= sc.nextInt()){
               case 1: 
                   if(opt<'4'){
                       
                       c.vector();
                   }
                   break;
               
               case 2:
                   c.llenarcola();
                   break;
               case 3:
                   c.eliminarcola();
                   break;
           }
         }while(opt !=4);
    }
}

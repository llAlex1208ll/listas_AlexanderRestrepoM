/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;

/**
 *
 * @author samaniw
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayStack<Integer> pilaArreglo = new ArrayStack<>(3);
        pilaArreglo.push(11);
        pilaArreglo.push(22);
        pilaArreglo.push(33);
        try {
            System.out.println("Antes de hacer pop");
            System.out.println(pilaArreglo.peek());
            pilaArreglo.pop();
            pilaArreglo.pop();
            pilaArreglo.pop();
            pilaArreglo.pop();
            System.out.println("Despues de hacer pop");
            System.out.println(pilaArreglo.peek());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");
        ListaCircularDoble lista4 = new ListaCircularDoble();
        lista4.add(55);
        lista4.add(66);
        lista4.add(77);
        lista4.add(88);
        lista4.add(99);

        System.out.println("");
        ListaCircularSimple lista3 = new ListaCircularSimple();
        lista3.add(55);
        lista3.add(66);
        lista3.add(77);

        ListaCircularSimple lista5 = new ListaCircularSimple();
        lista5.add(88);
        lista5.add(99);
        lista5.add(101);

        
        //comprobar la union de listas
//        lista5.join(lista3);
//        System.out.println(lista5.showData());
//        System.out.println(lista3.showData());
//        System.out.println("--------------");
        
        lista3.delete();
        System.out.println(lista3.showData());
        
        

        ListaDoble lista2 = new ListaDoble();
        lista2.addLast(55);
        lista2.addLast(66);
        lista2.addLast(77);
        lista2.addLast(88);
        lista2.addLast(99);
//        lista2.add(55);
//        lista2.add(66);
//        lista2.add(77);
//        lista2.add(88);
//        lista2.add(33);
        
        System.out.println("=========================================");
        System.out.println("Datos de la lista doble asc: " + lista2.showData());
        System.out.println("Datos de la lista doble desc: " + lista2.showDataDesc());
        System.out.println("Datos de la lista circular doble Asc: " + lista4.showDataAsc());
        System.out.println("Datos de la lista circular doble Desc: " + lista4.showDataAsc());

        lista2.delete();

        lista2.delete();
        System.out.println("Datos de la lista doble: " + lista2.showData());

//        ArrayList<String> data = new ArrayList<>();
//        ArrayList<Integer> edades = new ArrayList<>();
//        ArrayList<Double> notas = new ArrayList<>();
//        ArrayList<Node> misNodos = new ArrayList<>();
        miLista listica = new miLista();
         listica.add(55);
          listica.add(22);
           listica.add(35);
            listica.add(95);
            
//            //System.out.println(""+lista5.join(lista3));
//         System.out.println("union de listas " + listica.showData());
//         lista5.join(lista3);
 //       listica.add(55);
 //       listica.addOrdered(88);
        System.out.println("Datos de la lista simple " + listica.showData());
        System.out.println("Total de datos " + listica.TotalDatos());
        System.out.println("Valor minimo " + listica.Menor());
        System.out.println("El promedio de la lista simpe es: " + listica.promedio());

//       listica.add(66);
//       listica.add(77);
//       listica.add(88);
//       listica.add(99);
//       listica.add(101);
//       listica.add(111);
//       listica.add(121);
//       listica.add(131);
//       listica.add(8);
//        listica.addOrdered(11);
//        listica.addOrdered(8);
//        listica.addOrdered(6);
//        listica.addOrdered(13);
//        listica.addOrdered(9);
//
//        System.out.println(listica.showData());
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        System.out.println("");
//
//        System.out.println(listica.showData());
    }

}

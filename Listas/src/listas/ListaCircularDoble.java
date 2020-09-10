/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author samaniw
 */
public class ListaCircularDoble {

    private DoubleNode head;

    public ListaCircularDoble() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    /**
     * Agregar un dato al inicio de la lista
     *
     * @param d Dato
     */
    public void add(int d) {
        DoubleNode newNode = new DoubleNode(d);

        if (isEmpty()) {
            newNode.setPreviosNode(newNode);
            newNode.setNextNode(newNode);
            head = newNode;
        } else {
            newNode.setPreviosNode(head.getPreviosNode());
            newNode.setNextNode(head);
            //configuración último elemento de la lista
            head.getPreviosNode().setNextNode(newNode);
            head.setPreviosNode(newNode);            
            head = newNode;
        }
    }
    
    /**
     * ELiminar el último nodo
     */
    public void deleteLast(){
        //modificar el anterior de la cabeza para que sea el ultimo
        //el ultimo es: head.getPreviosNode();
        head.setPreviosNode(head.getPreviosNode());
        //al anterior al ultimo, cambiar el siguiente para que sea la cabeza
        head.getPreviosNode().getPreviosNode().setNextNode(head);
        
    }
    
    /**
     * Mostrar los datos de la lista desde el primero al último
     * @return 
     */
    public String showData() {
        return "";
    }
    
    /**
     * Mostrar los datos de la lista desde el último al primero
     * @return 
     */
    public String showDataDesc() {
        DoubleNode referente = head.getPreviosNode();
        String data = "";
        while(referente != head)
        {
            referente = referente.getPreviosNode();
            data +=referente.getData() + " - ";
        }
        return data;
    }
    
     /**
     * Mostrar los datos de la lista desde el primero al último
     * @return 
     */
    public String showDataAsc() {        
        DoubleNode actual = head;
        DoubleNode ultimo = actual.getPreviosNode();
        String Data = "";
        while(actual!=ultimo){
            System.out.println(actual.getData());
            actual = actual.getNextNode();
            Data += actual.getData() + " - " ;
            
        }
        
        return Data;
    }
}

package sait.sll.utility;

import java.io.Serializable;

/**
 * @author Mengdan Liu Zhenrong Shi
 * @version
 * Nov 26,2021
 *
 */
public class SLL implements LinkedListADT,Serializable {
	//attributes
	
    private Node head;
    private int size;
    @Override
    public boolean isEmpty() {
     
        return head == null;
    }

    @Override
    public void clear() {
     
        head = null;
        size = 0;
    }

    @Override
    public void append(Object data) {
       
        Node node = new Node();
        node.setData(data);
        node.setNext(null);

        if(head == null) {
            head = node;
        }
        else {
            Node n = head;
            while(n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(node);
        }
    }

    @Override
    public void prepend(Object data) {
       
        Node node = new Node();
        node.setData(data);
        node.setNext(null);

        if(head == null) {
            head = node;
        }
        else {
            Node n = head;
            node.setNext(n);
            head = node;

        }
    }

    @Override
    public void insert(Object data, int index) throws IndexOutOfBoundsException {
        Node node = new Node();
        node.setData(data);
        node.setNext(null);

        Node n = head;
        for(int i=0; i<index-1;i++) {
            n = n.getNext();
        }
        node.setNext(n.getNext());
        n.setNext(node);
     


    }

    @Override
    public void replace(Object data, int index) throws IndexOutOfBoundsException {
        Node n = head;
        for(int i = 0; i < index; i++) {
            n = n.getNext();
        }
        n.setData(data);

        

    }

    @Override
    public int size() {

        Node n = head;
        if(n == null){
            size = 0;
        }else{
        size++;
        while(n.getNext()!=null){
            n = n.getNext();
            size++;
        }
        }

        
        return size;
    }

    
    @Override
    public void delete(int index) throws IndexOutOfBoundsException {

        Node n = head;
        for(int i = 0; i < index-1; i++) {
            n = n.getNext();
        }
        n.setNext(n.getNext().getNext());


    }

    @Override
    public Object retrieve(int index) throws IndexOutOfBoundsException {
       
        Node n = head;
        for (int i = 0; i< index;i++){
            n = n.getNext();
        }

        return n.getData();
    }

    @Override
    public int indexOf(Object data) {
       
        Node n = head;
        int index=0;
        while (!n.getData().equals(data)){
            n = n.getNext();
            index++;
        }
        return index;
    }

    @Override
    public boolean contains(Object data) {
     
        Node n = head;
        boolean contains;
        while (n.getData() != null){
            n = n.getNext();
            if(n.getData() == data){
                return true;
            }
        }
        return false;
    }

}

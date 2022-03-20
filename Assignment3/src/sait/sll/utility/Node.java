package sait.sll.utility;

import java.io.Serializable;

/**
 * @author Mengdan Liu Zhenrong Shi
 * Nov 26,2021
 *
 */
/**
 * @author peony
 *
 */
public class Node implements Serializable{
	/* attributes
	 * 
	 * */
  
    private Object data;
    private Node next;
    private int index;
    
    /**
     * @param data
     * @param next
     */
    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }
    public Node(Object data) {
        this.data = data;
    }
    public Node() {

    }
    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext(){
        return next;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + next + "]";
    }

    public void setData(Object data) {
        this.data = data;
    }


}


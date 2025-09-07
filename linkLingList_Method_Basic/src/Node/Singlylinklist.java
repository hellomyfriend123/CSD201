/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Node;

/**
 *
 * @author DELL
 */
public class Singlylinklist {
    Node head;
    Node tail;
    static int size = 0;
    
    public void addFirst(int data){
      Node newNode = new Node(data);
      if (head == null){
        head = newNode;
      }
      else {
      newNode.next = head;
      head = newNode;
      }
    }
    
    public void addTail (int data){
      Node newNode = new Node(data);
      if (head == null){
        head = newNode;
      }
      
      else {
        Node curr = head;
        while (curr.next != null){
           curr = curr.next;
           curr.next = newNode;
        }
      }
    }
}

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
        head = tail = newNode;
      }
      else {
      newNode.next = head;
      head = newNode;
      }
      size ++;
    }
    
    public void addTail (int data){
      Node newNode = new Node(data);
      if (head == null){
        head = tail = newNode;
      }
      
      else {
           tail.next = newNode;
           tail = newNode;
        }
      size ++;
      }
    
    public void PrintLit() {
     Node curr = head;
     while (curr != null){
         System.out.println(curr.data + " ");
         curr = curr.next;
     }
             System.out.println();

    }
    
    public int getSize(){
      return size;
    }
    }


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
    
    public int Size(){
     Node temp = head;
     int index = 0;
     while (temp != null){
       temp = temp.next;
       index ++;
     }
     return index;
    }
    
    public void addList(int index, int value){
      Node newNode = new Node(value);
      
      if (index == 0){
          addFirst(value);
      }
      
      else if (index == Size() - 1){
          addTail(value);
      }
      
      else if (index >= Size()){
          System.out.println("Invalid index!");
      }
      
      Node temp = head;
      Node prev = null;
      
      int count = 0;
      
      while (temp != null && count != index){
         prev = temp;
         temp = temp.next;
         count ++;
      }
      newNode.next = temp;
      prev.next = newNode;
    }
    
    public int search (int index){
      if (index >= Size() || index < 0){
         return 0;
      }
      
      int count = 0;
      Node temp = head;
      while (temp != null && count != index){
        temp = temp.next;
        count ++;
      }
      return temp.data;
    }
    
    public void removeFirst(){
      if (head == null){
        return;
      }
        head.next = head;
    }
    
    public void removeLast(){
      if (head == null){
       return ;
      }
      Node temp = head;
      Node prev = null;
      
      while (temp != null){
       prev = temp;
       temp = temp.next;
      }
     
      prev.next = null;
    }
    
    public void removeList (int index){
      if (index > Size() || index < 0){
        return;
      }
      Node temp = head;
      Node prev = null;
      
      int count = 0;
      
      while (temp != null && count != index){
        count ++;
        prev = temp;
        temp = temp.next;
      }
    }
    
    }


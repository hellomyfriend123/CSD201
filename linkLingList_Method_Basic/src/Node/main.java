/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Node;

/**
 *
 * @author DELL
 */
public class main {
   public static void main(String[] args) {
        Singlylinklist list = new Singlylinklist();
        
        list.addFirst(1);
        list.addTail(2);
        list.addTail(3);
        list.addFirst(0);
        list.addTail(4);
        list.addTail(5);
        list.PrintLit();
        System.out.println("Size: " + list.getSize()); 
    }
}


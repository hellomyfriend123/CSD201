/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Node;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class main {
    public static void main(String[] args) {
        Singlylinklist list = new Singlylinklist();
        
        list.addFirst(5);
        list.addTail(10);
        list.addTail(15);
        list.addTail(20);
        list.addTail(25);
        list.addList(2, 7);
        list.PrintLit();
        System.out.println("size list " + list.getSize());
        System.out.println("Search " + list.search(2));
        list.removeLast();
        System.out.println((int) list.search(list.Size()-1));
        System.out.println("__________");
        System.out.println(list.search(2));
        list.removeList(0);
        System.out.println(list.search(0));
                }
}

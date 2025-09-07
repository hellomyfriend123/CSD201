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
        Node node = new Node(1);
        Node node2 = new Node(2);
        node.next = node2; // cách mà 2 node nối với nhau
                           // muốn 2 node nối với nhau thì ta lấy đuôi đầu nối đầu kế 
    }
}

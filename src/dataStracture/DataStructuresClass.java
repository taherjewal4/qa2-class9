package dataStracture;

import java.util.*;

public class DataStructuresClass {

    // List vs Set

    List li = new ArrayList();
    List li1 = new LinkedList();

//    ArrayList vs LinkedList

//  0  Jhon  node 1
    //1  Smith node 2
//  1  David node 2
//  2  Adam  node 3

    // Arraylist index bases vs Linkedlist is node bases
    // Arraylist is Faster in terms of Getting the data from the list but LinkedlIst is slow
    // Inserting into arraylisr is slow but linkedlist is fast
    // Arraylist does not mantain the order but LinkedList Does


    Queue q = new ArrayDeque<>();
    // FIFO

    Stack st = new Stack<>();
   // LIFO

    //Map -> Interface -> Work with key value pairs

    /***
     *  Anagram
     *  Parmutaion
     *  Fibonacci
     *  PrimeNumber
     *
     *
     *  String revaerse -> How many way
     *  Buffer vs Bulder
     *  Find the longest word from the string
     *
     *  Find the smallest words from the string
     *  Find the bigest number in the arra
     * @param args
     */

    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1,"Jhon");
        mp.put(2,"Adam");
        mp.put(3,"Smith");
        mp.put(4,"David");
        for (Map.Entry<Integer, String> m : mp.entrySet()){
            System.out.println(m.getKey()+" -> "+m.getValue());
        }



    }

}

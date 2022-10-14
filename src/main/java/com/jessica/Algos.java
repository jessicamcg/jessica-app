package com.jessica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class Algos {
  public static void main(String[] args) {
    ArrayList<Object> arr1 =new ArrayList<>();
    arr1.add("jessica");
    arr1.add("william");
    arr1.add(22);
    arr1.add("pepper");
    System.out.println("original arraylist : "+arr1.toString());
    System.out.println("reversed arraylist : "+reverseArr(arr1).toString());
    System.out.println("swap two elements : "+swapArr(arr1,0,1).toString());
    System.out.println("iterate arraylist starting from specific index : "+printArrFromIndex(arr1, 2));
    System.out.println();

    LinkedList<Object> arr2 =new LinkedList<>();
    arr2.add("jessica");
    arr2.add("william");
    arr2.add(22);
    arr2.add("pepper");
    System.out.println("original linkedlist : "+arr2.toString());
    System.out.println("replacing element in linkedlist : "+replaceElLinkedList(arr2, 1, "bell"));
    System.out.println();

    HashSet<Object> hset = new HashSet<>();
    hset.add("jessica");
    hset.add("william");
    hset.add(22);
    hset.add("pepper");  
    System.out.println("original hashset : "+hset.toString());
    System.out.println("hashset again, but as an array : "+Arrays.toString(hsetToArray(hset)));
  }

  // i)Write a Java program to reverse elements in a array list?
  public static ArrayList<Object> reverseArr(ArrayList<Object> list) {
    ArrayList<Object> revArr = new ArrayList<>();
    for (int i = list.size() - 1; i >= 0; i--) {
        revArr.add(list.get(i));
    }

    return revArr;
  }
  // ii) Write a Java program of swap two elements in an array list?
  private static ArrayList<Object> swapArr(ArrayList<Object> list, int index1, int index2) {
    try {
      ArrayList<Object> swapped =new ArrayList<>();
      for (int i = 0; i <= list.size()-1; i++) {
        swapped.add(list.get(i));
    }
      swapped.set(index2, list.get(index1));
      swapped.set(index1, list.get(index2));
      return swapped;
    } catch (Exception e) {
      System.out.println(e + "returning original arraylist");
      return list;
    }
  }
  // iii)Write a Java program to iterate through all elements in a 
  //      linked list starting at the specified position?
  private static ArrayList<Object> printArrFromIndex(ArrayList<Object> list, int index) {
    try {
      ArrayList<Object> arr =new ArrayList<>();
      for (int i = index; i <= list.size()-1; i++) {
        arr.add(list.get(i));
      }
      return arr;
    } catch (Exception e) {
      System.out.println(e + "returning original arraylist");
      return list;
    }
  }  
  // iv)Write a Java program to replace an element in a linked list?
  public static LinkedList<Object> replaceElLinkedList(LinkedList<Object> list, int index, Object newElement) {
    try {
      LinkedList<Object> newList = new LinkedList<>();
      for (int i = 0; i <= list.size()-1; i++) {
        if (i!=index) {
          newList.add(list.get(i));
        } else {
          newList.add(newElement);
        }
      }
      return newList;
    } catch (Exception e) {
      System.out.println(e + "returning original arraylist");
      return list;
    }
  }
  // v)Write a Java program to convert a hash set to an array?
    // there is already a built in method to convert a hashset to an array
  public static Object[] hsetToArray(HashSet<Object> hashset) {
    return hashset.toArray();
  }
}

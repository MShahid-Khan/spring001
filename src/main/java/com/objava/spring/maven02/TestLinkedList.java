/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven02;

import com.objava.spring.maven01.Dog;

/**
 *
 * @author shahzad
 */
public class TestLinkedList {

    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<>("one");
        list.addItem("two");
        list.addItem(new String[]{"three", "four"});
        list.addItem("five");
        System.out.println(list);

        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.addItem(2);
        intList.addItem(new Integer[]{2, 3, 4, 5, 6, 7});
        System.out.println(intList);

        MyLinkedList<Dog> dogList = new MyLinkedList<>();
        dogList.addItem(new Dog("bull dog"));

        MyLinkedList<MyLinkedList<String>> doubleList
                = new MyLinkedList<>();
        doubleList.addItem(list);

        MyLinkedList<MyLinkedList<MyLinkedList<MyLinkedList<String>>>> multiList
                = new MyLinkedList<>();

        MyLinkedList<?>[] array = {list, intList, dogList,
            doubleList, multiList};

        for (MyLinkedList<?> a : array) {
            print(a);
        }

    }

    public static void print(MyLinkedList<?>...a) {
        System.out.println(a);
    }
}

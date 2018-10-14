/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven02;

/**
 *
 * @author shahzad
 */
public class MyLinkedList <T> {

    private ListItem start, end, current;

    public MyLinkedList() {

    }

    public MyLinkedList(T value) {
        addItem(value);
    }

    public MyLinkedList(T[] values) {
        addItem(values);
    }

    public void addItem(T[] items) {
        for (T item : items) {
            addItem(item);
        }
    }

    public void addItem(T item) {
        ListItem it = new ListItem(item);
        if (start == null) {
            start = end = it;
        } else {
            end.next = it;
            end = it;
        }
    }

    public T getFirst() {
        current = start;
        return current != null ? current.item : null;
    }

    public T getNext() {
        if (current != null) {
            current = current.next;
        }
        return current != null ? current.item : null;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        for (T item = getFirst();
                item != null;
                item = getNext()) {
            if (buf.length() > 0) {
                buf.append(", ");
            }
            buf.append(item);
        }
        return buf.toString();
    }

    private class ListItem {

        T item;
        ListItem next;

        public ListItem(T item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "ListItem{" + "item=" + item + '}';
        }

    }

}

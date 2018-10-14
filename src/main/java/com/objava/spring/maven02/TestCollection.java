/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author shahzad
 */
public class TestCollection {

    public static void main(String[] args) {

        //          Sorted  Duplicate   Order
        // Set      No      Yes         No
        // List     No/Yes  Yes         Yes
        // Map      Yes     No          Yes
        // Set - HashSet, LinkedHashSet, TreeSet, EnumSet
        // List - Vector, ArrayList, Stack, LinkedList, Queue
        // Map - Hashtable, HashMap, WeakHashMap, LinkedHashMap
        Set<String> s = new HashSet<String>();
        List<String> l = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();

        // Search 
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(4, "four"));
        list.add(new Student(2, "one"));
        list.add(new Student(3, "three"));
        list.add(new Student(2, "two"));

        System.out.println(list);
//        System.out.println("Index Of 'three' " 
//                + list.indexOf(new Student(3, null)));
//        System.out.println("LastIndex Of 'three' " 
//                + list.lastIndexOf(new Student(3, null)));
//        Collections.sort(list);
//        System.out.println(list);
        
        // Sort 
        // Sort Adapter - Id
        Comparator<Student> idSort = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.id.compareTo(o2.id) ;
            }
        };
        
        // Sort Adapter - Name
        Comparator<Student> nameSort = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name) ;
            }
        };
        
        Collections.sort(list, nameSort) ;
        System.out.println(list) ;
    }

    private static class Student implements Comparable<Student> {

        private Integer id;
        private String name;

        public Student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" + "id=" + id + ", name=" + name + '}';
        }

        @Override
        public int hashCode() {
            int hash = 7;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Student other = (Student) obj;
            if (!Objects.equals(this.id, other.id)) {
                return false;
            }
//            if (!Objects.equals(this.name, other.name)) {
//                return false;
//            }
            return true;
        }

        @Override
        public int compareTo(Student o) {
            // 1 = this > o (Greater)
            // 0 = this == o (Equal) 
            // -1 = this < o (Less) 
            // Compare with ID
            int idx = id.compareTo(o.id);
            // Compare with Name
            return idx == 0 ? name.compareTo(o.name) : idx;
        }

    }
}

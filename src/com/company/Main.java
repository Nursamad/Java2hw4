package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите список А: ");
        Scanner scanner = new Scanner(System.in);
        int stroke = 5;

        ArrayList listA = new ArrayList<>();

        while (stroke > listA.size()) {
            listA.add(scanner.next());
        }

        printList(listA);

        System.out.println("_______________________");
        System.out.println("Введите список Б: ");
        ArrayList listB = new ArrayList<>();

        while (stroke > listB.size()) {
            listB.add(scanner.next());
        }

        printList(listB);

        ArrayList listC = new ArrayList();
        System.out.println("Список С: ");
        Collections.reverse(listB);

        int position = 0;
        while (listA.size() + listB.size() > listC.size()) {
            listC.add(listA.get(position));
            listC.add(listB.get(position));
            position++;
        }
        printList(listC);
        System.out.println("__________________--");
        Collections.sort(listC);
        listC.sort(Comparator.comparing(String::length));
        printList(listC);

    }

    public static void printList(ArrayList list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

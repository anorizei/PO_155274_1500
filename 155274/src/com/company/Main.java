package com.company;

import Z1.ArrayUtil;
import Z2.Print;

import java.time.LocalTime;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> palindrom = new ArrayList<Integer>();
        palindrom.add(1);
        palindrom.add(2);
        palindrom.add(3);
        palindrom.add(2);
        palindrom.add(1);
        System.out.println(ArrayUtil.jestPalindromem(palindrom));
        ArrayList<Integer> niePalindrom = new ArrayList<Integer>();
        niePalindrom.add(1);
        niePalindrom.add(2);
        niePalindrom.add(3);
        niePalindrom.add(4);
        niePalindrom.add(5);
        System.out.println(ArrayUtil.jestPalindromem(niePalindrom));
        ArrayList<LocalTime> palindromLT = new ArrayList<LocalTime>();
        palindromLT.add(LocalTime.of(12,30,30));
        palindromLT.add(LocalTime.of(12,31,30));
        palindromLT.add(LocalTime.of(12,30,30));
        System.out.println(ArrayUtil.jestPalindromem(palindromLT));
        ArrayList<LocalTime> niePalindromLT = new ArrayList<LocalTime>();
        niePalindromLT.add(LocalTime.of(12,30,30));
        niePalindromLT.add(LocalTime.of(12,31,30));
        niePalindromLT.add(LocalTime.of(12,33,30));
        System.out.println(ArrayUtil.jestPalindromem(niePalindromLT));

        Set<String> list = new HashSet<String>();
        list.add("zalicze");
        list.add("egzamin");
        list.add("w 1");
        list.add("terminie");
        System.out.println(palindrom);
        Print.printMarginal(palindrom);
        System.out.println(palindromLT);
        Print.printMarginal(palindromLT);
        System.out.println(list);
        Print.printMarginal(list);
        Set<String> mapa = new TreeSet();
        mapa.add("kolano");
        mapa.add("lokiec");
        mapa.add("pieta");
        System.out.println(mapa);
        Print.printMarginal(mapa);
    }
}

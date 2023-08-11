package org.example;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList(List.of("Ivan","Petr","Semen","Oleg","Artem","Grigoriy"));
        List <String> changedNames = task(names);
        System.out.println(changedNames);
    }

    public static List<String> task(Collection<String> myList){
        return myList.stream()
                .map(e-> e.substring(1))
                .sorted()
                .collect(Collectors.toList());
    }
}
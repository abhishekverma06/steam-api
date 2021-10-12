package com.example.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(21);
    list.add(22);
    list.add(23);
    list.add(24);list.add(25);

    List<Integer> listEven = new ArrayList<>();

    for(int i:list){
      if(i%2==0){
        listEven.add(i);
      }
    }

    System.out.println(list);
    System.out.println(listEven);

    List<Integer> listEvenStream = list.stream().filter(c->c%2==0).collect(Collectors.toList());
    System.out.println(listEvenStream);

    list.stream().filter(c -> c % 2 == 0).forEach(c->System.out.println(c));
    list.stream().forEach(System.out::println);
  }
}

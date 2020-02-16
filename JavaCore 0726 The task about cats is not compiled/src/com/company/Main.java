package com.company;

/*

Task: The program enters data about cats from the keyboard and displays them on the screen.
Example:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20

Requirements:
1. The program should read data from the keyboard.
2. If the user entered an empty line, the program should display data on the screen and exit.
3. If the user entered: Barsik, 6, 5 and 22 (each value from a new line), then the program should output
"Cat name is Barsik, age is 6, weight is 5, tail = 22."
4. If the user entered: Murka, 8, 7 and 20 (each value from a new line), then the program should output
"Cat name is Murka, age is 8, weight is 7, tail = 20."
5. If the user entered: Barsik, 6, 5, 22, Murka, 8, 7 and 20 (each value from a new line),
then the program should print two lines: "Cat name is Barsik, age is 6, weight is 5, tail = 22"
and "Cat name is Murka, age is 8, weight is 7, tail = 20."

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.ArrayList;


public class Main {
    public final static ArrayList<Cat> CATS = new ArrayList<Cat>();
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String name = reader.readLine();
            if(name.isEmpty()) break;
            Cat cat = new Cat(name, Integer.valueOf(reader.readLine()),
        Integer.valueOf(reader.readLine()), Integer.valueOf(reader.readLine()));
            CATS.add(cat);
        }
        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }
    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }
        @Override
        public String toString() {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
         }
    }

}









package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Vijay",Gender.MALE),
                new Person("Tilak",Gender.MALE),
                new Person("Aishwarya",Gender.FEMALE),
                new Person("Kunal", Gender.MALE),
                new Person("Samantha",Gender.FEMALE),
                new Person("Amrutha",Gender.FEMALE),
                new Person("Virat", Gender.MALE),
                new Person("Sejal",Gender.FEMALE)
        );
        //Imperative approach
        //List of all females
        System.out.println("This is the Imperative approach");
        System.out.println("List of all Females by Imperative approach");
        List<Person> females = new ArrayList<>();
        for ( Person person : people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for (Person female : females){
            System.out.println(female);
        }
        //List of all males
        System.out.println("List of all males by Imperative approach");
        List<Person> males = new ArrayList<>();
        for (Person person : people){
            if(Gender.MALE.equals(person.gender)){
                males.add(person);
            }
        }
        for (Person male : males){
            System.out.println(male);
        }


        //Declarative approach
        System.out.println("This is the Declarative approach");
        System.out.println("LIst of all females by Declarative approach");
        List<Person> females2 = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

        //List of all males
        System.out.println("List of all males by Declarative approach");
        List<Person> males2 = people.stream()
                .filter(person -> Gender.MALE.equals(person.gender))
                .collect(Collectors.toList());
        males2.forEach(System.out::println);


    }
    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }
        @Override
        public String toString(){
            return "Person {" +
                    "name = '"+ name + '\'' +
                    ", gender = " + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}


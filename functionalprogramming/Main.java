package functionalprogramming;

import java.util.ArrayList;
import java.util.List;

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
        List<Person> males = new ArrayList<>();
        for (Person person : people){
            if(Gender.MALE.equals(person.gender)){
                males.add(person);
            }
        }
        for (Person male : males){
            System.out.println(male);
        }

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


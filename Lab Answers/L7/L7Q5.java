import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class L7Q5 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream("person.dat"))) {
            int totalRecords = dis.readInt();

            for (int i = 0; i < totalRecords; i++) {
                String name = dis.readUTF();
                int age = dis.readInt();
                char gender = dis.readChar();
                persons.add(new Person(name, age, gender));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Sort the persons by name in ascending order
        Collections.sort(persons, Comparator.comparing(Person::getName));

        // Display the names, ages, and genders
        for (Person person : persons) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Gender: " + person.getGender());
            System.out.println();
        }
    }

    private static class Person {
        private final String name;
        private final int age;
        private final char gender;

        public Person(String name, int age, char gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public char getGender() {
            return gender;
        }
    }
}

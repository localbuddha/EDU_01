package edu08.lectures;

public class Person1 {
    private int age;

    public Person1(int age) {
        this.age = age;
    }

    public class FullName {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void info() {
            System.out.println(firstName + "" + lastName + ", " + age);
            ;
        }

        Person1 person = new Person1(28);
        Person1.FullName personWithName = person.new FullName("Oleg", "Kostenko");
        // personWithName.info();
    }


}

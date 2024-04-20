package edu08.practical;

public class Department {
    String field;
    Address address;

    public Department(String field, Address address) {
        this.field = field;
        this.address = address;
    }

    public static class Address { //Inner Class
        String city;
        String street;
        int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }


    }

    @Override
    public String toString() {
        return "Department{" +
                "field='" + field + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address address = new Address("Odessa", "Khmelnitskogo", 62);
        Department department = new Department("Department 1", address);

        System.out.println(department);
    }

}

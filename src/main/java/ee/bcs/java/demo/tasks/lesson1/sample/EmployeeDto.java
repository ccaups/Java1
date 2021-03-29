package ee.bcs.java.demo.tasks.lesson1.sample;

public class EmployeeDto {
    private int Id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;

//    public EmployeeDto(){}
//
//    public EmployeeDto(int id, String first, String last,int old, String toaddress) {
//        this.Id = id;
//        this.firstName = first;
//        this.lastName = last;
//        this.age = old;
//        this.address = toaddress;
//    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


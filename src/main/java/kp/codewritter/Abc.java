package kp.codewritter;

public class Abc {
    private String name;
    private Integer age;
    private String gender;
    //added new field
    private String address;
    //add some committ here

    public Abc(String name, Integer age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
}

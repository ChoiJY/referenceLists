/**
 * Description: 생성자 관련 pattern
 */

 // Telescoping Constructor Pattern
public class People{

    public People(){}

    public People(int age, String gender, String name){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public People(int age, String gender, String name, String address, String phone){
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public People(int age, String gender, String name, String address, String phone, String description){
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.description = description;
    }

    private int age;
    private String gender;
    private String name;
    private String address;
    private String phone;

    // optional field
    private String description = "default";
}
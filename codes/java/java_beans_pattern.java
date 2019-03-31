/**
 * Description: 생성자 관련 pattern
 */

 // Java beans Pattern
public class People{

    public People(){}
    
    // final 선언을 안해서 consistency 훼손 가능성 존재
    private int age;
    private String gender;
    private String name;
    private String address;
    private String phone;
    private String description;

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }
}
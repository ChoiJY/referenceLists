/**
 * Description: 생성자 관련 pattern
 */

 // Builder pattern
public class People{

    private int age;
    private String gender;
    private String name;
    private String address;
    private String phone;
    private String description;

    private People(Builder builder){
        this.age = builder.age;
        this.gender = builder.gender;
        this.name = builder.name;
        this.address = builder.address;
        this.phone = builder.phone;
        this.description = builder.description;
    }
    
    // interface 이용하여 확장 또는 별도의 클래스로 분리 가능
    public static class Builder{

        private int age;
        private String gender;
        private String name;
        private String address;
        private String phone = "";
        private String description = "";

        public Builder(int age, String gender, String name, String address){
            this.age = age;
            this.gender = gender;
            this.name = name;
            this.address = address;
        }

        public Builder setPhone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder setDescription(String description){
            this.description = description;
            return this;
        }
        public People build(){
            return new People(this);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setAge(25);
        persona.setName("Jose");
        persona.setPhoneNumber(5552081);
        System.out.println(persona.getName() + " tiene " + persona.getAge() + " años y su telefono es " + persona.getPhoneNumber());
    }
}

class Persona {
    private Integer age;
    private String name;
    private Integer phoneNumber;

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
package Humans;

public class Human {
    private String name;
    private String surname;
    private String age;

    public Human(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj) == null) return false;
        if (!(obj instanceof Human)) return false;
        Human human = (Human) obj;
        return human.name == name && human.surname == surname && human.age == age;
    }

    @Override
    public String toString() {
        return name+" "+surname+" возраст:"+age;
    }
}

/**
 * @author LX
 * @Time 2021/7/14
 **/
public class Student {
    private Integer age;
    private String name;
    private Integer stress;

    public Student(Integer age, String name, Integer stress) {
        this.age = age;
        this.name = name;
        this.stress = stress;
    }

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

    public Integer getStress() {
        return stress;
    }

    public void setStress(Integer stress) {
        this.stress = stress;
    }
}

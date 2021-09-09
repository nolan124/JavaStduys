public class Kcsec {
    private String name;
    private Integer age;
    public Object object;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("age = %d, name = %s, object = %s", age, name, object == null ? "null" : object);
    }


}

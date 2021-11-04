package tree;

public class User implements Comparable<User>{
    private final int age;

    private final String name;

    public User(final int age, final String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User o) {
        return this.getAge()-o.getAge();
    }
}

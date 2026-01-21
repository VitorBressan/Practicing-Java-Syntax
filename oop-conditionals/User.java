public class User {
    private int age;
    private boolean active;

    public User(int age){
        this.age = age;
        this.active = true;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isActive(){
        return this.active;
    }
}

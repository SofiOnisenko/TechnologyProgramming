abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public abstract void Sound();
    public abstract void Move();
    public void eat()
    {
        System.out.println(name + " кушает.");
    }

}

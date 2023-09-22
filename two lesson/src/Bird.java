class Bird extends Animals {
    public Bird(String name, int age)
    {
        super(name, age);
    }
    @Override
    public  void Sound()
    {
        System.out.println(getName() + " говорит: Чирик-чирик!");
    }

    @Override
    public  void Move()
    {
        System.out.println(getName() + " летит.");
    }
}
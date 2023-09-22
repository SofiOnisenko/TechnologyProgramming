class Shark extends Animals {
    public Shark(String name, int age)
    {
        super(name, age);
    }
    @Override
    public  void Sound()
    {
        System.out.println(getName() + " говорит: Туруруру!");
    }

    @Override
    public  void Move()
    {
        System.out.println(getName() + " поет веселую песенку.");
    }
}
class Tiger extends Animals implements Hishnikys {
    public Tiger(String name, int age)
    {
        super(name, age);
    }
    @Override
    public  void Sound()
    {
        System.out.println(getName() + " рычит!");
    }

    @Override
    public  void Move()
    {
        System.out.println(getName() + " охотится.");
    }

    @Override
    public  void Hishnikys()
    {
        System.out.println(" Является хищником.");
    }


}

class Cat {
    public static int counter = 0;
    String name;
    int age;

    public Cat(String name, int age) {
        Cat.counter++;
        this.name = name;
        this.age = age;
        if (Cat.counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return Cat.counter;
    }
}
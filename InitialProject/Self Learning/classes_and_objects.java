class Scratch {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bhuzzo", 20, "Doberman");
        dog1.name = "Bruno";
        dog1.breed = "Lebra";
        dog1.age = 7;
        dog1.display();
    }
}

class Dog {
    String name;
    int age;
    String breed;

    Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    void display() {
        System.out.println("My dog name is " + this.name + " and age = " + this.age + " and breed is = " + this.breed);
    }
}

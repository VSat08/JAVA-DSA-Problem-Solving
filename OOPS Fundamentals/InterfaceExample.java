
import java.util.Random;


interface Pet {

    void play();
}

class Dog implements Pet {

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

class Cat implements Pet {

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        if (dog instanceof Pet) {
            dog.play();
        }

        if (cat instanceof Pet) {
            cat.play();
        }


        Pet pet;
        Random rand = new Random();
        int n = rand.nextInt(2);

        if(n == 0) {
            pet = new Dog();
        } else {
            pet = new Cat();
        }


        pet.play();
    }
}

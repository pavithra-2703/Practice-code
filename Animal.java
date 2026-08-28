class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public void play() {
        System.out.println("Animal plays");
    }
}


class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void play() {
        System.out.println("Dog plays fetch");
    }
}


class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void play() {
        System.out.println("Cat plays with yarn");
    }
}


class main {
    public static void main(String[] args) {
        Animal pet;

        pet = new Dog();
        pet.sound();
        pet.play();

        pet = new Cat();
        pet.sound();
        pet.play();
    }
}

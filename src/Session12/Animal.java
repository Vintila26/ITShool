package Session12;

public abstract class Animal{

    public void eat(){
        System.out.println("this animal can eat");
    }

    public abstract void makeSound();

}

interface Pet{
    void  poop();
}
class Cat extends Animal implements Pet{

    @Override
    public void makeSound(){
        System.out.println("The cat miau");
    }
    @Override
    public void poop(){
        System.out.println("Cats make nagte");
    }
    @Override
    public void eat(){
        System.out.println("My cat eat like a lyon");
    }
}
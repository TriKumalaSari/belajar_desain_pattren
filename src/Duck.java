interface QuacKable{

    void quack();
}

interface flyable {
    void fly();
}

abstract class duck {
    abstract void display();

    void swim(){
    System.out.println("Berenang");
    }
}

class Mallardduck extends  Duck implements  QuacKable, Flyable{
    @Override
    public void quack(){
        System.out.println("Qwek Qwek");
    }
    @Override
    public void fly(){
        System.out.println("Terbang");
    }
    @Override
    void  display(){
        System.out.println("Tampilan MallardDuck");
    }
}

class Redheadduck extends  Duck implements  QuacKable, Flyable {
    @Override
    public void quack() {
        System.out.println("Qwek Qwek");
    }

    @Override
    public void fly() {
        System.out.println("Terbang");
    }

    @Override
    void display() {
        System.out.println("Tampilan RedHeadDuck");
    }
}

class Redheadduc extends Duck implements QuacKable{
    @Override
    public void quack(){
        System.out.println("Squeak");
    }
    @Override
    void display(){
        System.out.println("Tampilan RubberDuck");
    }
}

class WoodendDuck extends Duck{
    void displya (){
        System.out.println("Tampilan WoodenDuck");
    }

    @Override
    void display() {

    }
}

class Toyduck extends  Duck implements Flyable{
    @Override
    public void  fly(){
        System.out.println("Terbang Seperti Mainan");
    }
    @Override
    void  display(){
        System.out.println("Tampilan ToyDuck");
    }
}
//given code

/**
 * Objective: Define tester class
 * Algorithm: Serves as tester class
 * Input and Output: Outputs sound (if animal) and method of consumption (if edible) of objects
 * Created by: Gary Sun
 * Date: 6/23
 * Version: 1
*/
public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange(), new Fish(), new Watermelon()};

        for(int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof Edible)
                System.out.println(((Edible)objects[i]).howToEat());
            
            if(objects[i] instanceof Animal)
                System.out.println(((Animal)objects[i]).sound());
        }
    }
}

/**
 * Objective: Define abstract Animal class
 * Algorithm: Creates abstract sound() method
 * Input and Output: N/A
 * Created by: Gary Sun
 * Date: 6/23
 * Version: 1
*/
abstract class Animal {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //return animal sound
    public abstract String sound();
}

/**
 * Objective: Define Chicken class
 * Algorithm: Implements howToEat() and sound() methods
 * Input and Output: Returns method of consumption and sound of a chicken
 * Created by: Gary Sun
 * Date: 6/23
 * Version: 1
*/
class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: Cock-a-doodle-doo";
    }
}

/**
 * Objective: Define Tiger class
 * Algorithm: Implements sound() method
 * Input and Output: Returns sound of a tiger
 * Created by: Gary Sun
 * Date: 6/23
 * Version: 1
*/
class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger: RROOAARR";
    }
}

/**
 * Objective: Define abstract Fruit class
 * Algorithm: Creates empty class
 * Input and Output: N/A
 * Created by: Gary Sun
 * Date: 6/23
 * Version: 1
*/
abstract class Fruit implements Edible {

}

/**
 * Objective: Define Apple class
 * Algorithm: Implements howToEat() method
 * Input and Output: Returns method of consumption of an apple
 * Created by: Gary Sun
 * Date: 6/23
 * Version: 1
*/
class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

/**
 * Objective: Define Orange class
 * Algorithm: Implements howToEat() method
 * Input and Output: Returns method of consumption of an orange
 * Created by: Gary Sun
 * Date: 6/23
 * Version: 1
*/
class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}
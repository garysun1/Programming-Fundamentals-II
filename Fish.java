//implemented code

/**
 * Objective: Define Fish class
 * Algorithm: Implements howToEat() and sound() methods
 * Input and Output: Returns method of consumption and sound of a fish
 * Created by: Gary Sun
 * Date: 6/23
 * Version: 1
*/
public class Fish extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Fish: Sauté it";
    }
    
    @Override
    public String sound() {
        return "Fish: Glub";
    }
}
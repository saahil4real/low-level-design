import BreatheMechanism.LandBreatheImpl;
import BreatheMechanism.TreeBreatheImpl;
import BreatheMechanism.WaterBreatheImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LivingThings dogObject = new Dog(new LandBreatheImpl());
        LivingThings fishObject = new Fish(new WaterBreatheImpl());
        LivingThings treeObject = new Tree(new TreeBreatheImpl());

        dogObject.breatheProcess();
        fishObject.breatheProcess();
        treeObject.breatheProcess();
    }
}
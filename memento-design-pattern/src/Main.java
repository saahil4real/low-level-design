//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfigurationCareTaker careTakerObject = new ConfigurationCareTaker();

        ConfigurationOriginator originatorObject = new ConfigurationOriginator(5, 10);

        ConfigurationMemento snapshot1 = originatorObject.createMemento();
        careTakerObject.addMemento(snapshot1);

        originatorObject.setHeight(7);
        originatorObject.setWidth(12);

        ConfigurationMemento snapshot2 = originatorObject.createMemento();
        careTakerObject.addMemento(snapshot2);

        originatorObject.setHeight(9);
        originatorObject.setWidth(14);

        ConfigurationMemento restoredStateMementoObj = careTakerObject.undo();
        originatorObject.restoreMemento(restoredStateMementoObj);

        System.out.println("Height: " +  originatorObject.height + " Width: " + originatorObject.width);
    }
}
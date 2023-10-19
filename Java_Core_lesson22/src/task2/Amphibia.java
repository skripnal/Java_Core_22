package task2;

public class Amphibia {
	public void doAction(String actionName, Action action) {
        System.out.print("Амфібія " + actionName + ": ");
        action.perform();
    }
}

package output.actions;

/**
 * Base strategy to dispose a drink. This is common to {@link input.VM1} and {@link input.VM2}.
 */
public class DisposeDrink implements DisposeDrinkStrategy {

    @Override
    public void disposeDrink(String d) {
        System.out.format("Drink %s disposed\n", d);
    }
}

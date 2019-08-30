package states;

import mda.MDA_EFSM;
import output.OutputProcessor;

/**
 * {@link State} where the system awaits for enough funds. It also accepts new configuration for the price or more cups
 * inserted into the system.
 */
public class Idle extends State {

    Idle(OutputProcessor op, MDA_EFSM context) {
        super(op, context);
    }

    @Override
    public void create() {
        // Do nothing
    }

    /**
     * Increment the number of cups stored into the system. There is no change of state.
     *
     * @param n the number of cups that are added to the system.
     */
    @Override
    public void insert_cups(int n) {
        if (n > 0) {
            int k = ctxt.getK();
            k += n;
            ctxt.setK(k);
            System.out.format("Added %d cups. Now there are %d\n", n, k);
        }
        ctxt.setState(this);
    }

    /**
     * Coins are inserted into the system. If they are enough for a drink, the next state is {@link CoinsInserted},
     * otherwise there will not be a change of state.
     *
     * @param f true if the amount of funds are enough for a drink, false otherwise
     */
    @Override
    public void coin(boolean f) {
        if (f) {                                            // The amount is enough to purchase a drink
            op.increaseCF();                                // increase the amount of funds in the system.
            ctxt.getA().clear();                            // reset the additives
            ctxt.setState(new CoinsInserted(op, ctxt));     // change of state to CoinsInserted
        } else {                                            // more funds needed
            op.increaseCF();                                // increase the accumulated funds anyway
            ctxt.setState(this);                            // no change of state
        }
    }

    /**
     * A card with enough credit is inserted, so the next state is equivalent to the one with enough coins.
     * I.e. ({@link CoinsInserted})
     */
    @Override
    public void card() {
        op.zeroCF();                                    // There is no need for accumulated funds with a card
        ctxt.getA().clear();                            // reset the additives
        ctxt.setState(new CoinsInserted(op, ctxt));     // change of state
    }

    @Override
    public void cancel() {
        // Do nothing
    }

    /**
     * Set the drink price. There is no change of state.
     */
    @Override
    public void set_price() {
        op.storePrice();
        ctxt.setState(this);
    }

    @Override
    public void dispose_drink(String d) {
        // Do nothing
    }

    @Override
    public void additive(String a) {
        // Do nothing
    }
}

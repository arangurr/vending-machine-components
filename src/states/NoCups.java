package states;

import mda.MDA_EFSM;
import output.OutputProcessor;

/**
 * {@link State} where there are no cups available in the system. All actions except coin() and insert_cups() are
 * ignored
 */
public class NoCups extends State {

    NoCups(OutputProcessor op, MDA_EFSM context) {
        super(op, context);
    }

    @Override
    public void create() {
        // Do nothing
    }

    /**
     * Inserts a number of cups into the system, initializes cumulative funds. Next state is {@link Idle} if the
     * number is greater than zero.
     *
     * @param n number of cups to be inserted in the system.
     */
    @Override
    public void insert_cups(int n) {
        if (n > 0) {
            ctxt.setK(n);
            op.zeroCF();
            ctxt.setState(new Idle(op, ctxt));
            System.out.format("Added %d cups\n", n);
        } else {
            // Do nothing
        }
    }

    /**
     * Coins inserted are ignored and immediately returned. There is no change of state
     *
     * @param f (ignored)
     */
    @Override
    public void coin(boolean f) {
        op.returnCoins();
        ctxt.setState(this);
    }


    @Override
    public void card() {
        // Do nothing
    }

    @Override
    public void cancel() {
        // Do nothing
    }

    @Override
    public void set_price() {
        // Do nothing
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

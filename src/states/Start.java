package states;

import mda.MDA_EFSM;
import output.OutputProcessor;

/**
 * Initial {@link State}. The only available action is to create the system. The rest of the actions are ignored.
 */
public class Start extends State {

    public Start(OutputProcessor op, MDA_EFSM context) {
        super(op, context);
    }

    /**
     * Start the system, storing the set price.
     * Next state is {@link NoCups}
     */
    @Override
    public void create() {
        op.storePrice();
        ctxt.setState(new NoCups(op, ctxt));
    }

    @Override
    public void insert_cups(int n) {
        // Do nothing
    }

    @Override
    public void coin(boolean f) {
        // Do nothing
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

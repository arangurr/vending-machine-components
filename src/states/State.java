package states;

import mda.MDA_EFSM;
import output.OutputProcessor;

/**
 * Base abstract state class.
 */
public abstract class State {

    // Reference to the output processor that is needed so the states call them to perform actions
    OutputProcessor op;

    // The MDA-EFSM constitutes the context class in the state pattern
    MDA_EFSM ctxt;

    State(OutputProcessor op, MDA_EFSM context) {
        this.op = op;
        this.ctxt = context;
    }

    public abstract void create();

    public abstract void insert_cups(int n);

    public abstract void coin(boolean f);

    public abstract void card();

    public abstract void cancel();

    public abstract void set_price();

    public abstract void dispose_drink(String d);

    public abstract void additive(String a);
}

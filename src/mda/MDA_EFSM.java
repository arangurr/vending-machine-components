package mda;

import output.OutputProcessor;
import states.Start;
import states.State;

import java.util.HashMap;

/**
 * Class representing the model independent logic
 */
public class MDA_EFSM {

    // List of additives to be added. They key is the identifier for the additive. The value is a boolean indicating
    // whether or not this additive is configured to be added.
    private HashMap<String, Boolean> A;

    // Number of cups stored in the system
    private int k;

    // The state the system is currently in
    private State state;

    public MDA_EFSM(OutputProcessor op) {
        state = new Start(op, this);
        A = new HashMap<>();
    }

    public void create() {
        state.create();
    }

    public void insert_cups(int n) {
        state.insert_cups(n);
    }

    public void coin(boolean f) {
        state.coin(f);
    }

    public void card() {
        state.card();
    }

    public void cancel() {
        state.cancel();
    }

    public void set_price() {
        state.set_price();
    }

    public void dispose_drink(String d) {
        state.dispose_drink(d);
    }

    public void additive(String a) {
        state.additive(a);
    }

    /**
     * Setter to configure the state on the context
     *
     * @param state the new state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the current amount of cups in the system.
     *
     * @return k, the number of cups in the system.
     */
    public int getK() {
        return k;
    }

    /**
     * Sets the number of cups in the system.
     *
     * @param k New number of cups in the system
     */
    public void setK(int k) {
        this.k = k;
    }

    /**
     * Getter for A, the additives of additives to be added
     *
     * @return A, the map of additives to be added
     */
    public HashMap getA() {
        return A;
    }
}

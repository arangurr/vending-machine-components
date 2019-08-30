package states;

import mda.MDA_EFSM;
import output.OutputProcessor;

import java.util.HashMap;

/**
 * State where drinks are configured and dispensed
 */
public class CoinsInserted extends State {

    CoinsInserted(OutputProcessor op, MDA_EFSM context) {
        super(op, context);
    }

    @Override
    public void create() {
        // Do nothing
    }

    @Override
    public void insert_cups(int n) {
        // Do nothing
    }

    /**
     * More coins are inserted, but they will be returned. No change of state.
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

    /**
     * Cancel configured drink, return coins. Return to {@link Idle} state.
     */
    @Override
    public void cancel() {
        op.returnCoins();
        op.zeroCF();
        ctxt.setState(new Idle(op, ctxt));
    }

    @Override
    public void set_price() {
        // Do nothing
    }

    /**
     * Dispose configured drink and additives. Decrease the amount of cups in the system.
     *
     * @param d drink to be disposed.
     */
    @Override
    public void dispose_drink(String d) {
        if (ctxt.getK() > 1) {
            op.disposeDrink(d);
            op.disposeAdditive(ctxt.getA());
            int k = ctxt.getK() - 1;                // the new number of cups in the system.
            ctxt.setK(k);
            op.zeroCF();
            ctxt.setState(new Idle(op, ctxt));      // there is at least one cup left in the system.
        } else {
            op.disposeDrink(d);
            op.disposeAdditive(ctxt.getA());
            ctxt.setState(new NoCups(op, ctxt));    // there is no more cups in the system. Change state accordingly.
        }
    }

    /**
     * Toggle the addition of an additive. There is no change of state
     *
     * @param a additive to be toggled
     */
    @Override
    public void additive(String a) {

        HashMap map = ctxt.getA();
        Object currSetting = map.get(a);

        if (currSetting == null || !(boolean) currSetting) {
            // additive was never configured or it is currently not set to be added.
            map.put(a, true);   // set the additive to be added
            System.out.format("Additive %s will be added\n", a);
        } else {
            // additive was set to be added.
            map.put(a, false);  // cancel the addition of that additive
            System.out.format("Additive %s canceled\n", a);
        }
        ctxt.setState(this);
    }
}

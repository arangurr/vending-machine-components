package input;

import data.DataStore1;
import factory.AbstractFactory;
import mda.MDA_EFSM;
import output.OutputProcessor;

/**
 * Input processor for Vending Machine 1
 * Methods in this represent entry points for the physical system
 */
public class VM1 {

    private DataStore1 d;
    private MDA_EFSM m;

    /**
     * Constructor for Vending Machine 1.
     *
     * @param factory Concrete Factory to initialize the appropriate {@link data.DataStore}
     */
    public VM1(AbstractFactory factory) {
        d = (DataStore1) factory.getDataStore();
        m = new MDA_EFSM(new OutputProcessor(factory));
    }

    public void create(int price) {
        d.setTemp_p(price);
        m.create();
    }

    public void coin(int v) {
        d.setTemp_v(v);
        if (d.getCf() + v >= d.getPrice())
            m.coin(true);
        else
            m.coin(false);
    }

    public void sugar() {
        m.additive(DataStore1.SUGAR);
    }

    public void tea() {
        m.dispose_drink(DataStore1.TEA);
    }

    public void chocolate() {
        m.dispose_drink(DataStore1.CHOCOLATE);
    }

    public void insert_cups(int n) {
        m.insert_cups(n);
    }

    public void set_price(int p) {
        d.setTemp_p(p);
        m.set_price();
    }

    public void cancel() {
        m.cancel();
    }

    public void card(float x) {
        if (x >= d.getPrice())
            m.card();
    }
}

package input;

import data.DataStore2;
import factory.AbstractFactory;
import mda.MDA_EFSM;
import output.OutputProcessor;


/**
 * Input processor for Vending Machine 2
 * Methods in this represent entry points for the physical system
 */
public class VM2 {

    private DataStore2 d;
    private MDA_EFSM m;

    /**
     * Constructor for Vending Machine 1.
     *
     * @param factory Concrete Factory to initialize the appropriate {@link data.DataStore}
     */
    public VM2(AbstractFactory factory) {
        d = (DataStore2) factory.getDataStore();
        m = new MDA_EFSM(new OutputProcessor(factory));
    }

    public void CREATE(float p) {
        d.setTemp_p(p);
        m.create();
    }

    public void COIN(float v) {
        d.setTemp_v(v);
        if (d.getCf() + v >= d.getPrice()) m.coin(true);
        else m.coin(false);
    }

    public void SUGAR() {
        m.additive(DataStore2.SUGAR);
    }

    public void CREAM() {
        m.additive(DataStore2.CREAM);
    }

    public void COFFEE() {
        m.dispose_drink(DataStore2.COFFEE);
    }

    public void InsertCups(int n) {
        m.insert_cups(n);
    }

    public void SetPrice(float p) {
        d.setTemp_p(p);
        m.set_price();
    }

    public void CANCEL() {
        m.cancel();
    }
}

package output.actions;

import data.DataStore;
import data.DataStore1;

/**
 * Concrete strategy to zero accumulated funds for {@link input.VM2}
 */
public class ZeroCF1 implements ZeroCFStrategy {

    @Override
    public void zeroCF(DataStore dataStore) {
        DataStore1 ds1 = (DataStore1) dataStore;
        ds1.setCf(0);
        System.out.format("Reset accumulated funds to zero\n");
    }
}

package output.actions;

import data.DataStore;
import data.DataStore2;

/**
 * Concrete strategy to zero accumulated funds for {@link input.VM2}
 */
public class ZeroCF2 implements ZeroCFStrategy {

    @Override
    public void zeroCF(DataStore dataStore) {

        DataStore2 ds2 = (DataStore2) dataStore;
        ds2.setCf(0);
        System.out.format("Reset accumulated funds to zero\n");
    }
}

package output.actions;

import data.DataStore;
import data.DataStore1;

/**
 * Concrete strategy to return coins specific to {@link input.VM1}
 */
public class ReturnCoins1 implements ReturnCoinsStrategy {

    @Override
    public void returnCoins(DataStore dataStore) {

        DataStore1 ds1 = (DataStore1) dataStore;
        int v = ds1.getTemp_v();
        System.out.format("Returned coins for value of %d\n", v);
    }
}

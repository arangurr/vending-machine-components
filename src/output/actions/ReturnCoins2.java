package output.actions;

import data.DataStore;
import data.DataStore2;

/**
 * Concrete strategy to return coins specific to {@link input.VM1}
 */
public class ReturnCoins2 implements ReturnCoinsStrategy {

    @Override
    public void returnCoins(DataStore dataStore) {

        DataStore2 ds2 = (DataStore2) dataStore;
        float v = ds2.getTemp_v();
        System.out.format("Returned coins for value of %f\n", v);
    }
}

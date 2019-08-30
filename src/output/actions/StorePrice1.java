package output.actions;

import data.DataStore;
import data.DataStore1;

/**
 * Concrete strategy to store drink price for {@link input.VM1}
 */
public class StorePrice1 implements StorePriceStrategy {

    @Override
    public void storePrice(DataStore dataStore) {

        DataStore1 ds1 = (DataStore1) dataStore;
        int p = ds1.getTemp_p();
        ds1.setPrice(p);
        System.out.format("Drink price set to %d\n", p);
    }
}

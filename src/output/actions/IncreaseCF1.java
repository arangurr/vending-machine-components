package output.actions;

import data.DataStore;
import data.DataStore1;

/**
 * Concrete strategy to increase funds specific for {@link input.VM1}
 */
public class IncreaseCF1 implements IncreaseCFStrategy {

    @Override
    public void increaseCF(DataStore dataStore) {

        DataStore1 ds1 = (DataStore1) dataStore;    // Cast to DataStore1 to allow accessing appropriate methods
        int cf = ds1.getCf() + ds1.getTemp_v();     // The new accumulated funds
        ds1.setCf(cf);                              // Save the new funds to the DataStore
        System.out.format("%d funds accumulated in the system\n", cf);
    }
}

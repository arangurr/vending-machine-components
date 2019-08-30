package output.actions;

import data.DataStore;
import data.DataStore2;

/**
 * Concrete strategy to increase funds specific for {@link input.VM2}
 */
public class IncreaseCF2 implements IncreaseCFStrategy {

    @Override
    public void increaseCF(DataStore dataStore) {

        DataStore2 ds2 = (DataStore2) dataStore;        // Cast to DataStore1 to allow accessing appropriate methods
        float cf = ds2.getCf() + ds2.getTemp_v();       // The new accumulated funds
        ds2.setCf(cf);                                  // Save the new funds to the DataStore
        System.out.format("%f funds accumulated in the system\n", cf);
    }
}

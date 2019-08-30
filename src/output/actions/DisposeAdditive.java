package output.actions;

import java.util.HashMap;
import java.util.Set;

/**
 * Base strategy to dispose an additive. This is common to the Vending Machine 1 and 2.
 */
public class DisposeAdditive implements DisposeAdditiveStrategy {

    @Override
    public void disposeAdditive(HashMap a) {
        Set keys = a.keySet();

        // Iterate over all additives (set to be added or not) in the system.
        for (Object additive : keys) {
            // If it was selected to be added, dispose it.
            if ((boolean) a.get(additive)) {
                System.out.format("Additive %s added\n", (String) additive);
            }  // Otherwise, skip this additive
        }
    }
}

package output.actions;

import data.DataStore;

/**
 * Strategy to increase funds
 */
public interface IncreaseCFStrategy {

    void increaseCF(DataStore dataStore);
}

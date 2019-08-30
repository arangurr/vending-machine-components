package output.actions;

import data.DataStore;

/**
 * Strategy to reset the accumulated fund count
 */
public interface ZeroCFStrategy {

    void zeroCF(DataStore dataStore);
}

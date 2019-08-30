package output.actions;

import data.DataStore;

/**
 * Strategy to store price
 */
public interface StorePriceStrategy {

    void storePrice(DataStore dataStore);
}

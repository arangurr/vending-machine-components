package output.actions;

import data.DataStore;

/**
 * Strategy to return coins
 */
public interface ReturnCoinsStrategy {

    void returnCoins(DataStore dataStore);
}

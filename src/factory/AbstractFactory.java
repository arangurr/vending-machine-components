package factory;

import data.DataStore;
import output.actions.*;

/**
 * Abstract class that fetches and initializes the appropriate objects for every kind of Model
 */
public abstract class AbstractFactory {

    public abstract DataStore getDataStore();

    public abstract ZeroCFStrategy getZeroCFStrategy();

    public abstract StorePriceStrategy getStorePriceStrategy();

    public abstract DisposeDrinkStrategy getDisposeDrinkStrategy();

    public abstract IncreaseCFStrategy getIncreaseCFStrategy();

    public abstract ReturnCoinsStrategy getReturnCoinsStrategy();

    public abstract DisposeAdditiveStrategy getDisposeAdditiveStrategy();

}

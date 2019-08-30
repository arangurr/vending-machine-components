package output;

import data.DataStore;
import factory.AbstractFactory;
import output.actions.*;

import java.util.HashMap;

/**
 * Output Processor class. This is the interface that calls the functions that perform actions on the external system.
 * It is initialized using the appropriate Concrete Factory
 */
public class OutputProcessor {

    private DataStore dataStore;
    private StorePriceStrategy storePriceStrategy;
    private ZeroCFStrategy zeroCFStrategy;
    private DisposeAdditiveStrategy disposeAdditiveStrategy;
    private DisposeDrinkStrategy disposeDrinkStrategy;
    private IncreaseCFStrategy increaseCFStrategy;
    private ReturnCoinsStrategy returnCoinsStrategy;

    public OutputProcessor(AbstractFactory factory) {
        dataStore = factory.getDataStore();
        storePriceStrategy = factory.getStorePriceStrategy();
        zeroCFStrategy = factory.getZeroCFStrategy();
        disposeAdditiveStrategy = factory.getDisposeAdditiveStrategy();
        disposeDrinkStrategy = factory.getDisposeDrinkStrategy();
        increaseCFStrategy = factory.getIncreaseCFStrategy();
        returnCoinsStrategy = factory.getReturnCoinsStrategy();
    }


    public void storePrice() {
        storePriceStrategy.storePrice(dataStore);
    }

    public void zeroCF() {
        zeroCFStrategy.zeroCF(dataStore);
    }

    public void increaseCF() {
        increaseCFStrategy.increaseCF(dataStore);
    }

    public void returnCoins() {
        returnCoinsStrategy.returnCoins(dataStore);
    }

    public void disposeDrink(String d) {
        disposeDrinkStrategy.disposeDrink(d);
    }

    public void disposeAdditive(HashMap a) {
        disposeAdditiveStrategy.disposeAdditive(a);
    }
}

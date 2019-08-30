package factory;

import data.DataStore;
import data.DataStore2;
import output.actions.*;

/**
 * Concrete {@link AbstractFactory} that initializes the appropriate strategies and {@link DataStore} for
 * {@link input.VM2}
 */
public class ConcreteFactory2 extends AbstractFactory {

    private DataStore2 ds2 = new DataStore2();

    @Override
    public DataStore getDataStore() {
        return ds2;
    }

    @Override
    public ZeroCFStrategy getZeroCFStrategy() {
        return new ZeroCF2();
    }

    @Override
    public StorePriceStrategy getStorePriceStrategy() {
        return new StorePrice2();
    }

    @Override
    public DisposeDrinkStrategy getDisposeDrinkStrategy() {
        return new DisposeDrink();
    }

    @Override
    public IncreaseCFStrategy getIncreaseCFStrategy() {
        return new IncreaseCF2();
    }

    @Override
    public ReturnCoinsStrategy getReturnCoinsStrategy() {
        return new ReturnCoins2();
    }

    @Override
    public DisposeAdditiveStrategy getDisposeAdditiveStrategy() {
        return new DisposeAdditive();
    }
}

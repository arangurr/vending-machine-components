package factory;

import data.DataStore;
import data.DataStore1;
import output.actions.*;

/**
 * Concrete {@link AbstractFactory} that initializes the appropriate strategies and {@link DataStore} for
 * {@link input.VM1}
 */
public class ConcreteFactory1 extends AbstractFactory {

    private DataStore1 ds1 = new DataStore1();

    @Override
    public DataStore getDataStore() {
        return ds1;
    }

    @Override
    public ZeroCFStrategy getZeroCFStrategy() {
        return new ZeroCF1();
    }

    @Override
    public StorePriceStrategy getStorePriceStrategy() {
        return new StorePrice1();
    }

    @Override
    public DisposeDrinkStrategy getDisposeDrinkStrategy() {
        return new DisposeDrink();
    }

    @Override
    public IncreaseCFStrategy getIncreaseCFStrategy() {
        return new IncreaseCF1();
    }

    @Override
    public ReturnCoinsStrategy getReturnCoinsStrategy() {
        return new ReturnCoins1();
    }

    @Override
    public DisposeAdditiveStrategy getDisposeAdditiveStrategy() {
        return new DisposeAdditive();
    }
}

package Structural.DecoratorPattern;

// Decorator
abstract class StorageDecorator implements CloudStorage {
    protected CloudStorage tempStorage;

    public StorageDecorator(CloudStorage newStorage) {
        this.tempStorage = newStorage;
    }

    @Override
    public String getDescription() {
        return tempStorage.getDescription();
    }

    @Override
    public double getCost() {
        return tempStorage.getCost();
    }
}

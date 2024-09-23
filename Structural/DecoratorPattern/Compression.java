package Structural.DecoratorPattern;

// Concrete Decorator 2: Adding Compression
public class Compression extends StorageDecorator {
    public Compression(CloudStorage newStorage) {
        super(newStorage);
    }

    @Override
    public String getDescription() {
        return tempStorage.getDescription() + ", Compressed";
    }

    @Override
    public double getCost() {
        return tempStorage.getCost() + 1.50; // additional cost for compression
    }
}

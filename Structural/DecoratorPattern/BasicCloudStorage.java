package Structural.DecoratorPattern;
// Concrete Component
class BasicCloudStorage implements CloudStorage {
    @Override
    public String getDescription() {
        return "Basic Cloud Storage (10 GB)";
    }

    @Override
    public double getCost() {
        return 5.00; // base cost for storage
    }
}


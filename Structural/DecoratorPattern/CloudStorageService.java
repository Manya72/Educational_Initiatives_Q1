package Structural.DecoratorPattern;

public class CloudStorageService {
    public static void main(String[] args) {
        // Order basic cloud storage
        CloudStorage myStorage = new BasicCloudStorage();
        System.out.println(myStorage.getDescription() + " | Cost: $" + myStorage.getCost());

        // Add compression feature
        myStorage = new Compression(myStorage);
        System.out.println(myStorage.getDescription() + " | Cost: $" + myStorage.getCost());

       
    }
}

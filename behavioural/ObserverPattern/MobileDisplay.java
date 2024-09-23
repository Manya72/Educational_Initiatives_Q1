// Concrete Observer (Mobile Display)
public class MobileDisplay implements Observer {
    private String name;

    public MobileDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " received temperature update: " + temperature);
    }
}


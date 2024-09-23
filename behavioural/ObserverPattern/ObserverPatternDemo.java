// Client code
public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer mobileDisplay1 = new MobileDisplay("Mobile Display 1");
        Observer mobileDisplay2 = new MobileDisplay("Mobile Display 2");

        weatherStation.addObserver(mobileDisplay1);
        weatherStation.addObserver(mobileDisplay2);

        weatherStation.setTemperature(28.5f);  // Both displays will receive the update
    }
}

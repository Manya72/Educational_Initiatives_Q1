package behavioural.MementoPattern;

// Memento class to store the state of the text editor
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

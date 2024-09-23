package behavioural.MementoPattern;

// Originator class (TextEditor) that can save and restore its state
public class TextEditor {
    private String text;

    public void write(String newText) {
        text = newText;
        System.out.println("TextEditor current state: " + text);
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        text = memento.getState();
        System.out.println("Restored to: " + text);
    }
}

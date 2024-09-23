package behavioural.MementoPattern;

// Client code to demonstrate the Memento pattern
public class MementoPatternExample {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Writing text and saving state
        textEditor.write("First version of the text.");
        caretaker.saveState(textEditor);

        // Writing new text
        textEditor.write("Second version of the text.");

        // Undo operation (restore to first version)
        caretaker.undo(textEditor);

        // Writing another version and saving state
        textEditor.write("Third version of the text.");
        caretaker.saveState(textEditor);

        // Undo back to the first version
        caretaker.undo(textEditor);
    }
}

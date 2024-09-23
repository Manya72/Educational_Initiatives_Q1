package behavioural.MementoPattern;

import java.util.Stack;

// Caretaker class that manages the memento history (for undo functionality)
public class Caretaker {
    private Stack<Memento> history = new Stack<>();

    public void saveState(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor) {
        if (!history.isEmpty()) {
            Memento memento = history.pop();
            textEditor.restore(memento);
        } else {
            System.out.println("No states to undo.");
        }
    }
}

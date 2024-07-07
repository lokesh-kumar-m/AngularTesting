package Behavioural.momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<CanvasMemento> mementos;

    public History() {
        this.mementos = new ArrayList<>();
    }

    public void addMemento(CanvasMemento memento) {
        this.mementos.add(memento);
    }

    public CanvasMemento getMemento(int index) {
        return this.mementos.get(index);
    }
}

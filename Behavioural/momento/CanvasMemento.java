package Behavioural.momento;

import java.util.List;

public class CanvasMemento {
    private List<String> actions;

    public CanvasMemento(List<String> actions) {
        this.actions = actions;
    }

    public List<String> getSavedActivities() {
        return this.actions;
    }
}

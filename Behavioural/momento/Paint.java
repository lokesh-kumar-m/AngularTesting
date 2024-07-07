package Behavioural.momento;

import java.util.ArrayList;
import java.util.List;

public class Paint {
    private List<String> activities;

    public Paint(List<String> activities){
        this.activities=activities;
    }

    public void draw(String shape){
        this.activities.add(shape);
    }
    public void erase(String rub){
        this.activities.add(rub);
    }
    
    public List<String> getActivities() {
        return this.activities;
    }

    public CanvasMemento createMemento() {
        return new CanvasMemento(new ArrayList<>(this.activities));
    }

    public void restoreFromMemento(CanvasMemento memento) {
        this.activities = memento.getSavedActivities();
    }

    @Override
    public String toString() {
        return "Paint [activities=" + activities + "]";
    }
    
}

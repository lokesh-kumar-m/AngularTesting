package Behavioural.momento;

import java.util.ArrayList;

public class Control {
    public static void main(String[] args) {
        Paint paint=new Paint(new ArrayList<>());
        History history = new History();

        // Draw shapes and save states
        paint.draw("Circle");
        history.addMemento(paint.createMemento());

        paint.draw("Square");
        history.addMemento(paint.createMemento());

        paint.draw("Triangle");
        history.addMemento(paint.createMemento());

        // Print current state
        System.out.println("Current paint: " + paint.toString());

        // Restore to previous state
        paint.restoreFromMemento(history.getMemento(paint.getActivities().size()-2));
        System.out.println("After restoring to previous state: " + paint.toString());

        // Restore to initial state
        paint.restoreFromMemento(history.getMemento(0));
        System.out.println("After restoring to initial state: " + paint.toString());
    }
}

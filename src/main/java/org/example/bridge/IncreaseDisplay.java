package org.example.bridge;

public class IncreaseDisplay extends CountDisplay {
    private int step;

    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }

    public void increaseDisplay(int times) {
        for(int i = 0; i < times; i++) {
            multiDisplay(i * step);
        }
    }
}

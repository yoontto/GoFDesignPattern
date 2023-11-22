package org.example.bridge;

import java.util.Random;

public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        Random random = new Random();
        int r = random.nextInt();

        if (r > 0 && r < times) {
            open();

            for(int i = 0; i < r; i++) {
                display();
            }

            close();
        } else {
            display();
        }
    }
}

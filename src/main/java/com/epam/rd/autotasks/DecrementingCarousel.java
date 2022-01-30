package com.epam.rd.autotasks;

public class DecrementingCarousel extends CarouselRun {

    private int full = 0;
    private boolean runEd = false;

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public boolean addElement(int element) {
        if (full < capacity && !runEd && element > 0) {
            arr[full] = element;
            full++;
            return true;
        } else {
            return false;
        }
    }

    public CarouselRun run() {
        runEd = true;
        if (runEd)
            return this;
        else
            return null;
    }
}
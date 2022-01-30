package com.epam.rd.autotasks;

public class CarouselRun {

    public int[] arr;
    private int k = 0;
    private int i = 0;
    private boolean b = false;

    public CarouselRun(int[] arr) {
        this.arr = arr;
    }

    public CarouselRun() {
    }

    public int next() {
        if (isFinished() == false) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    k++;
                    i++;
                    continue;
                }
                if (k == arr.length - 1) {
                    b = true;
                    return -1;
                }
                return arr[i]--;
            }
        }
        return -1;
    }

    public boolean isFinished() {//когда больше нет элементов для уменьшения, возвращает true.
        // В противном случае возвращает false.
        if (next() == -1) {
            return true;
        } else {
            return false;
        }
    }
}

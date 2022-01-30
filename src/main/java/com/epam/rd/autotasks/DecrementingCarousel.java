package com.epam.rd.autotasks;

public class DecrementingCarousel extends CarouselRun {

        private boolean methodRunIsRun = false;
        int arrayLength;
        int[] array;

        public DecrementingCarousel(int capacity) {
            super();
            array = new int[capacity];
        }

        public boolean addElement(int element) {
            int[] array = new int[arrayLength];
            for (int i = 0; i < array.length; i++) {
                if (element <= 0) { //Если элемент отрицателен или равен нулю, не добавляет его.
                    return false;
                }
                if (array[i] == array.length - 1) { // Если контейнер заполнен, не добавляет элемент.
                    return false;
                }
                if (DecrementingCarousel.this.methodRunIsRun) {// Если метод run был вызван для создания CarouselRun, не добавляет элемент.
                    return false;
                } else {    // Если элемент добавлен успешно, возвращает true. В противном случае – false.
                    array[i] = element;
                    return true;
                }
            }
            return false;
        }

        public CarouselRun run() {     // создать объект CarouselRun с помощью метода
            if (this.methodRunIsRun == true) {
                new CarouselRun(null);
                return null;
            }
            return new CarouselRun(arr);
        }
    }

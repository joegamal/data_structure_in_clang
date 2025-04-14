package org.fromScratch;
 ///
 /// implementation of queue using array
 /// methods: push, pop, isempty, top

public class Queuei<T> {

    private int size = 10;
    private int count = 0;
    public int length = 0;

    Object[] arr = new Object[size];

    private int pointer = 0;

    public void push(T val) {

        if(count == size) {
            size += 5;

            Object[] narr = new Object[size];

            for(int i = 0; i < count; i++) {
                narr[i] = arr[i];
            }

            arr = narr;

        }

        arr[count++] = val;
        length++;
    }

     public Object pop() {
        count--;
        return arr[pointer++];
     }


     public Object top() {
         return arr[pointer++];
     }

     public boolean isempty() {
        return !(count > 0);
     }






}

package org.fromScratch;
///
/// this class implements the datastructure of stack from scratch
///
/// methods: add, pop, top, isempty
/// we will implement with array.


public class Stackk<T> {

    private int size = 10;
    private int count = 0;
    public int stackSize = 0;



    //@SuppressWarnings("unchecked")
    private Object[] arr =  new Object[size];

    public void add(Object val){
        if(count == size) {
            size += 5;

            //@SuppressWarnings("unchecked")
            Object[] narr = new Object[size];

            for(int i = 0; i < count; i++) {
                narr[i] = arr[i];
            }

            arr = narr;

        }

        arr[count++] = val;
        stackSize++;

    }

    public Object top() {
        return arr[count - 1];
    }

    public Object pop() {
        stackSize--;
        return arr[--count];
    }

    public boolean isempty() {
        return (count > 0);
    }

}

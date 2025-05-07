package com.frm;

public class arrayList<E> {
    private int size;
    private E[] array;
    private int count;

    @SuppressWarnings("unchecked")
    public arrayList(){
        array = (E[]) new Object[size];
        count = 0;
        size = 0;
    }


    @SuppressWarnings("unchecked")
    private void expand() {
        size += 5;
        E[] nArray = (E[]) new Object[size];

        for(int i = 0; i < array.length; i++) {
            nArray[i] = array[i];
        }
        array = nArray;
    }


    public void add(E val) {
        if(count == size) {
            expand();
        }

        array[count++] = val;
    }


    public E at(int index){
        try{
            return array[index];

        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }
        return null;
    }


    public void removeAt(int index) {
        try{
            array[--index] = null;
            shift();
        }catch(Exception exp){
            System.out.println(exp.getMessage());
        }
        count--;
    }


    private void shift(){
        int z = count;
        E[] narr = (E[]) new Object[--z];
        int temp = 0;
        for(int i = 0; i <= count; i++) {
            if(array[i] == null) {
                continue;
            }else {
                narr[temp] = array[i];
                temp++;
            }
        }
        array = narr;
    }


    public void remove(E element) {
        for(int i = 0; i < count; i++) {
            if(array[i] == element) array[i] = null;
        }
        shift();
        count--;
    }


    public void display() {
        for(E element : array) {
            System.out.println(element);
        }
    }


}
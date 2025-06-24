#include<stdio.h>
#include <stdlib.h>

int main() {

    printf("Hello world\n");

    int num = 5;

    int* pointer;

    pointer = &num;

    printf("address: %p  value: %d \n", pointer, *pointer);

    int size_of_array;

    scanf("%d", &size_of_array);

    int array[size_of_array];

    for(int i = 0; i < size_of_array; i++){
        array[i] = i;
    }

    for(int i = 0; i < size_of_array; i++){
        printf("%d ", array[i]);
    }
    printf("\n");
    
    return 0;
}
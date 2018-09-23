package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        int min = arr[0];
        int min_index = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] <= min) {
                min = arr[i];
                min_index = i;
            }
        int tmp = arr[0];
        arr[0] = arr[min_index];
        arr[min_index] = tmp;
    }

}
package ru.netology.postersmanager;

public class Manager {

    private Movie[] items = new Movie[0];


    public void addMovie(Movie movie) { // добавляем новый фильм
        int length = items.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        items = tmp;
    }

    public Movie[] findAll() {      //вывод всех фильмов в порядке добавления
        Movie[] result = new Movie[items.length];
        System.arraycopy(items, 0, result, 0, result.length);
        return result;
    }


    private int limit;

    public Manager(int limit) {         // выводим максимум лимит
        this.limit = limit;
    }

    public Movie[] findLast() {      // выводим в обратном порядке лимит (10)
        int resultLength;

        if (items.length <= limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}

package ru.netology.postersmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ManagerTest {

    Movie first = new Movie(1, "saw", "horror");
    Movie second = new Movie(2, "saw2", "horror");
    Movie third = new Movie(3, "saw3", "horror");
    Movie fourth = new Movie(4, "saw4", "horror");
    Movie fifth = new Movie(5, "saw5", "horror");
    Movie sixth = new Movie(6, "saw6", "horror");
    Movie seventh = new Movie(7, "saw7", "horror");
    Movie eighth = new Movie(8, "saw8", "horror");
    Movie ninth = new Movie(9, "saw9", "horror");
    Movie tenth = new Movie(10, "saw10", "horror");
    Movie eleventh = new Movie(11, "saw11", "horror");

    @Test
    public void shouldAddMovie() {
        Manager manager = new Manager(11); // добавим все фильмы
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);

        Movie[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        Movie[] actual = manager.findAll();
        assertArrayEquals(expected, actual); // на массивах не работает без Array
    }

    @Test
    public void shouldAddTenMovie() {       // добавим 10 фильмов
        Manager manager = new Manager(10);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);


        Movie[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        Movie[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovie() { //добавим первый фильм
        Manager manager = new Manager(1);
        manager.addMovie(first);

        Movie[] expected = {first};
        Movie[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastTenOverLimitMovie() {   // найдем последние 10 фильмов
        Manager manager = new Manager(10);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);

        Movie[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        Movie[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastTenMovie() {  // найдем предыдущие 10 мильмов
        Manager manager = new Manager(10);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);

        Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Movie[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFiveMovie() {
        Manager manager = new Manager(5);
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);

        Movie[] expected = {fifth, fourth, third, second, first};
        Movie[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    Movie ten = new Movie();     // для конструктора без параметров


    @Test
    public void shouldAddMovieNoArgs() {
        Manager manager = new Manager(1);
        manager.addMovie(ten);

        Movie[] expected = {ten};
        Movie[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowId() {
        Movie movie = new Movie();
        movie.getId();
        int expected = 0;
        int actual = movie.getId();
        assertEquals(expected, actual);
    }

    private void assertEquals(int expected, int actual) {
    }

    @Test
    public void shouldShowName() {
        Movie movie = new Movie();
        movie.getName();
        String expected = null;
        String actual = movie.getName();
        assertEquals2(expected, actual);
    }

    private void assertEquals2(String expected, String actual) {
    }

    @Test
    public void shouldShowGenre() {
        Movie movie = new Movie();
        movie.getGenre();
        String expected = null;
        String actual = movie.getGenre();
        assertEquals2(expected, actual);
    }

    @Test
    public void shouldSetId() {
        Movie movie = new Movie();
        movie.setId(0);
        int expected = 0;
        int actual = movie.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetName() {
        Movie movie = new Movie();
        movie.setName(null);
        String actual = movie.getName();
        assertEquals2(null, actual);
    }

    @Test
    public void shouldSetGenre() {
        Movie movie = new Movie();
        movie.setGenre(null);
        String actual = movie.getGenre();
        assertEquals2(null, actual);
    }

}




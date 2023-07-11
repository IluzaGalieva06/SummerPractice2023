package com.example.summerpractice

object FilmRepository {
    val list: List<Film> = listOf(
        Film(id = 1, name = "Little women", director = "Clare Niederpruem",url = "https://media.kg-portal.ru/movies/l/littlewomen/posters/littlewomen_12.jpg"),
        Film(id = 2, name = "Pride and prejudice", director = "Joe Wright",url = "https://www.1zoom.ru/big2/84/82625-2006.jpg"),
        Film(id = 3, name = "The Help", director = "Tate Taylor",url = "https://mobimg.b-cdn.net/v3/fetch/80/809e08b779aad451caef74c1a48434bf.jpeg?w=1470&r=0.5625"),
        Film(id = 4, name = "The Hating Game", director = "Peter Hutchings",url = "https://flxt.tmsimg.com/assets/p20963336_v_h8_ai.jpg"),
        Film(id = 5, name = "Enola Holmes", director = "Harry Bradbeer",url = "https://favim.com/pd/s11/orig/8/890/8903/89037/enola-holmes-mbb-millie-bobby-brown-Favim.com-8903768.jpg"),
    )

    fun getFilmById(id: Int): Film? {
        return list.find { it.id == id }
    }
}
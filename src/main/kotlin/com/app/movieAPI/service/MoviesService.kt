package com.app.movieAPI.service

import com.app.movieAPI.entity.Movie
import com.app.movieAPI.repository.MoviesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MoviesService(
    @Autowired
    private val moviesRepository: MoviesRepository) {

    fun createMovie(movie: Movie): Movie {
        return moviesRepository.save(movie)
    }

    fun updateMovie(movie: Movie): Movie {
        return moviesRepository.save(movie)
    }

    fun deleteMovie(id: String?) {
        if (id != null) {
            moviesRepository.deleteById(id.toInt())
        }
    }

    fun getAllMovies(): MutableList<Movie> {
        return moviesRepository.findAll()
    }

    fun getMovieById(id: String?): Movie? {
        return moviesRepository.findByIdOrNull(id?.toInt())
    }
}
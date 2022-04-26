package com.app.movieAPI.repository

import com.app.movieAPI.entity.Movie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MoviesRepository: JpaRepository<Movie, Int?> {
//    fun findMovieBy(title: String?): Movie
//    fun findMovieBy(title: String?, year: String?, producer: String?): Movie

}
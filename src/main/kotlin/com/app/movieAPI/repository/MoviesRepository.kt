package com.app.movieAPI.repository

import com.app.movieAPI.entity.Movie
import org.springframework.data.jpa.repository.JpaRepository

interface MoviesRepository: JpaRepository<Movie, Int> {

}
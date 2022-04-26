package com.app.movieAPI.exception

import com.app.movieAPI.entity.Movie
import com.app.movieAPI.request.CreateMovieRequest

fun CreateMovieRequest.toMovie(): Movie {
    return Movie(title, year, description, rating, producer)
}
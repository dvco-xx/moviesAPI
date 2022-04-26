package com.app.movieAPI.request

data class CreateMovieRequest(
    var name: String?,
    val title: String?,
    val year: String?,
    val description: String?,
    val rating: String?,
    val producer: String?
)
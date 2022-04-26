package com.app.movieAPI.response

import com.fasterxml.jackson.databind.BeanDescription

data class MoviesResponse(
    var title: String?,
    var year: String?,
    var description: String?,
    var rating: String?,
    var producer: String?,
)
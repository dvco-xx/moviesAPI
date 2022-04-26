package com.app.movieAPI.controller

import com.app.movieAPI.exception.toMovie
import com.app.movieAPI.exception.InvalidRequestException
import com.app.movieAPI.request.CreateMovieRequest
import com.app.movieAPI.response.BaseResponse
import com.app.movieAPI.response.ListResponse
import com.app.movieAPI.service.MoviesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.Errors
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@CrossOrigin(origins = ["*"], allowedHeaders = ["*"])
@RequestMapping("/api/v1/movies")
class MoviesController(
    @Autowired
    private val moviesService: MoviesService) {

    @PostMapping("/add")
    fun addMovie(@RequestBody @Valid createMovieRequest: CreateMovieRequest, errors: Errors): ResponseEntity<*> {
        if(errors.hasErrors()) throw InvalidRequestException(errors.allErrors.map { it.defaultMessage }.joinToString(","))
        moviesService.createMovie(createMovieRequest.toMovie())
        return ResponseEntity(BaseResponse("00", "success"), HttpStatus.OK)
    }

    @GetMapping("/all")
    fun allMovies(): ResponseEntity<*> {
        val moviesList = moviesService.getAllMovies()
        return ResponseEntity(ListResponse("00", "success", moviesList), HttpStatus.OK)
    }

}
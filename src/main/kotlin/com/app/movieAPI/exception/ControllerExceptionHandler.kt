package com.app.movieAPI.exception

import com.app.movieAPI.response.BaseResponse
import org.apache.http.conn.HttpHostConnectException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.HttpServerErrorException


@ControllerAdvice
class ControllerExceptionHandler {

    @ExceptionHandler(IllegalStateException::class)
    fun handleException(ex: IllegalStateException): ResponseEntity<*> {
        val response = BaseResponse("20", "${ex.message}")
        ex.printStackTrace()
        return ResponseEntity(response, HttpStatus.OK)
    }

    @ExceptionHandler(InvalidRequestException::class)
    fun handleRequestException(ex: InvalidRequestException): ResponseEntity<*> {
       val response = BaseResponse("22", "${ex.message}")
       return ResponseEntity(response, HttpStatus.OK)
    }

    @ExceptionHandler(Unauthorized::class)
    fun handleUnAuthorizedException(ex: Unauthorized): ResponseEntity<*> {
       val response = BaseResponse("27", "${ex.message}")
       return ResponseEntity(response, HttpStatus.OK)
    }


    @ExceptionHandler(AccessDeniedException::class)
    fun handleUnAuthorizedException(ex: AccessDeniedException): ResponseEntity<*> {
       val response = BaseResponse("27", "${ex.message}")
       return ResponseEntity(response, HttpStatus.OK)
    }



    @ExceptionHandler(HttpClientErrorException::class)
    fun handleClientException(ex: HttpClientErrorException): ResponseEntity<*> {
        val response = BaseResponse("20", "${ex.message}")
        ex.printStackTrace()
        return ResponseEntity(response, HttpStatus.OK)
    }

    @ExceptionHandler(HttpServerErrorException::class)
    fun handleServerException(ex: HttpServerErrorException): ResponseEntity<*> {
        val response = BaseResponse("20", "${ex.message}")
        ex.printStackTrace()
        return ResponseEntity(response, HttpStatus.OK)
    }

    @ExceptionHandler(NumberFormatException::class)
    fun handleNumberFormatException(ex: NumberFormatException): ResponseEntity<*> {
        val response = BaseResponse("20", "${ex.message}")
        ex.printStackTrace()
        return ResponseEntity(response, HttpStatus.OK)
    }

    @ExceptionHandler(HttpHostConnectException::class)
    fun handleHttpException(ex: HttpHostConnectException): ResponseEntity<*> {
        val response = BaseResponse("20", "${ex.message}")
        ex.printStackTrace()
        return ResponseEntity(response, HttpStatus.OK)
    }



    @ExceptionHandler(RuntimeException::class)
    fun handleRuntimeException(ex: RuntimeException): ResponseEntity<*> {
        val response = BaseResponse("20", "${ex.message}")
        ex.printStackTrace()
        return ResponseEntity(response, HttpStatus.OK)
    }





}
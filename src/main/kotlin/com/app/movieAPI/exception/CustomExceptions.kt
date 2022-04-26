package com.app.movieAPI.exception

data class InvalidRequestException(override val message: String?) : RuntimeException(message)
data class Unauthorized(override val message: String?) : RuntimeException(message)
data class BadRequestException(override val message:String): RuntimeException(message)
data class ItemNotFoundException(override val message:String): RuntimeException(message)
data class OtpMismatchedException(override val message:String): RuntimeException(message)
data class PasswordMismatchException(override val message:String): RuntimeException(message)
data class PersistenceException(override val message:String): RuntimeException(message)
data class ItemAlreadyExistException(override val message:String): RuntimeException(message)
data class DetailsParseException(override val message:String): RuntimeException(message)
data class BadArithmeticException(override val message:String): RuntimeException(message)
data class InvalidActionException(override val message:String): RuntimeException(message)
data class FailedToUpdateThirdPartyException(override val message:String): RuntimeException(message)



package com.app.movieAPI.response

data class BaseResponse(var ResponseCode : String?, var ResponseMessage : String?)
data class ListResponse(val responsecode : String?, val responsemessage : String?, val data: Any)

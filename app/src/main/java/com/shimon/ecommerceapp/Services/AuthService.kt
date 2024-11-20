package com.shimon.ecommerceapp.Services

import com.shimon.ecommerceapp.Data.Models.Login.RequestLogin
import com.shimon.ecommerceapp.Data.Models.Login.ResponseLogin
import com.shimon.ecommerceapp.Data.Models.Register.RequestRegister
import com.shimon.ecommerceapp.Data.Models.Register.ResponseRegister
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("auth/login")
   suspend fun login(@Body requestLogin: RequestLogin): Response<ResponseLogin>

   @POST("users")
   suspend fun register(@Body requestRegister: RequestRegister) : Response<ResponseRegister>

}
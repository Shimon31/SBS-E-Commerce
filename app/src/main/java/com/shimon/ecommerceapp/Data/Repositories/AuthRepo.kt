package com.shimon.ecommerceapp.Data.Repositories

import com.shimon.ecommerceapp.Data.Models.Login.RequestLogin
import com.shimon.ecommerceapp.Data.Models.Login.ResponseLogin
import com.shimon.ecommerceapp.Data.Models.Register.RequestRegister
import com.shimon.ecommerceapp.Data.Models.Register.ResponseRegister
import com.shimon.ecommerceapp.Services.AuthService
import retrofit2.Response
import javax.inject.Inject

class AuthRepo @Inject constructor(private val service: AuthService) {

   suspend fun login(requestLogin: RequestLogin) : Response<ResponseLogin>{


       return service.login(requestLogin)


    }

    suspend fun register(requestRegister: RequestRegister) : Response<ResponseRegister>{

        return service.register(requestRegister)

    }

}






package com.shimon.ecommerceapp.UI.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shimon.ecommerceapp.Data.Models.Login.RequestLogin
import com.shimon.ecommerceapp.Data.Models.Login.ResponseLogin
import com.shimon.ecommerceapp.Data.Models.Register.RequestRegister
import com.shimon.ecommerceapp.Data.Models.Register.ResponseRegister
import com.shimon.ecommerceapp.Data.Repositories.AuthRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(private val repo: AuthRepo) : ViewModel() {

    private var _response = MutableLiveData<Response<ResponseRegister>>()
    val registerResponse: LiveData<Response<ResponseRegister>> = _response

    fun register(requestRegister: RequestRegister) {

        viewModelScope.launch {
            _response.postValue(repo.register(requestRegister))

        }

    }


}
package com.shimon.ecommerceapp.UI.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shimon.ecommerceapp.Data.Models.Login.RequestLogin
import com.shimon.ecommerceapp.Data.Models.Login.ResponseLogin
import com.shimon.ecommerceapp.Data.Repositories.AuthRepo
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class loginViewModel @Inject constructor(private val repo: AuthRepo) : ViewModel() {

    private var _response = MutableLiveData<Response<ResponseLogin>>()
    val loginResponse: LiveData<Response<ResponseLogin>> = _response

    fun login(requestLogin: RequestLogin) {

        viewModelScope.launch {
            _response.postValue(repo.login(requestLogin))

        }

    }


}
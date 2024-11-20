package com.shimon.ecommerceapp.UI.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import com.shimon.ecommerceapp.Base.BaseFragment
import com.shimon.ecommerceapp.Data.Models.Login.RequestLogin
import com.shimon.ecommerceapp.R
import com.shimon.ecommerceapp.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {

    val viewModel: loginViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.loginResponse.observe(viewLifecycleOwner){

            if (it.isSuccessful){

                findNavController().navigate(R.id.action_loignFragment_to_homeFragment)

            }


        }

        binding.registerBtn.setOnClickListener {

            findNavController().navigate(R.id.action_loignFragment_to_registerFragment)

        }
        binding.loginBtn.setOnClickListener {

            val email = binding.emailET.text.toString()
            val password = binding.passwordET.text.toString()


            handleLogin("john@mail.com", "changeme")


        }

    }

    private fun handleLogin(email: String, password: String) {

        val requestLogin = RequestLogin(email = email, password = password)

        viewModel.login(requestLogin)

    }

}
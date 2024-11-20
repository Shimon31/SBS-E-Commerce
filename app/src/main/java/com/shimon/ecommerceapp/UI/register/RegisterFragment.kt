package com.shimon.ecommerceapp.UI.register

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.shimon.ecommerceapp.Base.BaseFragment
import com.shimon.ecommerceapp.Data.Models.Register.RequestRegister
import com.shimon.ecommerceapp.R
import com.shimon.ecommerceapp.databinding.FragmentRegisterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : BaseFragment<FragmentRegisterBinding>(FragmentRegisterBinding::inflate) {

    private val viewModel : RegisterViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel.registerResponse.observe(viewLifecycleOwner){

            findNavController().navigate(R.id.action_registerFragment_to_loignFragment)

        }


        binding.registerBtn.setOnClickListener {
            binding.apply {

                val userName = userNameET.text.toString()
                val email = emailET.text.toString()
                val password = passwordET.toString()
                val imageAvatar =
                    "https://media.licdn.com/dms/image/v2/D5603AQErtE23hVt_9g/profile-displayphoto-shrink_200_200/profile-displayphoto-shrink_200_200/0/1725974334692?e=2147483647&v=beta&t=wf3tC9QCVFXiThXP3zq9UQhQ4ColGEq05-wgnqbF0fg"

                val requestRegister = RequestRegister(
                    avatar = imageAvatar,
                    email = email,
                    name = userName,
                    password = password
                )

                viewModel.register(requestRegister)
            }



        }

    }

}
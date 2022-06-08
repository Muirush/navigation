package com.galoppingtech.navigation


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.galoppingtech.navigation.databinding.FragmentLoginBinding

class Login : Fragment(R.layout.fragment_login) {
 private var _binding : FragmentLoginBinding?= null
    private  val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentLoginBinding.bind(view)
        initViews()
    }

    private fun initViews() {
       binding.loginButton.setOnClickListener(){
           val name  = binding.logInUsername.text.toString().trim()
           val pwd  = binding.logInPassword .text.toString().trim()
           if (name == ""&& pwd==""){
               binding.apply {
                   logInUsername.error = "Name required"
                   logInPassword.error = "Password required"
               }

           }
           else{
               findNavController().navigate(R.id.home2)
           }
       }
    }


}

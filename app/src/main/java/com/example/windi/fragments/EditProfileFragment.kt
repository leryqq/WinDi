package com.example.windi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.windi.R
import com.example.windi.databinding.FragmentEditProfileBinding

class EditProfileFragment : Fragment() {

    private lateinit var binding: FragmentEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEditProfileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = EditProfileFragment()
    }
}
package com.geektech.hw7m3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.hw7m3.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private  lateinit var binding: FragmentSecondBinding
    private lateinit var navArgs: SecondFragmentArgs
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val item = arguments?.getSerializable(FirstFragment.CHARACTER) as Character
        arguments?.let {
            navArgs = SecondFragmentArgs.fromBundle(it)
        }
        val data = navArgs.characterDescription
        binding.apply {
            character.loadImage(data.image)
            description.text = data.desc
            name.text = data.name
        }
    }


    }
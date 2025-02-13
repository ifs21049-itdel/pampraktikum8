package com.ifs21049.pampraktikum8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ifs21049.pampraktikum8.databinding.FragmentMeetBinding

class MeetFragment : Fragment() {
    private lateinit var binding: FragmentMeetBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMeetBinding
            .inflate(inflater, container, false)
        return binding.root
    }
}

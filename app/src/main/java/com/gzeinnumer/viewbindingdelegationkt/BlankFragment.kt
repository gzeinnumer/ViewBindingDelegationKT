package com.gzeinnumer.viewbindingdelegationkt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.viewbinding.library.activity.viewBinding
import android.viewbinding.library.fragment.viewBinding
import com.gzeinnumer.viewbindingdelegationkt.databinding.ActivityMainBinding
import com.gzeinnumer.viewbindingdelegationkt.databinding.FragmentBlankBinding

class BlankFragment : Fragment(R.layout.fragment_blank) {

    private val binding: FragmentBlankBinding by viewBinding()

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_blank, container, false)
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvHello.text = "Hello Zein"
    }
}
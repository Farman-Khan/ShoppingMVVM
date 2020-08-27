package com.fkhan.shoppingmvvm.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fkhan.shoppingmvvm.R
import com.fkhan.shoppingmvvm.databinding.FragmentOrderBinding

class OrderFragment : Fragment() {
    private lateinit var orderBinding: FragmentOrderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        orderBinding = FragmentOrderBinding.inflate(layoutInflater, container, false)

        orderBinding.btnOrder.setOnClickListener {
            findNavController().navigate(R.id.action_orderFragment_to_shopFragment)
        }

        return orderBinding.root
    }

}
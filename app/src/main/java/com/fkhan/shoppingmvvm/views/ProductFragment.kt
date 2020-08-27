package com.fkhan.shoppingmvvm.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fkhan.shoppingmvvm.R
import com.fkhan.shoppingmvvm.databinding.FragmentProductBinding

class ProductFragment : Fragment() {
    private lateinit var productBinding: FragmentProductBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        productBinding = FragmentProductBinding.inflate(layoutInflater, container, false)

        //to test the navigation
        productBinding.btnProduct.setOnClickListener {
            findNavController().navigate(R.id.action_productFragment_to_cartFragment)
        }

        return productBinding.root
    }

}
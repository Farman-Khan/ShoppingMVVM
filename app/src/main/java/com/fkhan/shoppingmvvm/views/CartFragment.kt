package com.fkhan.shoppingmvvm.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fkhan.shoppingmvvm.R
import com.fkhan.shoppingmvvm.databinding.FragmentCartBinding

class CartFragment : Fragment() {
    private lateinit var cartBinding: FragmentCartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cartBinding = FragmentCartBinding.inflate(layoutInflater, container, false)

        cartBinding.btnCart.setOnClickListener {
            findNavController().navigate(R.id.action_cartFragment_to_orderFragment)
        }

        return cartBinding.root
    }
}
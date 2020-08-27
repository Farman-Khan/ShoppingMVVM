package com.fkhan.shoppingmvvm.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.fkhan.shoppingmvvm.R
import com.fkhan.shoppingmvvm.databinding.ActivityMainBinding
import com.fkhan.shoppingmvvm.databinding.FragmentShopBinding

class ShopFragment : Fragment() {
    private lateinit var shopBinding: FragmentShopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        shopBinding = FragmentShopBinding.inflate(layoutInflater, container, false)


        //to test th navigation
        shopBinding.btnShop.setOnClickListener {
            findNavController().navigate(R.id.action_shopFragment_to_productFragment)
        }

        return shopBinding.root
    }

}
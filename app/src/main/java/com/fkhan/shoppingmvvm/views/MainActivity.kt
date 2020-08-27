package com.fkhan.shoppingmvvm.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fkhan.shoppingmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

    }
}
package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //buttonを参照
        val firstbutton = findViewById<Button>(R.id.firstButton)
        //SamleFragmentをインスタンス化
        val sampleFragment = SampleFragmentActivity()
        //buttonをクリックしたときにreplaceFragmentメソッドを実行
        firstbutton.setOnClickListener{
            replaceFragment(sampleFragment)
        }
    }

    fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.commit()
    }
}
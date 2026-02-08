package org.freedu.listviewb7

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import org.freedu.listviewb7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var friendList: ArrayList<Friend>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        val adapter = FriendAdapter(this, friendList)
        binding.listView.adapter = adapter



    }

    private fun loadData() {

        friendList = arrayListOf(
            Friend("Aminul Islam Munna", "he is a very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "he is a very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "he is a very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "he is a very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "he is a very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "he is a very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "he is a very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "he is a very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "he is a very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "he is a very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "he is a very good boy", R.drawable.persontwo),
            Friend("Aminul Islam Munna", "he is a very good boy", R.drawable.persontwo),


            )
    }


}
package dev.jahidhasanco.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import dev.jahidhasanco.pulldownanimaterefresh.PullDownAnimateRefreshLayout
import dev.jahidhasanco.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.pullDownAnimateRefreshLayout.setOnRefreshListener(object :
            PullDownAnimateRefreshLayout.OnRefreshListener {
            override fun onRefresh() {
                binding.pullDownAnimateRefreshLayout.postDelayed({
                    binding.pullDownAnimateRefreshLayout.setRefreshing(false)
                }, 3000)
            }
        })


    }
}
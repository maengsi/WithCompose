package ms.prj.withcompose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ms.prj.withcompose.chap18.Chap18Activity
import ms.prj.withcompose.chap19.Chap19Activity
import ms.prj.withcompose.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListener()
    }
    private fun initListener() {
        binding.tvChapter18.setOnClickListener {
            val intent = Intent(this@MainActivity, Chap18Activity::class.java)
        }
        binding.tvChapter19.setOnClickListener {
            val intent = Intent(this@MainActivity, Chap19Activity::class.java)
        }

        startActivity(intent)
    }
}
package ms.prj.withcompose.chap18

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ms.prj.withcompose.databinding.ActivityChap18Binding

class Chap18Activity : AppCompatActivity(){

    private val bindiing by lazy {
        ActivityChap18Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}
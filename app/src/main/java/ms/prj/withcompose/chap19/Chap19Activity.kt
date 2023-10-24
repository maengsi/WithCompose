package ms.prj.withcompose.chap19

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ms.prj.withcompose.databinding.ActivityChap19Binding

class Chap19Activity : AppCompatActivity(){

    private val bindiing by lazy {
        ActivityChap19Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}

// 현재 슬라이더 위치를 상태로 저장
@Composable
fun DemoScreen() {
    var sliderPosition by remember { mutableListOf(20f) }
}

// DemoScreen이 전달한 상탯값을 이용하지만, 스스로 상탯값을 저장하진 않음 -> 비상태 컴포저블 함수
@Composable
fun DemoSlider(sliderPosition: Float, onPositionChange : (Float) -> Unit) {
    Slider(
        modifier = Modifier.padding(10.dp) ,
        valueRange = 20f..40f,
        value = sliderPosition,
        onValueChange = onPositionChange
    )
}
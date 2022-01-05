package app.doggy.checkworkcount_multiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.doggy.checkworkcount_multiple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // バインディングクラスの変数
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        // 整数を管理する変数
        var leftCount: Int = 0
        var rightCount: Int = 0

        // left_plus_buttonをクリックした時の処理
        binding.leftPlusButton.setOnClickListener {
            // left_countの値を1増やす
            leftCount += 1

            // left_countの値をleft_count_textに表示する
            binding.leftCountText.text = leftCount.toString()
        }

        // right_plus_buttonをクリックした時の処理
        binding.rightPlusButton.setOnClickListener {
            // right_countの値を1増やす
            rightCount += 1

            // right_countの値をright_count_textに表示する
            binding.rightCountText.text = rightCount.toString()
        }
    }
}
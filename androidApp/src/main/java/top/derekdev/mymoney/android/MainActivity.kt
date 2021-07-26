package top.derekdev.mymoney.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import top.derekdev.mymoney.Greeting
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.ProvideWindowInsets
import top.derekdev.mymoney.android.ui.MyMoneyApp
import top.derekdev.mymoney.android.ui.theme.MyMoneyTheme

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This app draws behind the system bars, so we want to handle fitting system windows
        // WindowCompat.setDecorFitsSystemWindows(window, false)
        /*
        setContentView(
            TextView(this).apply {
                text = "hi"
            }
        )
        */
        setContent {
            MyMoneyTheme {
                ProvideWindowInsets(consumeWindowInsets = true) {
                    MyMoneyApp()
                }
            }
        }
    }
}

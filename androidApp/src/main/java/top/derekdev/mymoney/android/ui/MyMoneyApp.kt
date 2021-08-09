package top.derekdev.mymoney.android.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import top.derekdev.mymoney.android.ui.home.Home
import top.derekdev.mymoney.android.ui.theme.MyMoneyTheme


/**
 * Created by Derek Zhu on 25/7/21.
 * Project: My_Money
 *
 */

@Preview
@Composable
fun MyMoneyApp() {
    MyMoneyTheme {
        Home()
    }
}

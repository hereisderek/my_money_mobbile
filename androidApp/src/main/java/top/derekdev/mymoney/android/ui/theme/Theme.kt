package top.derekdev.mymoney.android.ui.theme



import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable


/**
 * Created by Derek Zhu on 22/7/21.
 * Project: My_Money
 *
 */


@Composable
fun MyMoneyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = getMyMoneyColors(darkTheme),
        // typography = MaterialTheme.typography,
        shapes = MyMoneyShapes,
        content = content
    )
}

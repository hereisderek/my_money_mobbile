package top.derekdev.mymoney

import androidx.compose.ui.graphics.vector.ImageVector


/**
 * Created by Derek Zhu on 26/7/21.
 * Project: My_Money
 *
 */


data class NavigationItemRes(
    val label: String,
    val icon: ImageVector? = null,
    val iconDescription: String? = null
)


val NavigationItem.res: NavigationItemRes get() = when(this) {
    is NavigationItem.HomeNavigationItem -> NavigationItemRes(label, icon, iconDescription)
    else -> TODO("navigation label for $this has not been implemented")
}



private val NavigationItem.HomeNavigationItem.label get() = when(this) {
    NavigationItem.HomeNavigationItem.Budgets -> "Budgets"
    NavigationItem.HomeNavigationItem.Setting -> "Settings"
}

private val NavigationItem.HomeNavigationItem.icon: ImageVector? get() = when(this) {
    NavigationItem.HomeNavigationItem.Budgets -> null
    NavigationItem.HomeNavigationItem.Setting -> null
}


private val NavigationItem.HomeNavigationItem.iconDescription: String? get() = when(this) {
    NavigationItem.HomeNavigationItem.Budgets -> null
    NavigationItem.HomeNavigationItem.Setting -> null
}


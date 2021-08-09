package top.derekdev.mymoney


/**
 * Created by Derek Zhu on 26/7/21.
 * Project: My_Money
 *
 */



sealed class NavigationItem(val route: String, parent: NavigationItem? = null) {
    private val _children = ArrayList<NavigationItem>()
    val children: List<NavigationItem> get() = _children


    init {
        parent?._children?.add(this)
    }



    sealed class HomeNavigationItem(route: String, parent: NavigationItem? = RootNavigationItem) : NavigationItem(route, parent) {
        object Budgets : HomeNavigationItem("budgets")
        object Setting : HomeNavigationItem("setting")
    }

    companion object {
        object RootNavigationItem : NavigationItem("root")
    }
}

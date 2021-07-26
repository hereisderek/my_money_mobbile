package top.derekdev.mymoney


/**
 * Created by Derek Zhu on 26/7/21.
 * Project: My_Money
 *
 */

class AppNavigation {

}








expect val Navigation.label: String

sealed class Navigation(val route: String, parent: Navigation? = null) {
    private val _children = ArrayList<Navigation>()
    val children: List<Navigation> get() = _children


    init {
        parent?._children?.add(this)
    }



    sealed class HomeNavigation(route: String, parent: Navigation? = RootNavigation) : Navigation(route, parent) {
        object Budgets : HomeNavigation("budgets")
        object Setting : HomeNavigation("setting")

    }

    companion object {
        object RootNavigation : Navigation("root")
    }
}

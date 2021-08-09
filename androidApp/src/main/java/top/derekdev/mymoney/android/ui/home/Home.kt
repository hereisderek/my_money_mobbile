package top.derekdev.mymoney.android.ui.home

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import top.derekdev.mymoney.NavigationItem
import top.derekdev.mymoney.NavigationItem.Companion.RootNavigationItem
import top.derekdev.mymoney.res


/**
 * Created by Derek Zhu on 25/7/21.
 * Project: My_Money
 *
 */

@Composable
fun Home() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomBar(RootNavigationItem.children, navController = navController)
        },
        topBar = {
            TopAppBar(title = {Text(text = "title")}, )
        }
    ) {
        Text(text = "")
    }
}


@Preview
@Composable
fun TextTabs() {
    var tabIndex by remember { mutableStateOf(0) }
    val tabData = listOf("MUSIC", "MARKET", "FILMS", "BOOKS")

    TabRow(selectedTabIndex = tabIndex) {
        tabData.forEachIndexed { index, text ->
            Tab(selected = tabIndex == index, onClick = {
                tabIndex = index
            }, text = {
                Text(text = text, maxLines = 1)
            })
        }
    }
}


@Preview
@Composable
fun BottomBar(
    items: List<NavigationItem> = RootNavigationItem.children,
    navController: NavHostController = rememberNavController()
) {
    BottomNavigation {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        items.forEach { screen ->
            BottomNavigationItem(
                label = {
                    Text(text = screen.res.label)
                },
                icon = {
                    screen.res.run {
                        if (icon != null) Icon(icon, iconDescription)
                    }

                },
                selected = currentDestination?.hierarchy?.any{
                    it.route == screen.route
                } ?: false,
                onClick = {
                    navController.navigate(screen.route) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        // Avoid multiple copies of the same destination when
                        // reselecting the same item
                        launchSingleTop = true
                        // Restore state when reselecting a previously selected item
                        restoreState = true
                    }
                }
            )
        }
    }
}

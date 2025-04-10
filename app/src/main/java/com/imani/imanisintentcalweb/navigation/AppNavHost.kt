package com.imani.imanisintentcalweb.navigation

import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.imani.imanisintentcalweb.ui.theme.screens.calc.Calc_Screen
import com.imani.imanisintentcalweb.ui.theme.screens.home.Home_Screen
import com.imani.imanisintentcalweb.ui.theme.screens.intent.Intent_Screen
import com.imani.imanisintentcalweb.ui.theme.screens.web.Web_Screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination:String= ROUTE_HOME) {
    NavHost(navController=navController,
        modifier=Modifier,
        startDestination = startDestination ){
        composable(ROUTE_HOME){
            Home_Screen(navController)
        }
        composable(ROUTE_CALC){
            Calc_Screen(navController)
        }
        composable(ROUTE_INTENT){
            Intent_Screen(navController)
        }
        composable(ROUTE_WEB){
            Web_Screen(navController)
        }
    }

}
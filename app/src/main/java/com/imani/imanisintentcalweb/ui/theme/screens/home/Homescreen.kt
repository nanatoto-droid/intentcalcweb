package com.imani.imanisintentcalweb.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.imani.imanisintentcalweb.navigation.ROUTE_CALC
import com.imani.imanisintentcalweb.navigation.ROUTE_HOME
import com.imani.imanisintentcalweb.navigation.ROUTE_INTENT
import com.imani.imanisintentcalweb.navigation.ROUTE_WEB

@Composable
fun Home_Screen(navController: NavHostController) {
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxSize()){
        Text(text = "Home screen",
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            color= Color.Black
        )
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = { navController.navigate(ROUTE_CALC) },
            modifier = Modifier.width(300.dp)) {
            Text(text="Calculator",
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                fontStyle = FontStyle.Italic,
                color = Color.Cyan
            )
        }
        Spacer(modifier = Modifier.height(200.dp))
        Button(onClick = {navController.navigate(ROUTE_INTENT) },
            modifier = Modifier.width(300.dp)) {
            Text(text="Intent",
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                fontStyle = FontStyle.Italic,
                color = Color.Cyan
            )
        }
        Spacer(modifier = Modifier.height(200.dp))
        Button(onClick = { navController.navigate(ROUTE_WEB)},
            modifier = Modifier.width(300.dp)) {
            Text(text="Web",
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                fontStyle = FontStyle.Italic,
                color = Color.Cyan
            )
        }


    }

}

@Preview
@Composable
private fun Homepreview() {
    Home_Screen(rememberNavController())

}
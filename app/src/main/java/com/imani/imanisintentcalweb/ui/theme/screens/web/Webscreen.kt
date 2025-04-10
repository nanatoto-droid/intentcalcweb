package com.imani.imanisintentcalweb.ui.theme.screens.web

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Composable
fun Web_Screen(navController: NavHostController) {
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)){
        Text(text = "Web Screen",
            color = Color.Black,
            fontFamily = FontFamily.Monospace,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic
        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = { TODO() },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(_root_ide_package_.androidx.compose.ui.graphics.Color.Gray),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Google",
                fontSize = 30.sp
            )

        }
    }


}

@Preview
@Composable
private fun Web_Preview() {
    Web_Screen(rememberNavController())

}
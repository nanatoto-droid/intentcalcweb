package com.imani.imanisintentcalweb.ui.theme.screens.intent

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
fun Intent_Screen(navController: NavHostController) {
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color =Color.LightGray)){
        Text(text = "Intent Screen",
            color = Color.Black,
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace,
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
                text = "Call",
                fontSize = 30.sp
            )

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = { TODO() },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(_root_ide_package_.androidx.compose.ui.graphics.Color.Gray),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "SMS",
                fontSize = 30.sp
            )

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = { TODO() },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(_root_ide_package_.androidx.compose.ui.graphics.Color.Gray),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Share",
                fontSize = 30.sp
            )

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = { TODO() },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(_root_ide_package_.androidx.compose.ui.graphics.Color.Gray),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Dial",
                fontSize = 30.sp
            )

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = { TODO() },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(_root_ide_package_.androidx.compose.ui.graphics.Color.Gray),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Camera",
                fontSize = 30.sp
            )

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = { TODO() },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(_root_ide_package_.androidx.compose.ui.graphics.Color.Gray),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "Email",
                fontSize = 30.sp
            )

        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = { TODO() },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(_root_ide_package_.androidx.compose.ui.graphics.Color.Gray),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "STK",
                fontSize = 30.sp
            )

        }




    }

}

@Preview
@Composable
private fun Intent_preview() {
    Intent_Screen(rememberNavController())

}
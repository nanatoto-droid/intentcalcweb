package com.imani.imanisintentcalweb.ui.theme.screens.calc


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Calc_Screen(navController: NavHostController) {
    var firstnum by remember { mutableStateOf(TextFieldValue("")) }
    var secondnum by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color.LightGray)
    ) {


        Text(
            text = "Answer",
            color = Color.Red,
            fontFamily = FontFamily.Serif,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic
        )
        OutlinedTextField(
            value = firstnum,
            onValueChange = { firstnum = it },
            label = {
                Text(
                    text = "Enter first No.",
                    fontSize = 30.sp,
                    color = Color.Blue
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)


        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = secondnum,
            onValueChange = {secondnum = it },
            label = {
                Text(
                    text = "Enter second No.",
                    fontSize = 30.sp,
                    color = Color.Blue
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)


        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = {
                val myfirstnum = firstnum.text.trim()
                val mysecondnum = secondnum.text.trim()
                if (myfirstnum.isEmpty() || mysecondnum.isEmpty()) {
                    answer = "Please fill all details"
                } else {
                    val myanswer = myfirstnum.toDouble() + mysecondnum.toDouble()
                    answer = myanswer.toString()

                }
            },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(_root_ide_package_.androidx.compose.ui.graphics.Color.Gray),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "+",
                fontSize = 30.sp
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = {
                val myfirstnum = firstnum.text.trim()
                val mysecondnum = secondnum.text.trim()
                if (myfirstnum.isEmpty() || mysecondnum.isEmpty()) {
                    answer = "Please fill all details"
                } else {
                    val myanswer = myfirstnum.toDouble() - mysecondnum.toDouble()
                    answer = myanswer.toString()

                }
            },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(_root_ide_package_.androidx.compose.ui.graphics.Color.Gray),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "-",
                fontSize = 30.sp
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = {
                val myfirstnum = firstnum.text.trim()
                val mysecondnum = secondnum.text.trim()
                if (myfirstnum.isEmpty() || mysecondnum.isEmpty()) {
                    answer = "Please fill all details"
                } else {
                    val myanswer = myfirstnum.toDouble() * mysecondnum.toDouble()
                    answer = myanswer.toString()

                }
            },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(_root_ide_package_.androidx.compose.ui.graphics.Color.Gray),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "*",
                fontSize = 30.sp
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = {
                val myfirstnum = firstnum.text.trim()
                val mysecondnum = secondnum.text.trim()
                if (myfirstnum.isEmpty() || mysecondnum.isEmpty()) {
                    answer = "Please fill all details"
                } else {
                    val myanswer = myfirstnum.toDouble() / mysecondnum.toDouble()
                    answer = myanswer.toString()

                }
            },
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(_root_ide_package_.androidx.compose.ui.graphics.Color.Gray),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(
                text = "/",
                fontSize = 30.sp
            )
        }

    }
}


@Preview
@Composable
private fun Calc_previem() {
    Calc_Screen(rememberNavController())
    
}
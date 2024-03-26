package com.example.navigation



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenC() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Screen C ", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick =
        {


        }
        ) {
            Text(text = "Go to Screen B", fontSize = 30.sp)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick =
        {



        }
        ) {
            Text(text = "Go to Screen A", fontSize = 30.sp)
        }

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScreenfC() {
//    ScreenC()
}
package com.said.math_game.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.said.math_game.R
import com.said.math_game.navigation.Screens
import com.said.math_game.ui.theme.Math_gameTheme
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    LaunchedEffect(Unit){
        delay(3000)
        navController.navigate(Screens.Home.route)
    }
    Math_gameTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                fontSize = 22.sp,
                text = "Math Game")
            Image(
                modifier = Modifier.size(250.dp),
                painter = painterResource(id = R.drawable.img),
                contentDescription ="splash",
            )
        }

    }
}
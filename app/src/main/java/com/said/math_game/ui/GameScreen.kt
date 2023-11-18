package com.said.math_game.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.said.math_game.R
import kotlinx.coroutines.delay

@Preview
@Composable
fun showGame() {
    GameScreen(navController = rememberNavController())
}

@Composable
fun GameScreen(navController: NavHostController) {
    val score = remember { mutableStateOf(0) }
    val time = remember { mutableStateOf(60) }
    Column {
        Row {
            Image(
                modifier = Modifier.size(60.dp),
                painter = painterResource(id = R.drawable.back_icon),
                contentDescription = "orqaga" )
            LaunchedEffect(Unit) {
                while (time.value > 0) {
                    delay(1000)
                    time.value--
                }
            }

        }

    }
}

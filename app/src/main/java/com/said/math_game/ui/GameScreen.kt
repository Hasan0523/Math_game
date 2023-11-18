package com.said.math_game.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun showGame() {
    GameScreen(navController = rememberNavController())
}

@Composable
fun GameScreen(navController: NavHostController) {
    Column {
        Row {

        }

    }
}

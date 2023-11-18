package com.said.math_game

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import com.said.math_game.navigation.NavGraph
import com.said.math_game.ui.theme.Math_gameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Math_gameTheme {
                Surface {
                    val navController = rememberNavController()
                    NavGraph(navController = navController)

                }
            }
        }
    }
}
package com.said.math_game.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.said.math_game.R
import com.said.math_game.model.Savol
import kotlinx.coroutines.delay

@Preview
@Composable
fun showGame() {
    GameScreen(navController = rememberNavController())
}

val savol = Savol(2, 3, 6, "*")

@Composable
fun GameScreen(navController: NavHostController) {
    val score = remember { mutableStateOf(0) }
    val time = remember { mutableStateOf(60) }
    val savol = remember {
        mutableStateOf(savol)
    }

    LaunchedEffect(Unit) {
        while (time.value > 0) {
            kotlinx.coroutines.delay(1000)
            time.value--
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.blue_back)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(
                onClick = {}
            ) {
                Icon(Icons.Rounded.Close, contentDescription = "")
            }
            Text(
                text = "Math game",
                modifier = Modifier
                    .background(Color.Blue, shape = RoundedCornerShape(18.dp))
                    .padding(12.dp),
                fontSize = 22.sp,
                color = Color.White
            )
            Text(
                text = time.value.toString(),
                modifier = Modifier
                    .background(Color.Blue, shape = RoundedCornerShape(18.dp))
                    .padding(12.dp),
                fontSize = 22.sp,
                color = Color.White
            )
        }
        Row(
            Modifier
                .background(color = Color.Blue, shape = RoundedCornerShape(24.dp))
                .padding(8.dp), verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = score.value.toString(),
                modifier = Modifier
                    .background(Color.Green, shape = RoundedCornerShape(60.dp))
                    .padding(12.dp),
                fontSize = 18.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = savol.value.var1.toString(), color = Color.White, fontSize = 22.sp)
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                painterResource(id = R.drawable.check_box_icon),
                contentDescription = "",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = savol.value.var2.toString(), color = Color.White, fontSize = 22.sp)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "=", color = Color.White, fontSize = 22.sp)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = savol.value.natija.toString(), color = Color.White, fontSize = 22.sp)

        }




        Row() {
            Button(
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white)),
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                onClick = { }) {
                Image(
                    painter = painterResource(id = R.drawable.minus_img),
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentDescription = ""
                )
            }

            Button(
                 modifier = Modifier.fillMaxWidth()
                     .weight(1f)
                     .padding(10.dp),
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white)),
                onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.plus_img),
                    contentDescription = ""
                )
            }
        }






        Row() {
            Button( modifier = Modifier.fillMaxWidth()
                .weight(1f),

                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white)),
                onClick = { /*TODO*/ }) {
                Image(painter = painterResource(id = R.drawable.boluv_img), contentDescription = "")
            }


            Button( modifier = Modifier.fillMaxWidth()
                .weight(1f),


                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.white)),
                onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.kopaytiruv_img),
                    contentDescription = ""
                )
            }
        }
    }
}

package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Cherrytomato(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFDECE2)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.cherrytomato),
                contentDescription = "Illustration of Ground Planting",
                modifier = Modifier.size(350.dp),
                contentScale = ContentScale.Fit
            )

            Text(
                text = "Cherry Tomato \n (Solanum lycopersicum var. cerasiforme)",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFFEF6C39),
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = " Cherry tomatoes are small, round, and juicy fruits, " +
                        "typically ranging from 1-2 cm in diameter. They are " +
                        "prized for their sweetness and are often used in salads," +
                        " snacks, or as garnishes. This indeterminate variety " +
                        "continues to produce fruit throughout the growing season." +
                        " Cherry tomatoes come in various colors, such as red," +
                        " yellow, and orange, and require staking or caging for" +
                        " support due to their vigorous vining growth. They " +
                        "thrive in containers or garden beds and are easy to " +
                        "grow, even in hot climates like the Philippines.",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Center,
                lineHeight = 30.sp
            )

            // Adding a Spacer for better separation
            Spacer(modifier = Modifier.height(20.dp))

        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewCherrytomato() {
    Cherrytomato(navController = rememberNavController())
}

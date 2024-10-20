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
fun Riogrande(navController: NavHostController) {
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
                painter = painterResource(id = R.drawable.riogrande),
                contentDescription = "Illustration of Ground Planting",
                modifier = Modifier.size(350.dp),
                contentScale = ContentScale.Fit
            )

            Text(
                text = "Rio Grande Tomato\n" +
                        " (Solanum lycopersicum)",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFFEF6C39),
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = " Rio Grande tomatoes are plum-shaped with a firmer texture " +
                        "than other varieties. They are slightly larger than " +
                        "Roma tomatoes, with a balanced sweet-acidic flavor. This" +
                        " semi-determinate variety produces fruit consistently over " +
                        "time, making it ideal for fresh use or processing into" +
                        " sauces and pastes. The plant is heat-tolerant and " +
                        "resistant to common tomato diseases, making it suitable " +
                        "for tropical climates like the Philippines.",
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
fun PreviewRiogrande() {
    Riogrande(navController = rememberNavController())
}

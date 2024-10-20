package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
fun Phytophora(navController: NavHostController) {
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
                painter = painterResource(id = R.drawable.phytophthora),
                contentDescription = "Illustration of Ground Planting",
                modifier = Modifier.size(350.dp),
                contentScale = ContentScale.Fit
            )

            Text(
                text = "Late Blight\n" +
                        "(Phytophthora infestans)",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFFEF6C39),
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Center,

            )

            // Adding a Spacer for better separation
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Caused by the water mold Phytophthora" +
                        " infestans, late blight affects tomatoes" +
                        " and potatoes. It begins with dark, water-soaked" +
                        " spots on leaves, which rapidly enlarge and become" +
                        "greasy, leading to the collapse of foliage. Stems " +
                        "can develop blackened areas, and fruits may show " +
                        "brown, firm patches. The disease spreads rapidly in" +
                        " humid, cool, and wet environments, often causing " +
                        "entire crop loss if not controlled.",

                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Center,
                lineHeight = 30.sp
            )

        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewPhytophora() {
    Phytophora(navController = rememberNavController())
}

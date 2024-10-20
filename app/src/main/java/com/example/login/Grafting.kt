package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Grafting(navController: NavHostController) {
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
            Text(
                text = "Grafting",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFFEF6C39),
                fontFamily = FontFamily.Serif
            )

            Image(
                painter = painterResource(id = R.drawable.grafting),
                contentDescription = "Illustration of Ground Planting",
                modifier = Modifier.size(350.dp),
                contentScale = ContentScale.Fit
            )

            // Adding a Spacer for better separation
            Spacer(modifier = Modifier.height(20.dp))

            GraftingStepSection(stepNumber = 1, stepTitle = "Select a Sunny Location", stepDescription = "Tomatoes need 6-8 hours of direct sunlight. Choose well-drained soil.")
            GraftingStepSection(stepNumber = 2, stepTitle = "Prepare the Soil", stepDescription = "Loosen the soil to at least 12 inches deep. Amend with compost or well-rotted organic matter.")
        }
    }
}

@Composable
fun GraftingStepSection(stepNumber: Int, stepTitle: String, stepDescription: String) {
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Step $stepNumber: ",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFFEF6C39),
            fontFamily = FontFamily.Serif
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = stepTitle,
            fontSize = 23.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            fontFamily = FontFamily.Serif
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = stepDescription,
            fontSize = 17.sp,
            fontWeight = FontWeight.Thin,
            color = Color.Black,
            fontFamily = FontFamily.Serif
        )

        Spacer(modifier = Modifier.height(15.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGrafting() {
    Grafting(navController = rememberNavController())
}

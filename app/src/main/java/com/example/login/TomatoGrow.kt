package com.example.login // Ensure this matches your package name

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun TomatoGrowScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFDECE2)), // Light background color
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 40.dp)
        ) {
            // Top Logo and Title
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tomato_logo), // Replace with your resource
                    contentDescription = "Tomato Logo",
                    modifier = Modifier
                        .size(350.dp)
                        .padding(bottom = 8.dp),
                    contentScale = ContentScale.Fit
                )
            }

            // Buttons in the middle
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = {
                        navController.navigate("growTomato") // Navigate to GrowTomato screen
                    },
                    colors = ButtonDefaults.buttonColors(Color(0xFFEF6C39)),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .padding(vertical = 8.dp)
                ) {
                    Text(text = "Grow Tomato", color = Color.White, fontSize = 18.sp)
                }

                Button(
                    onClick = {
                        navController.navigate("diseasesAndPests")
                    },
                    colors = ButtonDefaults.buttonColors(Color(0xFFEF6C39)),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .padding(vertical = 8.dp)
                ) {
                    Text(text = "Pest, Disease and Fertilization", color = Color.White, fontSize = 16.sp)
                }

                Button(
                    onClick = {
                        navController.navigate("variety")
                    },
                    colors = ButtonDefaults.buttonColors(Color(0xFFEF6C39)),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .padding(vertical = 8.dp)
                ) {
                    Text(text = "Variety of Tomatoes", color = Color.White, fontSize = 18.sp)
                }
            }

            Button(
                onClick = {
                    navController.navigate("uploadimage")
                },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors( Color.Transparent),
                modifier = Modifier
                    .size(150.dp)
                    .padding(2.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.camera), // Use a placeholder camera image from your drawable resources
                    contentDescription = "Camera Icon",
                    modifier = Modifier.size(150.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTomatoGrowScreen() {
    // Pass a dummy NavHostController for previewing
    TomatoGrowScreen(navController = rememberNavController())
}

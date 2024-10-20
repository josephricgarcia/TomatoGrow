package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Variety(navController: NavHostController) {
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
                text = "Variety of Tomatoes",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFFEF6C39),
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.roma),
                        contentDescription = "Illustration of Ground Planting",
                        modifier = Modifier
                            .size(150.dp)
                            .clickable {
                                navController.navigate("Roma")
                            },
                        contentScale = ContentScale.Fit
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = "Roma",
                        fontFamily = FontFamily.Serif,
                        fontSize = 20.sp, // Changed from dp to sp
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFEF6C39),
                    )
                }

                // Adding a Spacer for better separation
                Spacer(modifier = Modifier.height(30.dp))


                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Rio Grande",
                        fontFamily = FontFamily.Serif,
                        fontSize = 20.sp, // Changed from dp to sp
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFEF6C39),
                    )

                    Spacer(modifier = Modifier.width(20.dp))


                    Image(
                        painter = painterResource(id = R.drawable.riogrande),
                        contentDescription = "Illustration of Ground Planting",
                        modifier = Modifier
                            .size(150.dp)
                            .clickable {
                                navController.navigate("Riogrande")
                            },
                        contentScale = ContentScale.Fit
                    )
                }

                // Adding a Spacer for better separation
                Spacer(modifier = Modifier.height(20.dp))



                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cherrytomato),
                        contentDescription = "Illustration of Ground Planting",
                        modifier = Modifier
                            .size(150.dp)
                            .clickable {
                                navController.navigate("Cherrytomato")
                            },
                        contentScale = ContentScale.Fit
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(
                        text = "Cherry Tomato",
                        fontFamily = FontFamily.Serif,
                        fontSize = 20.sp, // Changed from dp to sp
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFEF6C39),
                    )
                }

                // Adding a Spacer for better separation
                Spacer(modifier = Modifier.height(30.dp))


            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewVariety() {
    Variety(navController = rememberNavController())
}

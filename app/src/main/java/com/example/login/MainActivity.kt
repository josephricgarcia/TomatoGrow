package com.example.login // Ensure this matches your package name


import Evaluation
import GrowTomato
import Uploadimage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login.ui.GrowTomatoScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Set up the navigation controller
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "main") {
                composable("main") { MainScreen(navController) }
                composable("tomatoGrow") { TomatoGrowScreen(navController) } // Route to TomatoGrowScreen
                composable("growTomato"){ GrowTomato(navController) }
                composable("groundPlanting") { GroundPlanting(navController) }
                composable("hydroponics") { Hydroponics(navController) }
                composable("grafting") { Grafting(navController) }
                composable("diseasesAndPests") { DiseaseAndPest(navController) }
                composable("diseasesLogo"){Diseases(navController)}
                composable("altenaria"){Altenaria(navController)}
                composable("phytophora"){Phytophora(navController)}
                composable("septoria"){Septoria(navController)}
                composable("pests"){Pests(navController)}

                composable("manduca"){Manduca(navController)}
                composable("aphids"){Aphids(navController)}
                composable("whiteflies"){Whiteflies(navController)}

                composable("variety"){Variety(navController)}

                composable("roma"){Roma(navController)}
                composable("riogrande"){Riogrande(navController)}
                composable("cherrytomato"){Cherrytomato(navController)}


                composable("uploadimage"){Uploadimage(navController)}
                composable("evaluation"){Evaluation(navController)}

            }
        }
    }
}

@Composable
fun MainScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFDECE2)), // Light background color matching the image
        contentAlignment = Alignment.Center
    ) {
        // Centered Logo
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 80.dp) // Add padding to move it slightly up
        ) {
            Image(
                painter = painterResource(id = R.drawable.tomato_logo), // Ensure this resource exists
                contentDescription = "Tomato Logo",
                modifier = Modifier
                    .size(350.dp)
                    .padding(bottom = 16.dp),
                contentScale = ContentScale.Fit
            )
        }

        // Button at the bottom
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    navController.navigate("tomatoGrow") // Navigate to TomatoGrowScreen
                },
                colors = ButtonDefaults.buttonColors(Color(0xFFEF6C39)), // Orange color
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .width(200.dp)
                    .height(60.dp)
            ) {
                Text(text = "Get Started", color = Color.White, fontSize = 20.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    MainScreen(navController = rememberNavController())
}

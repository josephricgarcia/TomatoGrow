package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun DiseaseAndPest(navController: NavHostController) {
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
                painter = painterResource(id = R.drawable.diseaseslogo), // Ensure this resource exists
                contentDescription = "Diseases Image",
                modifier = Modifier
                    .size(350.dp)
                    .clickable {
                        navController.navigate("diseasesLogo")
                    },
                contentScale = ContentScale.Fit
            )

            Image(
                painter = painterResource(id = R.drawable.pests), // Ensure this resource exists
                contentDescription = "Pests Image",
                modifier = Modifier
                    .size(350.dp)
                    .padding(bottom = 16.dp)
                    .clickable {
                        navController.navigate("pests")
                    },
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDiseaseAndPest() {
    DiseaseAndPest(navController = rememberNavController())
}

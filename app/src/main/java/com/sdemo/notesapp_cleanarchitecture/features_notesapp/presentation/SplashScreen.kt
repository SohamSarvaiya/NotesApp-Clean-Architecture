package com.sdemo.notesapp_cleanarchitecture.features_notesapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sdemo.notesapp_cleanarchitecture.R
import com.sdemo.notesapp_cleanarchitecture.features_notesapp.presentation.util.Screen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){
    Scaffold(
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = colorResource(id = R.color.black))
                    .padding(paddingValues),

                contentAlignment = Alignment.Center

            ){
                Image(
                    painter = painterResource(id = R.drawable.notesapp_logo),
                    contentDescription = "logo Image",
                    modifier = Modifier
                        .height(290.dp)
                        .width(290.dp)
                        .align(Alignment.Center),
                    contentScale = ContentScale.FillBounds
                )


                // Trigger navigation after a delay (2 seconds)
                LaunchedEffect(Unit) {
                    delay(3000)
                    navController.navigate(Screen.NotesScreen.route){
                        popUpTo(Screen.SplashScreen.route) {
                            inclusive = true
                        }
                    }
                }
            }

        }
    )

}
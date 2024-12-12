package com.sdemo.notesapp_cleanarchitecture.features_notesapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.sdemo.notesapp_cleanarchitecture.R
import com.sdemo.notesapp_cleanarchitecture.features_notesapp.presentation.add_edit_note.AddEditNoteScreen
import com.sdemo.notesapp_cleanarchitecture.features_notesapp.presentation.notes.NotesScreen
import com.sdemo.notesapp_cleanarchitecture.features_notesapp.presentation.util.Screen
import com.sdemo.notesapp_cleanarchitecture.ui.theme.NotesAppCleanArchitectureTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NotesAppCleanArchitectureTheme {
                Scaffold(
                    content = { paddingValues ->
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(color = colorResource(id = R.color.black))
                                .padding(paddingValues)


                        ) {
                            Surface() {
                                val navController = rememberNavController()
                                NavHost(
                                    navController = navController,
                                    startDestination = Screen.SplashScreen.route
                                ) {
                                    composable(route = Screen.SplashScreen.route) {
                                        SplashScreen(navController = navController)
                                    }

                                    composable(route = Screen.NotesScreen.route) {
                                        NotesScreen(navController = navController)
                                    }
                                    composable(
                                        route = Screen.AddEditNoteScreen.route +
                                                "?noteId={noteId}&noteColor={noteColor}",
                                        arguments = listOf(
                                            navArgument(
                                                name = "noteId"
                                            ) {
                                                type = NavType.IntType
                                                defaultValue = -1
                                            },
                                            navArgument(
                                                name = "noteColor"
                                            ) {
                                                type = NavType.IntType
                                                defaultValue = -1
                                            },
                                        )
                                    ) {
                                        val color = it.arguments?.getInt("noteColor") ?: -1
                                        AddEditNoteScreen(
                                            navController = navController,
                                            noteColor = color
                                        )
                                    }
                                }
                            }
                        }
                    }
                )

            }
        }
    }
}


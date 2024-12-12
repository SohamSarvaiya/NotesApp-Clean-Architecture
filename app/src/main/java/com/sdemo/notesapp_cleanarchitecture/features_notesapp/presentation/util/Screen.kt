package com.sdemo.notesapp_cleanarchitecture.features_notesapp.presentation.util

sealed class Screen(val route: String) {
    object SplashScreen: Screen("splash_screen")
    object NotesScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}

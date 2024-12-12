package com.sdemo.notesapp_cleanarchitecture.features_notesapp.presentation.add_edit_note

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)

package com.sdemo.notesapp_cleanarchitecture.features_notesapp.presentation.notes

import com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.model.Note
import com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}

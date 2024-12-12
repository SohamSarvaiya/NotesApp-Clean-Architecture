package com.sdemo.notesapp_cleanarchitecture.features_notesapp.presentation.notes

import com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.model.Note
import com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.util.NoteOrder
import com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)

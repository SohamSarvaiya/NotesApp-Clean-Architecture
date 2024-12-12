package com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.repository

import com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}
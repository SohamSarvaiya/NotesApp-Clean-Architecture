package com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.use_case

import com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.model.InvalidNoteException
import com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.model.Note
import com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}
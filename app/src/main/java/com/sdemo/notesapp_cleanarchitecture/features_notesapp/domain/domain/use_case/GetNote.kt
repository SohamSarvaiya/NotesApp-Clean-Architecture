package com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.use_case

import com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.model.Note
import com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}
package com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sdemo.notesapp_cleanarchitecture.ui.theme.BabyBlue
import com.sdemo.notesapp_cleanarchitecture.ui.theme.LightGreen
import com.sdemo.notesapp_cleanarchitecture.ui.theme.RedOrange
import com.sdemo.notesapp_cleanarchitecture.ui.theme.RedPink
import com.sdemo.notesapp_cleanarchitecture.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)
package com.sdemo.notesapp_cleanarchitecture.features_notesapp.domain.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}

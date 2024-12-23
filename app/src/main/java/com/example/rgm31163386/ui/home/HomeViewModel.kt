package com.example.rgm31163386.ui.home

import androidx.lifecycle.ViewModel
import com.example.rgm31163386.data.Item


/**
 * ViewModel to retrieve all items in the Room database.
 */
class HomeViewModel : ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}

/**
 * Ui State for HomeScreen
 */
data class HomeUiState(val itemList: List<Item> = listOf())
package com.example.app.ui.viewModel.events

import com.example.app.data.dao.models.Perfume

sealed interface PlantEvent {
    data class AddPlant(val perfume: Perfume) : PlantEvent
    data class UpdatePlant(val perfume: Perfume) : PlantEvent
    data class DeletePlant(val perfume: Perfume) : PlantEvent
    data class ToggleFavorite(val perfume: Perfume) : PlantEvent

//    data class ShowDeleteDialog(val id: Int) : PlantEvent
//    object CloseDeleteDialog : PlantEvent
//
//    data class SortContents(val sortType: SortType): PlantEvent
}

enum class SortType {
    NAME,
    BOTANICAL_NAME
}

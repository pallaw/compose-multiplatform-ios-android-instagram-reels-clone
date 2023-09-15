package reels.ui

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import reelsList.data.ReelRepository
import reelsList.data.model.Reel

data class ReelsData(
    var reels: List<Reel> = emptyList()
)

class ReelViewModel(
    private val reelRepository: ReelRepository
) : ViewModel() {

    private val _reelsUiState = MutableStateFlow(ReelsData())
    val reelsUiState = _reelsUiState.asStateFlow()

    init {
        updateReels()
    }

    private fun updateReels() {
        val reels = reelRepository.getReels()
        _reelsUiState.update {
            it.copy(reels = reels)
        }
    }
}
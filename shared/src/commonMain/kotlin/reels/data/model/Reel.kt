package reelsList.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Reel(
    val description: String,
    val source: String,
    val subtitle: String,
    val thumb: String,
    val title: String
)
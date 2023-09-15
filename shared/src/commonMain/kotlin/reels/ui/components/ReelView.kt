package reels.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import reelsList.data.model.Reel

@Composable
fun ReelView(reel: Reel) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        ReelFooter(reel)
    }
}
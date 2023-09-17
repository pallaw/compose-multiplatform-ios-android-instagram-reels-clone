package reels.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import reels.platform.VideoPlayer
import reelsList.data.model.Reel

@Composable
fun ReelView(reel: Reel) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        VideoPlayer(
            modifier = Modifier
                .fillMaxSize()
                .aspectRatio(9.0f, true),
            videoUrl = reel.source
        )

        ReelFooter(reel)
    }
}
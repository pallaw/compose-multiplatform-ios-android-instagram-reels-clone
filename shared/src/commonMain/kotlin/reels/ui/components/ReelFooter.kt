package reels.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Comment
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import reelsList.data.model.Reel

@Composable
fun ReelFooter(reel: Reel) {

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Bottom
    ) {

        FooterCtaButtons()

        FooterReelInformation(reel)

    }

}

@Composable
fun FooterCtaButtons() {
    //CTA buttons
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.End
    ) {
        IconButton(onClick = { println("Fav Button clicked") }) {
            Icon(Icons.Filled.Favorite, contentDescription = "favorite")
        }

        IconButton(onClick = { println("Comment Button clicked") }) {
            Icon(Icons.Filled.Comment, contentDescription = "Comment")
        }

        IconButton(onClick = { println("Share Button clicked") }) {
            Icon(Icons.Filled.Share, contentDescription = "Share")
        }

        IconButton(onClick = { println("More Button clicked") }) {
            Icon(Icons.Filled.MoreVert, contentDescription = "More")
        }
    }
}

@Composable
fun FooterReelInformation(reel: Reel) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            KamelImage(
                modifier = Modifier
                    .size(24.dp)
                    .aspectRatio(1.0f)
                    .clip(CircleShape)
                    .background(Color.Black),
                resource = asyncPainterResource(reel.thumb),
                contentDescription = "User DP"
            )

            Text("${reel.title}")
        }

        Text(maxLines = 2, text = "${reel.description}")
    }
}

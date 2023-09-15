package reels.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bookmarks
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ReelsListHeader() {

    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp).padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(onClick = { println("Back button clicked") }) {
            Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
        }

        IconButton(onClick = { println("Back button clicked") }) {
            Icon(Icons.Filled.Bookmarks, contentDescription = "saved")
        }
    }

}

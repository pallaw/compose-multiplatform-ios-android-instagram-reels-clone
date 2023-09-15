import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import org.jetbrains.compose.resources.ExperimentalResourceApi
import reels.ui.ReelViewModel
import reels.ui.ReelsListScreen
import reelsList.data.ReelRepository

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {

    MaterialTheme {
        val reelViewModel = getViewModel(Unit, viewModelFactory { ReelViewModel(ReelRepository()) })
        ReelsListScreen(reelViewModel)
    }
}

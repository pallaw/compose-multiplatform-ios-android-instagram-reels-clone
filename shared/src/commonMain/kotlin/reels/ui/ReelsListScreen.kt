package reels.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import reels.ui.ReelViewModel
import reels.ui.components.ReelsListHeader
import reels.ui.components.ReelView

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ReelsListScreen(
    reelViewModel: ReelViewModel,
    modifier: Modifier = Modifier
) {
    val reelsData by reelViewModel.reelsUiState.collectAsState()

    val pagerState = rememberPagerState(pageCount = {
        reelsData.reels.size
    })

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        VerticalPager(state = pagerState) { page ->
            ReelView(reelsData.reels[page])
        }

        ReelsListHeader()
    }
}



/*
 * HP Tube Project Original (2026)
 * HarshGuruJi (https://github.com/harshguruji01/HP-Tube)
 * Licenced Under GPL-3.0+
*/
package com.arslandaim.playtube.domain.usecase

import com.arslandaim.playtube.domain.repository.DownloadRepository
import javax.inject.Inject

class PauseDownloadUseCase @Inject constructor(
    private val repository: DownloadRepository
) {
    suspend operator fun invoke(videoId: String) {
        repository.pauseDownload(videoId)
    }
}

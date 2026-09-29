/*
 * HP Tube Project Original (2026)
 * HarshGuruJi (https://github.com/harshguruji01/HP-Tube)
 * Licenced Under GPL-3.0+
*/
package com.arslandaim.playtube.di

import com.arslandaim.playtube.ui.screens.player.MiniPlayerManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ManagerModule {

    @Provides
    @Singleton
    fun provideMiniPlayerManager(): MiniPlayerManager {
        return MiniPlayerManager()
    }
}

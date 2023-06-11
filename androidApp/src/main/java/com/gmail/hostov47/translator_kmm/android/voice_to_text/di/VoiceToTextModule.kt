package com.gmail.hostov47.translator_kmm.android.voice_to_text.di

import android.app.Application
import com.gmail.hostov47.translator_kmm.android.voice_to_text.data.AndroidVoiceToTextParser
import com.gmail.hostov47.translator_kmm.voice_to_text.domain.VoiceToTextParser
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * @author Shelkovenko Ilya on 11.06.2023
 */
@Module
@InstallIn(ViewModelComponent::class)
object VoiceToTextModule {

    @Provides
    @ViewModelScoped
    fun provideVoiceToTextParser(app: Application): VoiceToTextParser {
        return AndroidVoiceToTextParser(app)
    }
}
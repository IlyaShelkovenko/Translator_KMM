package com.gmail.hostov47.translator_kmm.voice_to_text.domain

import com.gmail.hostov47.translator_kmm.core.domain.util.CommonStateFlow

/**
 * @author Shelkovenko Ilya on 11.06.2023
 */
interface VoiceToTextParser {
    val state: CommonStateFlow<VoiceToTextParserState>

    fun startListening(languageCode: String)
    fun stopListening()
    fun cancel()
    fun reset()

}
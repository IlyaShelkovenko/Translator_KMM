package com.gmail.hostov47.translator_kmm.voice_to_text.domain

/**
 * @author Shelkovenko Ilya on 11.06.2023
 */
data class VoiceToTextParserState(
    val result: String = "",
    val error: String? = null,
    val powerRatio: Float = 0f,
    val isSpeaking: Boolean = false
)
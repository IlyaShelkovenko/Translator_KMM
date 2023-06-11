package com.gmail.hostov47.translator_kmm.voice_to_text.presentation

/**
 * @author Shelkovenko Ilya on 11.06.2023
 */
data class VoiceToTextState(
    val powerRatios: List<Float> = emptyList(),
    val spokenText: String = "",
    val canRecord: Boolean = false,
    val recordError: String? = null,
    val displayState: DisplayState? = null
)

enum class DisplayState {
    WAITING_TO_TALK,
    SPEAKING,
    DISPLAY_RESULTS,
    ERROR
}
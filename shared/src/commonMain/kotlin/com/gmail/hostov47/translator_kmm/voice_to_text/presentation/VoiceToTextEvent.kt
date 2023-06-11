package com.gmail.hostov47.translator_kmm.voice_to_text.presentation

/**
 * @author Shelkovenko Ilya on 11.06.2023
 */
sealed class VoiceToTextEvent {
    object Close : VoiceToTextEvent()

    data class PermissionResult(
        val isGranted: Boolean,
        val isPermanentlyDeclined: Boolean
    ) : VoiceToTextEvent()

    data class ToggleRecording(val languageCode: String): VoiceToTextEvent()

    object Reset: VoiceToTextEvent()
}

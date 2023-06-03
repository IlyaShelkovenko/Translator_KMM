package com.gmail.hostov47.translator_kmm.android.translate.presentation.components

import android.speech.tts.TextToSpeech
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext

/**
 * @author Shelkovenko Ilya on 03.06.2023
 */
@Composable
fun rememberTextToSpeech(): TextToSpeech {
    val context = LocalContext.current
    val tts = remember {
        TextToSpeech(context, null)
    }
    DisposableEffect(key1 = tts){
        onDispose {
            tts.stop()
            tts.shutdown()
        }
    }
    return tts
}
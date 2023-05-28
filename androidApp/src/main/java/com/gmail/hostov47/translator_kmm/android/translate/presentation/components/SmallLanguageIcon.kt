package com.gmail.hostov47.translator_kmm.android.translate.presentation.components

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.gmail.hostov47.translator_kmm.core.presentation.UiLanguage
import com.gmail.hostov47.translator_kmm.translate.presentation.TranslateEvent

/**
 * @author Shelkovenko Ilya on 28.05.2023
 */
@Composable
fun SmallLanguageIcon(
    language: UiLanguage,
    modifier: Modifier = Modifier
) {
    AsyncImage(
        model = language.drawableRes,
        contentDescription = language.language.langName,
        modifier = Modifier.size(25.dp)
    )
}
package com.davidmerchan.onbording_presentation.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.davidmerchan.core.R
import com.davidmerchan.core_ui.LocalDimensions
import com.davidmerchan.onbording_presentation.welcome.components.ActionButton

@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = stringResource(id = R.string.onboarding_welcome),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h1,
        )
        Spacer(modifier = Modifier.height(LocalDimensions.current.spaceMedium))
        ActionButton(
            text = stringResource(id = R.string.onboarding_next_button),
            onClick = { /*TODO*/ },
            modifier = Modifier.align(Alignment.CenterHorizontally),
        )
    }
}

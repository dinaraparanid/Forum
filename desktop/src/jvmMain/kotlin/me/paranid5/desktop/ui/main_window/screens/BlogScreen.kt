package me.paranid5.desktop.me.paranid5.desktop.ui.main_window.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import me.paranid5.resources.Colors
import me.paranid5.resources.Strings

@Composable
fun BlogScreen() = Box(Modifier.fillMaxSize()) {
    // TODO: Blog screen

    Text(
        text = Strings.blog,
        modifier = Modifier.wrapContentSize().align(Alignment.Center),
        color = Colors.textColor
    )
}
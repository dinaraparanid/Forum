package me.paranid5.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
actual fun User.loadAvatar() = painterResource("images/human.png")
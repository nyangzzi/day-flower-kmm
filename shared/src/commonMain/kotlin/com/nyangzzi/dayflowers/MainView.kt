package com.nyangzzi.dayflowers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun App(
    sayHello: String,
    modifier: Modifier = Modifier.fillMaxSize()
        .background(Color.White)
){
    Text(text = sayHello)
}
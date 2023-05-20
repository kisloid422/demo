package com.example.demo.blocks

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.demo.ui.theme.DemoTheme

@Composable
fun Card () {
    Column(verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()){
        Title(name = "Andrii", title = "Boiarchuk")
        Column() {
            Details("+123 456 789", icon = Icons.Default.Phone)
            Details("myemail@student.pl", icon = Icons.Default.Email)
        }


}}
@Preview(showBackground = true)
@Composable
fun CardPreview() {
    DemoTheme {
        Card()
    }
}
package com.example.demo.blocks

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.demo.ui.theme.DemoTheme
import androidx.compose.material.Text as Text


@Composable
fun Title(name: String, title: String) {
    Row(verticalAlignment=Alignment.CenterVertically,
        content = {
    Text(text = name,
        modifier= Modifier,
        fontSize = 30.sp,
        textAlign = TextAlign.Center

    )
    Text(text = title,
        modifier= Modifier,
        fontSize = 33.sp,
        color = MaterialTheme.colors.secondary
    )

        })
}

@Preview(showBackground = true)
@Composable
fun TitlePreview() {
    DemoTheme {
        Title("Andrii ", "Boiarchuk")
    }
}
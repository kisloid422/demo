package com.example.demo.blocks

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.ui.theme.DemoTheme


@Composable
fun Details(text: String, icon: ImageVector){
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(18.dp)
        ) {
        Icon(
            icon,
            modifier = Modifier.size(18.dp),
            contentDescription = "")
        Text(
            text=text,
            fontSize = 18.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DemoTheme {
        Details("+123 456 789", icon = Icons.Default.Phone)
    }
}
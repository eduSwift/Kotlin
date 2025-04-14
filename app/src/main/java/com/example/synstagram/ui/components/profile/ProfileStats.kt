package com.example.synstagram.ui.components.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileStats() {
    Row(horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Text("148", fontWeight = FontWeight.Bold)
            Text("Posts")
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("2391", fontWeight = FontWeight.Bold)
            Text("Followers")
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("5709", fontWeight = FontWeight.Bold)
            Text("Following")
        }

    }
}


@Preview(showBackground = true)
@Composable
fun ProfileStatsPreview() {
    ProfileStats()
}
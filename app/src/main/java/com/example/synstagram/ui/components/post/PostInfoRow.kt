package com.example.synstagram.ui.components.post

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.synstagram.R

@Composable
fun PostInfoRow(
    modifier: Modifier = Modifier
) {
    Column {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(R.drawable.baseline_thumb_up_24),
                    contentDescription = "likes"
                )
                Text("1978", modifier = Modifier.padding(start = 6.dp))
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(R.drawable.baseline_comment_24),
                    contentDescription = "comments"
                )
                Text("38", modifier = Modifier.padding(start = 6.dp))
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                painter = painterResource(R.drawable.baseline_bookmark_24),
                contentDescription = "share"
            )
                Text("64", modifier = Modifier.padding(start = 6.dp))
            }
            Spacer(Modifier.weight(1f))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("10.04.2025") }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostInfoRowPreview() {
    PostInfoRow()
}
package com.example.synstagram.ui.components.basics

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
fun HomeHeader() {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Synstagram")

            Spacer( modifier = Modifier.weight(1f))

            Icon( painter = painterResource(R.drawable.baseline_thumb_up_24),
                contentDescription =  "like")


            Icon( painter = painterResource(R.drawable.baseline_comment_24),
                contentDescription =  "Comment")

        }
}


@Preview(showBackground = true)
@Composable
fun HomeHeaderPreview() {
    HomeHeader()
}
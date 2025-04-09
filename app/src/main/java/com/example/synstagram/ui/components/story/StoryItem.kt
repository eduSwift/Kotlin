package com.example.synstagram.ui.components.story

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.synstagram.R

@Composable
fun StoryItem() {
    Column {
        Box(
            modifier = Modifier
                .size(110.dp)
                .border(
                    width = 4.dp,
                    brush = Brush.sweepGradient(
                        listOf(
                            Color.Red, Color.LightGray, Color.Yellow, Color.Green,
                            Color.Blue, Color.Cyan, Color.Magenta, Color.Red
                        )
                    ),
                    shape = CircleShape
                )
                .padding(4.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.profilepic4),
                contentDescription = "profile pic",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .fillMaxSize()
            )
        }

        Text(
            text = "Julian Gutmann",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StoryItemPreview() {
    StoryItem()
}

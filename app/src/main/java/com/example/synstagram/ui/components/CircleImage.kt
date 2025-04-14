package com.example.synstagram.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.synstagram.R


@Composable
fun CircleImage() {
Column(horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.fillMaxSize()) {
    Image(
        painter = painterResource(R.drawable.profilepic),
        contentDescription = "profile pic",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(200.dp)
            .clip(CircleShape)
    )
}
}

@Preview(showBackground = true)
@Composable
fun CircleImagePreview(){
    CircleImage()
}
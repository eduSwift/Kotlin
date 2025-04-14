package com.example.synstagram.ui.components.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ProfileBio() {
Column(
    modifier = Modifier.padding(24.dp)
) {
    Text(
        text = "Tania Mara | App Developer 👩🏿‍💻",
        fontSize = 20.sp,)
    Text("Encouraging lifelong learning and growth")
}
}

@Preview(showBackground = true)
@Composable
fun ProfileBioPreview() {
    ProfileBio()
}
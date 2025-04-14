package com.example.synstagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.synstagram.ui.components.CircleImagePreview
import com.example.synstagram.ui.components.post.PostInfoRow
import com.example.synstagram.ui.theme.SynstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SynstagramTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PostInfoRow()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SynstagramTheme {
       PostInfoRow()
    }
}
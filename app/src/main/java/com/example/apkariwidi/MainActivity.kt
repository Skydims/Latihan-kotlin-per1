package com.example.apkariwidi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            a {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    var text by remember { mutableStateOf("Hello, Jetpack Compose!") }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = text, style = MaterialTheme.typography.h5)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { text = "Button Clicked!" }) {
            Text("Click Me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeAppTheme {
        MainScreen()
    }
}

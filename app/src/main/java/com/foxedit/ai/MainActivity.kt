package com.foxedit.ai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoxEditApp()
        }
    }
}

@Composable
fun FoxEditApp() {
    var selectedStyle by remember { mutableStateOf("Velocity") }

    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF101018)
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(35.dp))

                Text(
                    "FOX EDIT AI 🦊",
                    color = Color(0xFFFF7A00),
                    fontSize = 30.sp
                )

                Text(
                    "Crie edits incríveis com inteligência artificial",
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(35.dp))

                Text("ESCOLHA SEU ESTILO",
                    color = Color.White)

                val styles = listOf(
                    "Velocity", "Phonk", "Anime",
                    "Football", "Cinematic", "AMV",
                    "Shake", "Glow", "Slow Motion",
                    "Flash", "Beat Sync", "Custom"
                )

                styles.forEach { style ->
                    Button(
                        onClick = { selectedStyle = style },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Text(style)
                    }
                }

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    "Estilo escolhido: $selectedStyle",
                    color = Color(0xFFFF7A00)
                )
            }
        }
    }
}

package com.example.lab04moviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.lab04moviles.ui.theme.Lab04MovilesTheme

// Importaciones adicionales para los componentes
import androidx.compose.material3.Card
import androidx.compose.material3.Button
import androidx.compose.material3.Switch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab04MovilesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun DemoCard() {
    Card { Text("Componente Card") }
}

@Composable
fun DemoButton() {
    Button(onClick = {}) { Text("Componente Button") }
}

@Composable
fun DemoSwitch() {
    Switch(checked = true, onCheckedChange = {})
}
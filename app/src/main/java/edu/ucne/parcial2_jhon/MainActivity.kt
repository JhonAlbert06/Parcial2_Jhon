package edu.ucne.parcial2_jhon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import dagger.hilt.android.AndroidEntryPoint
import edu.ucne.parcial2_jhon.ui.theme.Parcial2_JhonTheme
import java.io.IOException

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Parcial2_JhonTheme {

                Box(Modifier.width(50.dp)) {
                    AsyncImage(
                        model = "https://example.com/image.jpg",
                        contentDescription = null
                    )
                }



            }
        }
    }
}
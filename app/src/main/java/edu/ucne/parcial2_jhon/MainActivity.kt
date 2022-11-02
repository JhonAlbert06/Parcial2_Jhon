package edu.ucne.parcial2_jhon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import edu.ucne.parcial2_jhon.ui.theme.Parcial2_JhonTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Parcial2_JhonTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "HomeScreen"
                ) {

                    composable("HomeScreen") {
                        //HomeScreen(navController = navController)
                    }

                    composable("EditScreen") {
                        //EditScreen(navController = navController)
                    }

                }
            }
        }
    }
}
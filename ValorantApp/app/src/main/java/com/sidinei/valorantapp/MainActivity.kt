package com.sidinei.valorantapp

import NavGraph
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.sidinei.feature_navigation.composables.BottomNavigationBar
import com.sidinei.valorantapp.ui.theme.ValorantAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainActivityContent()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    MainActivityContent()
}

@Composable
fun MainActivityContent() {
    val navController = rememberNavController()
    ValorantAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column {
                // Ocupa todo o espaço disponível, deixando espaço apenas para o BottomNavigationBar
                Box(modifier = Modifier.weight(1f)) {
                    NavGraph(navController = navController)
                }

                BottomNavigationBar(navController = navController)
            }
        }
    }
}

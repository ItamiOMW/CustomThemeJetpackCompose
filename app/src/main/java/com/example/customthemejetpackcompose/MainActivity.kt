package com.example.customthemejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.customthemejetpackcompose.ui.theme.CustomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = CustomTheme.colors.background
                ) {
                    Box {
                        Text(
                            text = "Main activity",
                            style = CustomTheme.typography.bodyLarge,
                            color = CustomTheme.colors.onBackground,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
        }
    }
}
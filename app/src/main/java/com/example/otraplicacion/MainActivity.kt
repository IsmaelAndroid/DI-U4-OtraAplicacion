package com.example.otraplicacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/** Otro proyecto cualquiera: NO tiene el codigo de BadgeEstado; lo traera dentro de un .aar */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Surface(Modifier.fillMaxSize()) { PantallaPrincipal() }
            }
        }
    }
}

@Composable
fun PantallaPrincipal() {
    Column(
        Modifier.safeDrawingPadding().padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        Text("Otra Aplicacion", style = MaterialTheme.typography.headlineSmall)
        Text("Proyecto 2: consume componentes de otro proyecto", style = MaterialTheme.typography.bodyMedium)
        HorizontalDivider()

        // TODO (paso 4): aqui ira PantallaExtra(), que usa BadgeEstado del proyecto IsmaelUIKit
        Text("Aqui pondremos el componente que viene en el .aar")
    }
}

@Preview(showBackground = true)
@Composable
private fun VistaPreviaPantallaPrincipal() {
    MaterialTheme { PantallaPrincipal() }
}

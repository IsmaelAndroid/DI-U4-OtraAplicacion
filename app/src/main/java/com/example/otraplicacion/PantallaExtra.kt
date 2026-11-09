package com.example.otraplicacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.uikit.BadgeEstado
import com.example.uikit.Estado

@Preview(showBackground = true)
@Composable
fun PantallaExtra() {
    BadgeEstado(Estado.OK)        // el componente ya viene dentro del .aar
}

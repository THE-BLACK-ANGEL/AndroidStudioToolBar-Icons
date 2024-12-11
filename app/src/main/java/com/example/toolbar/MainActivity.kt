package com.example.toolbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.toolbar.ui.theme.ToolBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToolBarTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    toolBar(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun toolBar (modifier: Modifier= Modifier){
    //Invocacion del toolbar
    TopAppBar(
        title = { Text(text = "MI APLICACION") },
        //Botones para realizar acciones
        actions = {
            //Boton de busqueda
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        //Imagen de icono
                        imageVector = Icons.Rounded.Search,
                        contentDescription = null
                    )
                }
            //Boton de cuenta
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.AccountCircle,
                        contentDescription = null
                    )
                }
        },
        //Boton de navegacion
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.Menu, contentDescription = null)
            }
        }

    )
}

@Preview(showBackground = true)
@Composable
fun toolBarPreview() {
    ToolBarTheme {
        toolBar()
    }
}


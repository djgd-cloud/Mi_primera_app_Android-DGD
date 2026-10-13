package es.medac.diegogarcia.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import es.medac.diegogarcia.app.ui.theme.PMDM_P1_DiegoGarciaTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .safeDrawingPadding()
                    .padding(16.dp)
            ) {
                // Título desde strings.xml
                Text(
                    text = stringResource(id = R.string.titulo_biblioteca),
                    fontSize = 22.sp
                )

                Spacer(modifier = Modifier.height(16.dp))

                // 1. Imagen de mapa de bits (portada)
                Image(
                    painter = painterResource(id = R.drawable.manga),
                    contentDescription = "Portada Manga",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))

                // 2. Imagen vectorial (icono lector)
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.ic_book_reader),
                        contentDescription = "Icono lectura",
                        modifier = Modifier.size(32.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = stringResource(id = R.string.boton_continuar),
                        fontSize = 16.sp
                    )
                }
            }
        }
            }
        }

@Composable
fun ComicScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        // 1. Imagen de mapa de bits (portada)
        Image(
            painter = painterResource(id = R.drawable.manga),
            contentDescription = "Portada del comic",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 2. Imagen vectorial (icono)
        Image(
            painter = painterResource(id = R.drawable.ic_book_reader),
            contentDescription = "Icono lector vectorial",
            modifier = Modifier.size(32.dp)
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PMDM_P1_DiegoGarciaTheme {
        Greeting("Android")
    }
}
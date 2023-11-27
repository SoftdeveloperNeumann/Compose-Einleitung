package com.example.einleitung

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.einleitung.ui.theme.EinleitungTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EinleitungTheme {
                /*
                Der Surface-Container in Jetpack Compose ist ein Composable, das eine Material-Oberfläche darstellt und eine Reihe von Eigenschaften wie Hintergrundfarbe, Form, Elevation und Rahmen bereitstellt ¹. Der Surface-Container kann verwendet werden, um die Darstellung von Inhalten in Ihrer App zu verbessern, indem er eine visuelle Hierarchie erstellt und die Lesbarkeit des Codes verbessert ¹.

                Im Vergleich zum Box-Container bietet der Surface-Container zusätzliche Funktionen wie automatische Anpassung der Farben an das Material-Design, Blockieren der Touch-Propagation hinter der Oberfläche und Unterstützung für die dunkle und helle Themenmodi Ihrer App ²³.

                Weitere Informationen zur Verwendung des Surface-Containers in Jetpack Compose finden Sie in der offiziellen Dokumentation von Android Developers ¹²³.

                Ich hoffe, das hilft Ihnen weiter! Wenn Sie weitere Fragen haben, lassen Sie es mich bitte wissen.

                Quelle: Unterhaltung mit Bing, 27.11.2023
                (1) When should I use Android Jetpack Compose's Surface composable?. https://stackoverflow.com/questions/65918835/when-should-i-use-android-jetpack-composes-surface-composable.
                (2) How to Add Surface with Rounded Corners in Android Jetpack Compose .... https://codingwithrashid.com/surface-with-rounded-corners-in-android-jetpack-compose/.
                (3) Difference Between Surface and Box in Android Jetpack Compose. https://codingwithrashid.com/difference-between-surface-and-box-in-android-jetpack-compose/.
                (4) Surface In Jetpack Compose. - Medium. https://hey-agrawal.medium.com/surface-in-jetpack-compose-c0712d38b994.
                 */
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EinleitungTheme {
        Greeting("Android")
    }
}
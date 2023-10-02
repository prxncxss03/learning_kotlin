package com.example.composequadrantv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrantv2.ui.theme.ComposeQuadrantV2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantV2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Test()
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
    fun Quadrant(title: String, content: String, color: Color, modifier: Modifier = Modifier) {


        Column(
            modifier = Modifier
                .background(color)
                .padding(
                    16.dp
                ),

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,


            )
        {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(
                        start = 0.dp,
                        end = 0.dp,
                        top = 0.dp,
                        bottom = 16.dp,
                    )


            )
            Text(
                text = content,
                textAlign = TextAlign.Justify,


            )
        }
    }

    @Composable
    fun Test(modifier: Modifier = Modifier) {
        Column(

            Modifier
                .background(color = Color.DarkGray)
                .fillMaxWidth()

        ) {
            Row(Modifier.background(Color.Yellow)) {
                Quadrant(
                    title = "Hello po",
                    content = "This is the content of the title",
                    color = Color(0xFFEADDFF),
                    modifier = Modifier.weight(1f)



                )
                Quadrant(
                    title = "fkjaodjfodsfjiosd",
                    content = "why why why whyyyyyyyyyyyyyyyyyy",
                    color = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(4f)


                )


            }
            Row(Modifier.background(Color.Blue)) {
                Quadrant(
                    title = "Di ko magets 😭",
                    content = "Bat ganerrrrrrrrrrrrrrrrrn",
                    color = Color(0xFFEADDFF),
                    modifier = Modifier.weight(1f)
                )
                Quadrant(
                    title = "Sige sige",
                    content = "Jetpack Compose is Android's recommended modern toolkit for building native UI. ",
                    color = Color(0xFFEADDFF),
                    modifier = Modifier.weight(1f)

                )


            }



        }
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ComposeQuadrantV2Theme {
            Test()
        }
    }
}
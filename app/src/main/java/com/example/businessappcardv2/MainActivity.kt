package com.example.businessappcardv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businessappcardv2.ui.theme.BusinessAppCardv2Theme
import com.example.businessappcardv2.ui.theme.inter
import androidx.compose.material3.Icon as Material3Icon


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessAppCardv2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val callIcon = Icons.Default.Call
                    val messageIcon = Icons.Default.MailOutline
                    val addressIcon = Icons.Default.Place

                    val phoneNumber = "098434543"
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Profile(fullName = "Eline Pocon", title = "Dracula Theme Lover")
                        Spacer(modifier = Modifier.height(90.dp))
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            IconTextComposable(callIcon, phoneNumber)
                            Spacer(modifier = Modifier.height(5.dp))
                            IconTextComposable(messageIcon, "elinepocon@gmail.com")
                            Spacer(modifier = Modifier.height(5.dp))
                            IconTextComposable(addressIcon, "Pakitanong kay Badz")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Profile(fullName: String, title: String){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)

    ){
        Image(
            painter = painterResource(id = R.drawable.dracula),
            contentDescription = "dracula logo",
            modifier = Modifier
                .clip(CircleShape)
                .size(100.dp)
        )
        Text(
            text = fullName,
            fontSize = 30.sp,
            fontFamily = inter,
            fontWeight = FontWeight.Normal


        )
        Text(
            text = title,
            fontSize = 15.sp,
            fontFamily = inter,
            fontWeight = FontWeight.SemiBold
        )
    }

}

@Composable
fun IconTextComposable(
    icon: ImageVector,
    text: String
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .defaultMinSize(230.dp)

    ) {
        Row {
            Material3Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 9.dp)
            )
            Text(
                text = text,
                modifier = Modifier.padding(top = 4.dp),
                fontFamily = inter,
                fontWeight = FontWeight.Normal,
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessAppCardv2Theme{
        val callIcon = Icons.Default.Call
        val messageIcon = Icons.Default.MailOutline
        val addressIcon = Icons.Default.Place

        val phoneNumber = "098434543"
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ){
            Profile(fullName = "Eline Pocon", title = "Dracula Theme Lover")
            Spacer(modifier = Modifier.height(90.dp))
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Magenta)
            ) {
                IconTextComposable(callIcon, phoneNumber)

                IconTextComposable(messageIcon, "elinepocon@gmail.com")
                IconTextComposable(addressIcon, "Pakitanong kay Badz")
            }
        }


    }
}
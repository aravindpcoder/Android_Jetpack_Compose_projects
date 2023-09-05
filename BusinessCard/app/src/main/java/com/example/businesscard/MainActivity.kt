package com.example.businesscard

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
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(){
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xFF033012)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val image = painterResource(R.drawable._200px_android_logo_2019__stacked__svg)

        Image(
            painter = image,
            contentDescription = "Android Logo",
            modifier = Modifier
                .height(120.dp)
                .width(150.dp)
        )
        Text(
            text = "Aravind P",
            fontSize = 24.sp,
            //modifier = Modifier.padding (bottom = 16.dp),
                color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Android Developer ",
            fontSize = 24.sp,
          //  modifier = Modifier.padding(bottom = 16.dp),
            color =Color.White
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 120.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start
        ) {
            Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp)
            ) {
                val image = painterResource(R.drawable.call)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.padding(8.dp)
                        .height(50.dp)
                        .width(50.dp)
                )
                Text(
                    text = "+91 8489999557",
                    fontSize = 24.sp,
                            modifier = Modifier.padding(8.dp),
                    color = Color.White
                )
            }
            Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp)
            ) {

                val image = painterResource(R.drawable.share_image)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.padding(8.dp)
                        .height(50.dp)
                        .width(50.dp)

                )
                Text(
                    text = "@AndroidDev",
                    fontSize = 24.sp,
                            modifier = Modifier.padding(8.dp),
                    color = Color.White
                )
            }
            Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp)
            ) {

                val image = painterResource(R.drawable.mail_box_symbol)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.padding(8.dp)
                        .height(50.dp)
                        .width(50.dp)
                )
                Text(
                    text = "aravindpcoder@gmail.com",
                    fontSize = 20.sp,
                            modifier = Modifier.padding(8.dp),
                    color = Color.White
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
            BusinessCard()
    }
}
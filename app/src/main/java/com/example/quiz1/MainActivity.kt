package com.example.quiz1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quiz1.ui.theme.Quiz1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Quiz1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quiz1App()
                }
            }
        }
    }
}

@Composable
fun Quiz1App() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(bottom = 480.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Quiz1Card1(iconHsiSakinah = painterResource(R.drawable.logo_hsi_sakinah))
    }
    Column(
        Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp, top = 40.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
            Quiz1Card2(
                title = stringResource(R.string.title),
                akhir = stringResource(R.string.description),
                formulir = painterResource(R.drawable.icon_formulir),
                button1 = stringResource(R.string.button1),
                button2 = stringResource(R.string.button2)
            )
    }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Quiz1Card3(
            taskbar1 = painterResource(R.drawable.logo_home),
            taskbar2 = painterResource(R.drawable.logo_search),
            taskbar3 = painterResource(R.drawable.logo_person)
        )
        QuizCard4(
            taskbarName1 = stringResource(R.string.home),
            taskbarName2 = stringResource(R.string.pencarian),
            taskbarName3 = stringResource(R.string.profil)
        )
    }
}

@Composable
private fun Quiz1Card1(iconHsiSakinah: Painter) {
    Column() {
        Image(painter = iconHsiSakinah, contentDescription = null, Modifier.size(140.dp))
    }
}

@Composable
private fun Quiz1Card2(
    title: String, formulir: Painter,akhir: String,
    button1: String, button2: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color(0xFFE9EDF2), shape = AbsoluteRoundedCornerShape(20.dp))
            .padding(start = 20.dp, end = 20.dp, top = 20.dp)
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 20.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black,
            fontSize = 20.sp
        )
        Text(
            text = akhir,
            modifier = Modifier.padding(bottom = 20.dp),
            textAlign = TextAlign.Center,
            color = Color(0xFF969A9F),
            fontWeight = FontWeight(500)
        )
        Image(painter = formulir, contentDescription = null,
            Modifier
                .size(200.dp)
                .padding(bottom = 20.dp)
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            horizontalArrangement = Arrangement.Absolute.SpaceBetween
        ) {
            Text(text = button1,
                Modifier
                    .border(1.5.dp, Color(0xFF5276A7), shape = AbsoluteRoundedCornerShape(20.dp))
                    .padding(top = 20.dp, bottom = 20.dp, start = 47.dp, end = 47.dp),
                color = Color(0xFF5276A7), fontWeight = FontWeight.Bold, fontSize = 20.sp
            )
            Text(
                text = button2,
                Modifier
                    .background(Color(0xFF5276A7), shape = AbsoluteRoundedCornerShape(20.dp))
                    .padding(top = 20.dp, bottom = 20.dp, start = 48.dp, end = 48.dp),
                color = Color(0xFFE9EDF2),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }
}

@Composable
private fun Quiz1Card3(taskbar1: Painter, taskbar2: Painter, taskbar3: Painter) {
    Row(
        Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
        Icon(
            painter = taskbar1,
            contentDescription = null,
            Modifier.size(30.dp),
            tint = Color(0xFF4EB0EC)
        )
        Icon(
            painter = taskbar2,
            contentDescription = null,
            Modifier.size(30.dp),
            tint = Color(0xFF969A9F)
        )
        Icon(
            painter = taskbar3,
            contentDescription = null,
            Modifier.size(30.dp),
            tint = Color(0xFF969A9F)
        )

    }
}

@Composable
private fun QuizCard4(taskbarName1: String, taskbarName2: String, taskbarName3: String) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp),
        horizontalArrangement = Arrangement.SpaceAround) {
        Text(
            text = taskbarName1,
            Modifier.padding(start = 7.dp),
            color = Color(0xFF4EB0EC)
        )
        Text(
            text = taskbarName2,
            color = Color(0xFF969A9F)
        )
        Text(
            text = taskbarName3,
            Modifier.padding(end = 5.dp),
            color = Color(0xFF969A9F)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Quiz1Preview() {
    Quiz1Theme {
        Quiz1App()
    }
}
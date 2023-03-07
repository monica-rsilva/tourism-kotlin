package br.senai.sp.jandira.tourism

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.tourism.ui.theme.TourismTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TourismTheme {
               LoginScreen()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LoginScreen() {
    TourismTheme {

        var email = ""
        var password = ""

//        Para a surface ocupar toda a tela do celular
        Surface(modifier = Modifier.fillMaxSize()){
//        Para a colum ocupar toda a surface
            Column(modifier = Modifier.fillMaxSize()) {
//                HEADER
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(id = R.string.title),
                        color = Color(207, 6, 240, 255),
                        fontSize = 48.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = stringResource(id = R.string.message_login),
                        fontSize = 14.sp,
                        color = Color.Black

                    )
                }
                Column (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                    OutlinedTextField(value = email,
                        onValueChange = {email},
                        label = { Text(text = stringResource(id = R.string.email_label))}
                    )
                    OutlinedTextField(value = password,
                        onValueChange = {password},
                        label = { Text(text = stringResource(id = R.string.password_label))}
                    )
                }
            }
        }
    }
}
package br.senai.sp.jandira.caixadetext

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.caixadetext.ui.theme.CaixaDeTextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaixaDeTextTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Box(
            modifier = Modifier
                .background(color = Color.Red)
                .fillMaxWidth()
                .height(200.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.imc),
                contentDescription = "imc",
                modifier = Modifier
                    .padding(60.dp)
                    .offset(x = 100.dp, y = -45.dp)
            )
            Text(
                text = "Calculadora IMC",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .offset(x = 100.dp, y = 100.dp)


            )
        }


    }

    Column {
        Card (
            modifier = Modifier
                .padding(top = 120.dp)
                .fillMaxWidth()
                .height(460.dp)
                .padding(28.dp),
            colors = CardDefaults
                .cardColors(containerColor = Color(0xFFECE7DF))
        ){

            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ){
                Text(
                    text = "Seus dados",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red,
                    modifier = Modifier
                        .offset(x = 80.dp, y = 0.dp)


                )
                Text(
                    text = "Seu peso",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red,
                    modifier = Modifier
                        .offset(x= 0.dp, y = 41.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .padding(top = 50.dp)
                        .fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xFFFF0000),
                            unfocusedBorderColor = Color(0xFFFF0000),
                            // Quando tiver o texto em foco fica dessa cor
                            focusedTextColor = Color(0xFFFF0000),
                            // Quando nao tiver em foco
                            unfocusedTextColor = Color(0xFFFF0000)
                        ),
                    // Funcao Label - Neste caso ela fica acima da caixa para digitar
                    placeholder = {
                        Text(text = "Seu peso em kg")
                    }

                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Sua altura",
                            fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red,
                    modifier = Modifier
                        .offset(x= 0.dp, y = -4.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange ={},
                    modifier =  Modifier
                        .fillMaxWidth(),

                    // Label sobe pra cima da linha quando usado no outlinedTextField
//                    label = {
//                        Text(text = "Digite seu nome")
//                    }

                    // Placeholder - continua quando clica
                    placeholder = {
                        Text(text = "Sua altura em cm")
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            // Quando a borda tiver desfocada e em foco
                            focusedBorderColor = Color(0xFFFF0000),
                            unfocusedBorderColor = Color(0xFFFF0000),

                            focusedTextColor = Color(0xFF838338),
                            unfocusedTextColor = Color(0xFF337447)

                        )

                )

            }
            // Botao para calcular o IMC
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(300.dp)
                    .offset(x = 20.dp, y = 50.dp)
                    .height(50.dp),
                // Definir cor do botao
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {
                // Texto dentro do botao
                Text(
                    text = "CALCULAR",
                    fontSize = 20.sp
                )
            }

        }
        // Card para aparecer o resultado
        Card (
            modifier = Modifier
                .padding(top = 0.dp)
                .fillMaxWidth()
                .height(200.dp)
                .padding(38.dp),
            colors = CardDefaults
                .cardColors(containerColor = Color(0xFF4CAF50))

        ){
            Text(
                text = "Resultado",
                color = Color.White,
                fontSize = 12.sp,
                fontWeight = FontWeight.Light,

                modifier = Modifier
                    .offset(x = 29.dp, y = 40.dp)
            )
            Text(
                text = "Peso Ideal",
                color = Color.White,
                        fontSize = 20.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier
                    .offset(x = 16.dp, y = 46.dp)
            )
            Text(
                text = "21.3",
                color = Color.White,
                        fontSize = 29.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .offset(x = 240.dp, y = 0.dp)
            )

        }
        }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CaixaDeTextTheme {
        Greeting()
    }
}
package com.example.runapp.screens.register


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.runapp.R
import com.example.runapp.ui.components.CustomTextField
import com.example.runapp.ui.components.GoTo
import com.example.runapp.ui.components.Header
import com.example.runapp.ui.components.LabelButton
import com.example.runapp.ui.components.LabelTextField
import com.example.runapp.ui.theme.RunAppTheme

//Trzeba dodać zmienne dla innych języków
@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    painter: Painter = painterResource(id = R.drawable.register),
    viewModel: RegisterViewModel = RegisterViewModel(),
    //listOfNames: List<String>
){
    Box(
        modifier = modifier
            .paint(
                painter = painter
            )
            .fillMaxSize()
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ){
        Column( // formularz
            modifier = Modifier
                .background(
                    color = Color(220, 237, 249),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(25.dp)
                .shadow(
                    elevation = 2.dp,
                    spotColor = Color.Red,
                    shape = RoundedCornerShape(20.dp)
                )
        ) {
            Header(tittle = "Rejestracja")
            LabelTextField(text = "Nazwa użytkownika")
            CustomTextField(text = viewModel.nick, onValueChange = { viewModel.nick = it })
            LabelTextField(text = "Adres E-mail")
            CustomTextField(text = viewModel.mail, onValueChange = { viewModel.mail = it })
            LabelTextField(text = "Hasło")
            CustomTextField(text = viewModel.pass, onValueChange = { viewModel.pass = it})
            LabelTextField(text = "Potwierdź hasło")
            CustomTextField(text = viewModel.confrimPass, onValueChange = { viewModel.confrimPass = it })
            Spacer(modifier =  Modifier.padding(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 50.dp, max = 60.dp),
                colors = ButtonDefaults.buttonColors(Color(194, 28, 231, 255))
            ) {
                LabelButton(label = "Zarejestruj")
            }
            Spacer(modifier =  Modifier.padding(10.dp))
            GoTo("Masz już konto?", "Zaloguj się!")
            Spacer(modifier =  Modifier.padding(10.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterPreview(){
    RunAppTheme {
        //enableEdgeToEdge w mainactivity rysuje poprawnie tło jak coś uruchamiać tamto
        RegisterScreen()
    }
}
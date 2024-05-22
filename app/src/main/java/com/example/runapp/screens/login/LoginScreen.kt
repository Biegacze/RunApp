package com.example.runapp.screens.login

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
import androidx.compose.material3.Text
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
import com.example.runapp.ui.theme.RunAppTheme
import com.example.runapp.R
import com.example.runapp.ui.components.CustomTextField
import com.example.runapp.ui.components.GoTo
import com.example.runapp.ui.components.Header
import com.example.runapp.ui.components.LabelButton
import com.example.runapp.ui.components.LabelTextField


@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    painter: Painter = painterResource(id = R.drawable.login),
    viewModel: LoginViewModel = LoginViewModel(),
    //listOfNames: List<String>
){
    Box(
        modifier = modifier
            .fillMaxSize()
            .paint(
                painter = painter
            )
            .padding(20.dp),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier
                .background(
                    color = Color(220, 237, 249),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(25.dp)
        ) {
            Header(tittle = "Logowanie")
            LabelTextField(text = "Nazwa użytkownika")
            CustomTextField(text = viewModel.nick, onValueChange = { viewModel.nick = it })
            LabelTextField(text = "Hasło")
            CustomTextField(text = viewModel.pass, onValueChange = { viewModel.pass = it })
            Spacer(modifier =  Modifier.padding(10.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 50.dp, max = 60.dp),
                colors = ButtonDefaults.buttonColors(Color(194, 28, 231, 255))
            ) {
                LabelButton(label = "Zaloguj")
            }
            Spacer(modifier =  Modifier.padding(10.dp))
            GoTo(labelInfo = "Nie masz jeszcze konta?", labelNavigateTo = "Zarejstruj się!")
            Spacer(modifier =  Modifier.padding(10.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginPreview(){
    RunAppTheme {
        LoginScreen() // to samo co wy wypadku register screen jak uda Ci się to zmienić zaznacz proszę
    }
}

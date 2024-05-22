package com.example.runapp.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.runapp.R

@Composable
fun LabelTextField(text: String){
    Spacer(modifier =  Modifier.padding(10.dp))
    Text(
        text = text,
        fontFamily = FontFamily(
            Font(R.font.ralewayregular, FontWeight.Normal)
        ),
        fontSize = 18.sp
    )
    Spacer(modifier =  Modifier.padding(5.dp))
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    text: String,
    onValueChange: (String) -> Unit
){
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                elevation = 20.dp,
                spotColor = Color.Gray,
                shape = RoundedCornerShape(10.dp)
            )
        ,
        shape = RoundedCornerShape(20.dp),
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent),
        value = text,
        onValueChange = onValueChange,
    ) //powinienem textfieldcolors nie używać ale walic działa i daje mi porządany efekt
}

@Composable
fun GoTo(labelInfo: String, labelNavigateTo: String){
    Row(){
        Text(
            text = labelInfo
        )
        Spacer(modifier =  Modifier.padding(5.dp))
        Text(text = labelNavigateTo)
    } //tutaj trzeba zrobić nawigację do tego drugiego ekranu najlepiej funkcje uniwersalną
}

@Composable
fun LabelButton(label: String){
    Text(
        text = label,
        fontFamily = FontFamily(
            Font(R.font.ralewaybold, FontWeight.Bold)
        ),
        color = Color.White,
        fontSize = 28.sp
    )
}

@Composable
fun Header(tittle: String){
    Spacer(modifier = Modifier.padding(10.dp))
    Text(
        text = tittle,
        fontSize = 30.sp,
        fontFamily = FontFamily(
            Font(R.font.ralewayextrabold, FontWeight.Bold)
        )
    )
}
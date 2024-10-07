package com.sedakarana.navigation.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sedakarana.navigation.R
import com.sedakarana.navigation.navigation.Screen
import com.sedakarana.navigation.ui.theme.ButtonFirstBackColor

@Composable
fun FirstScreen(navController: NavController){ // NavController parametresi gezinme işlemini yapar.
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var detail= stringResource(id = R.string.s_second_screen_title)
        Text(text = stringResource(id = R.string.s_first_screen_title), fontSize = 30.sp)
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = { navController.navigate(
                Screen.SecondScreen.route
                    .replace("{detail}", detail))
            },
            modifier = Modifier.padding(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = ButtonFirstBackColor),
            shape = RoundedCornerShape(40.dp)
        ) {
            Text(text = stringResource(id = R.string.s_first_screen_button))
        }


    }
}
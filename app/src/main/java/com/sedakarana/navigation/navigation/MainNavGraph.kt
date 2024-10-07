package com.sedakarana.navigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.sedakarana.navigation.view.screen.FirstScreen
import com.sedakarana.navigation.view.screen.SecondScreen

@Composable
fun MainNavGraph(navController: NavHostController) { //Ekran geçişlerini kontrol etmemizi sağlar.NavHostController erkanlar arası geçiş yapmamızı kontrol eden parametredir.
    NavHost(navController = navController, startDestination = Screen.FirstScreen.route) {

        //NavHost : Uygulama içerisindeki arayüzleri aldığı parametrelere bağlı olarak kontrol eder.
        //startDestination :  İlk gösterilecek olan arayüzü belirlemek için kullanılır.

        composable(route = Screen.FirstScreen.route) {
            FirstScreen(navController = navController)
        }

        composable(route = Screen.SecondScreen.route,
            arguments = listOf(
                navArgument("detail") {
                    type = NavType.StringType
                }
            )
        ) {
            val detail = remember {
                it.arguments?.getString("detail")
            }
            SecondScreen(navController = navController, detail = detail!!)
        }

    }
}
package com.sedakarana.navigation.navigation

sealed class Screen(val route: String) { //Oluşturulan ekranların yönetimini sağlar
    object FirstScreen: Screen("first_screen")
    object SecondScreen: Screen("second_screen")
}
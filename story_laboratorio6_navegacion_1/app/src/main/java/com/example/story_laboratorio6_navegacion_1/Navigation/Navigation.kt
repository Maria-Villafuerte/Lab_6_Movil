package com.example.story_laboratorio6_navegacion_1.Navigation

import Listado_de_lugares
import LoginScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab_5.Pantallas.Detalle.View.Detalle
import com.example.lab_5.Pantallas.Detalle.View.Detalle_1
import com.example.lab_5.Pantallas.Mi_Perfil.Profile
import com.example.story_laboratorio6_navegacion_1.Pantallas.Favoritos.viewmodel.Favoritos
import om.example.story_laboratorio6_navegacion_1.Navigation.NavigationState
import om.example.story_laboratorio6_navegacion_1.Pantallas.Conciertos.Concierto

@Composable
fun Navigation_confi(navController: NavController) {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = NavigationState.Log_in.route) {
        composable(route = NavigationState.Mi_perfil.route) {
            Profile(navController)
        }
        composable(route = NavigationState.Conciertos.route) {
            Concierto(navController)
        }
        composable(route = NavigationState.Detalle.route) {
            Detalle(navController)
        }
        composable(route = NavigationState.Detalle_1.route) {
            Detalle_1(navController)
        }
        composable(route = NavigationState.Listado_de_lugares.route) {
            Listado_de_lugares(navController)
        }
        composable(route = NavigationState.Favoritos.route) {
           Favoritos(navController)
        }
        composable(route = NavigationState.Log_in.route) {
            LoginScreen(navController)
        }
    }
}
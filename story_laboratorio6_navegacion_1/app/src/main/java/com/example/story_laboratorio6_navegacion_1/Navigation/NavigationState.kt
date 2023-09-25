package om.example.story_laboratorio6_navegacion_1.Navigation

sealed class NavigationState(val route: String) {
    object Conciertos: NavigationState("Conciertos")
    object Detalle: NavigationState("Detalle")
    object Detalle_1: NavigationState("Detalle_1")
    object Listado_de_lugares: NavigationState("Listado_de_lugares")
    object Mi_perfil: NavigationState("Mi_perfil")
    object Favoritos: NavigationState("Favoritos")
    object Log_in: NavigationState("Log_in")


}
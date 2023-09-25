
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Divider
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.story_laboratorio6_navegacion.Navigation.AppBar
import com.example.story_laboratorio6_navegacion_1.ui.theme.Story_laboratorio6_navegacion_1Theme

data class Lugares(
    var Titulo_Lugar: String,
    val Locacion_Lugar: String,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Listado_de_lugares(navController: NavController = rememberNavController()){
    Column() {
        AppBar(title = "Listado", navController = navController)
        Divider(thickness = 1.dp, color = Color.Black)
        val total_eventos = remember {
            mutableStateListOf(
                Lugares("Guns And Roses LA", "LA Hall"),
                Lugares("Guns And Roses Denver", "Denver Hall"),
                Lugares("Guns And Roses New York", "Maddison Square Garden"),
                Lugares("Pato And Roses New York", "Maddison Square Garden"),
            )
        }

        LazyColumn(
            modifier = Modifier
                .padding(15.dp),
        ) {
            items(total_eventos.size) { event_1 ->
                aaa(total_eventos[event_1])
                Divider(thickness = 1.dp, modifier = Modifier.padding(8.dp))
            }

        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun aaa(event: Lugares){
    ListItem(
        headlineText = {
            Text(event.Titulo_Lugar)},
        supportingText = {
            Text(event.Locacion_Lugar)},
        trailingContent = {
            IconButton(onClick = { }) {
                Icon(Icons.Outlined.KeyboardArrowUp,  contentDescription = "See more") }
        },
        leadingContent = {
            Text(text = event.Titulo_Lugar.first().toString(),
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.LightGray)
                    .width(40.dp)
                    .height(40.dp)
                    .padding(7.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun Listado_de_lugares_Preview() {
    Story_laboratorio6_navegacion_1Theme {
        Listado_de_lugares()
    }
}
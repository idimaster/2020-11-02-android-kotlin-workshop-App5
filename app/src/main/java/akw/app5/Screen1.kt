package akw.app5

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun Screen1(onNav: (screen: String) -> Unit) {
    Column {
//        Head(onNav = onNav)
        Text(text = "Screen1")
    }
}
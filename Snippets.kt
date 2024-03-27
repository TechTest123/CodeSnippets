import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ThreeButtonLayout() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = { /* Do something */ },
            modifier = Modifier.weight(1f)
        ) {
            Text("Left Button")
        }

        Spacer(modifier = Modifier.width(16.dp))

        Button(
            onClick = { /* Do something */ },
            modifier = Modifier.weight(1f)
        ) {
            Text("Center Button")
        }

        Spacer(modifier = Modifier.width(16.dp))

        Button(
            onClick = { /* Do something */ },
            modifier = Modifier.weight(1f)
        ) {
            Text("Right Button")
        }
    }
}

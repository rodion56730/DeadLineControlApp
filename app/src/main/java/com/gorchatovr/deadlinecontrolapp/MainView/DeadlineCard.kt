package com.gorchatovr.deadlinecontrolapp.MainView

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.gorchatovr.deadlinecontrolapp.data.DeadLineData

@Composable
fun DeadLineCard(data: DeadLineData){
    val checkedState = remember { mutableStateOf(data.isActive) }
Card {

    Column {
        Row {

            Text(text = data.name, style = typography.labelLarge)
            Checkbox(checked = checkedState.value, onCheckedChange = {
                data.isActive = !data.isActive
                checkedState.value = it
            })
        }
        Row {
            Text(
                text = data.date,
                style = typography.titleSmall,
                modifier = Modifier.padding(5.dp)
            )

            Text(
                text = data.time.toString(),
                style = typography.titleSmall,
                modifier = Modifier.padding(5.dp)
            )

        }


    }
}
}
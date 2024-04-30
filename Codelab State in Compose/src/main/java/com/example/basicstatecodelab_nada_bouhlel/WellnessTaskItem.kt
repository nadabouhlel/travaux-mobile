package com.example.basicstatecodelab_nada_bouhlel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun WellnessTaskItem(
    taskName: String ="",
    checked: Boolean=false,
    onCheckedChange: (Boolean) -> Unit ={},
    onClose: () -> Unit ={},
    modifier: Modifier = Modifier
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
        ),
        modifier = Modifier
            .padding(16.dp)
    ) {
        var showTaskDetailsDialog by remember { mutableStateOf(false) }
        if (showTaskDetailsDialog) {
            TaskDetailsDialog(taskName,onClose = { showTaskDetailsDialog = false })
        }
        Spacer(modifier = Modifier.size(16.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Checkbox(
                checked = checked,
                onCheckedChange = onCheckedChange
            )
            Spacer(modifier = Modifier.size(16.dp))
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp),
                text = taskName
            )
            Spacer(modifier = Modifier.size(16.dp))

            IconButton(onClick = {
                showTaskDetailsDialog = true
            }) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Close")
            }
            Spacer(modifier = Modifier.size(16.dp))
            IconButton(onClick = onClose) {
                Icon(imageVector = Icons.Default.Clear, contentDescription = "Close")
            }

        }


    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun TaskDetailsDialog(title:String ="Test",onClose: () -> Unit={}) {
    AlertDialog(
        onDismissRequest = onClose
    ) {
        Column(modifier = Modifier.background(Color(R.color.teal_700))
            .padding(
                all = 8.dp
            ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

        ){
            Text(fontSize = 18.sp, color = Color.White,text = "Task Details")
            Text(fontSize = 15.sp, color = Color.White,text = title)
            Row(
                modifier = Modifier.padding(all = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onClose
                ) {
                    Text("Close")
                    Icon(imageVector = Icons.Default.Clear, contentDescription = "Close")
                }
            }
        }

    }
}
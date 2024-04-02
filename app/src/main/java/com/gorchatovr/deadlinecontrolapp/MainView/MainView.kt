package com.gorchatovr.deadlinecontrolapp.MainView

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.gorchatovr.deadlinecontrolapp.data.DataProvider


@Composable
fun MainView(){
    val puppies = remember { DataProvider.dataList }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = puppies,
            itemContent = {
               DeadLineCard(data = it)
            }
        )
    }
}
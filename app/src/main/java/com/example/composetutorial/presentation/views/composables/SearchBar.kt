package com.example.composetutorial.presentation.views.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.R
import com.example.composetutorial.presentation.theme.ComposeTutorialTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    modifier: Modifier = Modifier
) {
    val colors = TextFieldDefaults.textFieldColors(
        unfocusedIndicatorColor = MaterialTheme.colorScheme.surface,
        focusedIndicatorColor = MaterialTheme.colorScheme.surface,
        //unfocusedBorderColor = MaterialTheme.colorScheme.surface,
        //focusedBorderColor = MaterialTheme.colorScheme.surface
    )

    TextField(
        value = "",
        onValueChange = {},
        leadingIcon = {
           Icon(
               imageVector = Icons.Default.Search,
               contentDescription = null
           )
        },
        placeholder = {
            Text(stringResource(R.string.placeholder_search))
        },
        colors = colors,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
    )
}
@Preview(
    showBackground = true,
    backgroundColor = 0xFFF5F0EE
)
@Composable
fun SearchBarPreview(){
    ComposeTutorialTheme {
        Surface{
            SearchBar(
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
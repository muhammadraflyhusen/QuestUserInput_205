package com.example.inputpengguna

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource

@Composable
fun FormDataDiri(modifier: Modifier) {

    // variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }

    // variabel-variabel untuk menyimpan data yang diperoleh dari komponen input
    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    val gender: List<String> = listOf("Laki-laki", "Perempuan")

   Colum(
       modifier = Modifier.padding(top = 50.dp),
       verticalArrangement = Arrangement.Top,
       horizontalAlignment = Alignment.CenterHorizontally
   ) {
       val large = null
       OutlinedTextField(
           value = textNama,
           singleLine = true,
           shape = MaterialTheme,shapes,large,
           modifier = Modifier.width(width = 250.dp),
           label = { Text(text = "Nama Lengkap")},
           onValueChange = {
               textNama = it
           }

       )
       Row {
           gender.forEach { item ->
               Row(modifier = Modifier.selecttable(
                   selected = textJk == item,
                   onClick = {textJK = item}
               ), verticalAlligment = Alligment.CenterVertically) {
                   RadioButton(
                       selected = textJK == items,
                       onclick = {
                           textJK = item
                       })
                   Text(text=item)
               }
           }
       }
       OutlinedTextField(
           value = textAlamat,
           singeline = true,
           modifier = Modifier.width(width = 250.dp),
           label = { Text(text = "Alamat Lengkap") },
           onValueChange = {
               textAlamat = it
           }
       )

       HorizontalDevider(
           modifier = Modifier.padding(
               bottom = dimensionResource(R.dimen.padding_medium),
               top = dimensionResource(
                   id = R.dimen.padding_medium
               )),
           thickness = dimensionResource(id =R.dimen.divider_tipis),
           color = Color.DarkGray
       )

   }
}





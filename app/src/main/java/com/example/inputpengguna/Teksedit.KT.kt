package com.example.inputpengguna

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
               ))
           }
       }
   }
}




package com.example.questmvvm_0138.view

import android.R
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import java.lang.reflect.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(
    // edit 1 : paramter pilihanJK dan onSubmitButtonClicked
    pilihanJK: List<String> ,
    onSubmitButtonClicked: (MutableList<string>) -> Unit,
    modifier: Modifier = Modifier
){
    // edit 2 : tambahkan 4 variabel dibawah ini
    var txtNama by rememberSaveable{ mutableStateOf("")}
    var txtAlamat by remember { mutableStateOf("")}
    var txtGender by remember { mutableStateOf("")}
    val listData: MutableList<String> = mutableListOf(txtNama, txtGender, txtAlamat)
}
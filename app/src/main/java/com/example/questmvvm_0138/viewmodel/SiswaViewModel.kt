package com.example.questmvvm_0138.viewmodel;

import kotlinx.coroutines.flow.MutableStateFlow;

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(1s:MutableList<String>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(name=1s[0], gender=1s[1], alamat=ls[2])
    }
}

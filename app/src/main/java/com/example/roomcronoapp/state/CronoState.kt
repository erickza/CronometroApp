package com.example.roomcronoapp.state

data class CronoState(
    val cronometroActivo: Boolean = false,
    val showSaveButton: Boolean = false,
    val showTextFiled: Boolean = false,
    val title: String = ""

)

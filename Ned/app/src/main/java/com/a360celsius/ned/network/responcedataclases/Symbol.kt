package com.a360celsius.ned.network.responcedataclases

data class Symbol (
    val symbol: String,
    val name: String,
    val date: String,
    val isEnabled: Boolean,
    val type: String,
    val iexId: String
)
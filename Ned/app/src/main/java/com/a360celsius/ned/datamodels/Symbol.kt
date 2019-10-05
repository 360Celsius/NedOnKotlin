package com.a360celsius.ned.datamodels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Symbol (
    @Expose
    @SerializedName("symbol")
    val symbol: String,

    @Expose
    @SerializedName("name")
    val name: String,

    @Expose
    @SerializedName("date")
    val date: String,

    @Expose
    @SerializedName("isEnabled")
    val isEnabled: Boolean,

    @Expose
    @SerializedName("type")
    val type: String,

    @Expose
    @SerializedName("iexId")
    val iexId: String
)
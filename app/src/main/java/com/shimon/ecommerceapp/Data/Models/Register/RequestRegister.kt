package com.shimon.ecommerceapp.Data.Models.Register


import com.google.gson.annotations.SerializedName

data class RequestRegister(
    @SerializedName("avatar")
    var avatar: String? = null,
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("password")
    var password: String? = null
)
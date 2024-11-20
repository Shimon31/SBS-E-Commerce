package com.shimon.ecommerceapp.Data.Models.Login


import com.google.gson.annotations.SerializedName

data class ResponseLogin(
    @SerializedName("access_token")
    var accessToken: String? = null,
    @SerializedName("refresh_token")
    var refreshToken: String? = null
)
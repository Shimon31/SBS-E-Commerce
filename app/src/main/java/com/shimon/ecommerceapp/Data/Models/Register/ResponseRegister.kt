package com.shimon.ecommerceapp.Data.Models.Register


import com.google.gson.annotations.SerializedName

data class ResponseRegister(
    @SerializedName("avatar")
    var avatar: String? = null,
    @SerializedName("creationAt")
    var creationAt: String? = null,
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("id")
    var id: Int? = null,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("password")
    var password: String? = null,
    @SerializedName("role")
    var role: String? = null,
    @SerializedName("updatedAt")
    var updatedAt: String? = null
)
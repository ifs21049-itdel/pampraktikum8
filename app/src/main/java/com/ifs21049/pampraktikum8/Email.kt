package com.ifs21049.pampraktikum8

import android.graphics.drawable.Icon
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class Email (
    var name: String,
    var icon: Int,
    var subject: String,
    var text: String,
    ) : Parcelable
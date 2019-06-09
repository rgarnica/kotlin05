package com.example.trabalho05

import android.os.Parcel
import android.os.Parcelable

data class Headline (val code: Int, val title: String, val detail: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(code)
        parcel.writeString(title)
        parcel.writeString(detail)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Headline> {
        override fun createFromParcel(parcel: Parcel): Headline {
            return Headline(parcel)
        }

        override fun newArray(size: Int): Array<Headline?> {
            return arrayOfNulls(size)
        }

        fun createHeadline(title: String, detail: String): Headline {
            return Headline(
                (0..99).random(),
                title,
                detail
            )
        }
    }
}
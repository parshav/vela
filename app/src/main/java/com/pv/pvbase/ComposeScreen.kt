package com.pv.pvbase

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.Composable
import androidx.fragment.app.Fragment
import androidx.ui.core.Text
import androidx.ui.tooling.preview.Preview

class ComposeScreen : Fragment() {

    @Composable
    @Preview
    fun Test() {
        Text(text = "Demo Screen")
    }
}

package com.app.appstore

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.app.appstore.ui.theme.AppstoreTheme
import com.app.lockcompose.MainActivity


class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Intent(this, MainActivity::class.java).apply {
            startActivity(this)
            finish()
        }
        setContent {
            AppstoreTheme {

            }
        }
    }
}


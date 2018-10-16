package com.github.ankotutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.error
import org.jetbrains.anko.info

class AnkoCommonsActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anko_commons)
        checkLogger()
    }

    private fun checkLogger() {
        info { "Dicoding Academy" }
        debug(7)
        error(null)
    }

}

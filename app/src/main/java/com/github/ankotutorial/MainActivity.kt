package com.github.ankotutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)
    }

    class MainActivityUI: AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
            verticalLayout {
                imageView(R.drawable.ic_android_black_24dp).lparams(width = matchParent) {
                    padding = dip(20)
                    margin = dip(15)
                }

                val name = editText() {
                    hint = "what's your name?"
                }

                button("Say Hello")
            }
        }
    }

}

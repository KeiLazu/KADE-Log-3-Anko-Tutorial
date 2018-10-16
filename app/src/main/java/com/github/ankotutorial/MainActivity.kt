package com.github.ankotutorial

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

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

                button("Say Hello").onClick {
                    longToast("HAIHAI!")
                    startActivity<AnkoCommonsActivity>("name" to "dicoding")
                }

                button("Alert").onClick {
                    alert("HAPPY CODING!") {
                        yesButton { toast("RIGHTO!") }
                        noButton {  }
                    }.show()
                }

                button("process dialogs").onClick {
                    indeterminateProgressDialog("Hai!, please wait for a sec...").show()
                }

            }
        }
    }

}

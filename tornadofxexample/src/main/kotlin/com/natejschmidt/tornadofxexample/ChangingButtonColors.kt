package com.natejschmidt.tornadofxexample

import javafx.application.Platform
import javafx.scene.paint.Color
import tornadofx.*

class MyApp : App(MyView::class)

class MyView : View() {

    init {
        //the following prevents the application from quitting...
        //call Platform.exit() to quit
//        Platform.setImplicitExit(false)
    }

    override val root = vbox {
        label("Nate's")
        label("TornadoFX")
        label("Example")
        button("With a Button") {
            textFill = Color.BLACK
            action {
                println("button was pressed")
                this.apply {
                    when (textFill) {
                        Color.BLACK -> textFill = Color.RED
                        Color.RED -> textFill = Color.BLACK
                    }
                }
            }
        }
    }
}

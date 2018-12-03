package com.natejschmidt.tornadofxexample

import tornadofx.*

class SwapViewApp : App(CenterView::class)

/**
 * Global variables
 */
object ProgramConfigs {
    val TITLE = "Swapping Views Example"
}

/**
 * View for the leftmost window
 */
class LeftView : View(ProgramConfigs.TITLE) {
    override val root = vbox {
        label("This is the left view")
        button("Shift right to the center view") {
            action {
                replaceWith(CenterView::class, ViewTransition.Slide(0.5.seconds, ViewTransition.Direction.LEFT))
            }
        }
    }
}

/**
 * View for the center window
 */
class CenterView : View(ProgramConfigs.TITLE) {
    override val root = vbox {
        label("This is the center view")
        hbox {
            button("Shift left to the left view") {
                action {
                    replaceWith(LeftView::class, ViewTransition.Slide(0.5.seconds, ViewTransition.Direction.RIGHT))
                }
            }
            button("Shift right to the right view") {
                action {
                    replaceWith(RightView::class, ViewTransition.Slide(0.5.seconds, ViewTransition.Direction.LEFT))
                }
            }
        }
    }
}

/**
 * View for the rightmost window
 */
class RightView : View(ProgramConfigs.TITLE) {
    override val root = vbox {
        label("This is the right view")
        button("Shift left to the center view") {
            action {
                replaceWith(CenterView::class, ViewTransition.Slide(0.5.seconds, ViewTransition.Direction.RIGHT))
            }
        }
    }
}

/**
 * Example main method to show how to pass args into a TornadoFX application
 */
fun main(args: Array<String>) {
    launch<SwapViewApp>(args)
}
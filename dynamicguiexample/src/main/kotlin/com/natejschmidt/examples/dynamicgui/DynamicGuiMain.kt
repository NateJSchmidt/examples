package com.natejschmidt.examples.dynamicgui

import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import javafx.scene.control.Label
import tornadofx.*


class MainView : View() {
    override val root = vbox {
        primaryStage.width = 400.0
        primaryStage.height = 600.0
        val selectedForm = SimpleStringProperty("")
        hbox {
            val forms = FXCollections.observableArrayList("Form A", "Form B", "Form C")

            combobox(selectedForm, forms)
            {
                var comboBoxLabel: Label = label("")
                parent.parent.getChildList()?.add(comboBoxLabel)
                setOnAction {
                    //                    println("Selected new form ${selectedForm.get()}")
                    when (selectedForm.get()) {
                        "Form A" -> {
                            println("Form A is selected")
                            comboBoxLabel.text = "Form A is displayed"
                        }
                        "Form B" -> {
                            println("Form B is selected")
                            comboBoxLabel.text = "Form B is displayed"
                        }
                        "Form C" -> {
                            println("Form B is selected")
                            comboBoxLabel.text = "Form C is displayed"
                        }
                        else -> {
                            comboBoxLabel.text = "An error occurred.  Unknown string selected: ${selectedForm.get()}"
                            println("Error...unknown string selected: ${selectedForm.get()}")
                        }
                    }
                }
            }

        }
    }
}

class DynamicGuiApp : App(MainView::class)

fun main(args: Array<String>) {
    launch<DynamicGuiApp>(args)
}
package com.mailbox.kt

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    var hasMatchBox = false
    val boxes = initAllTypeOfBoxes()
    val scanner = Scanner(System.`in`)

    println(" Please enter object's length: ")
    val length = scanner.nextFloat()
    println(" Please enter object's width: ")
    val width = scanner.nextFloat()
    println(" Please enter object's height: ")
    val height = scanner.nextFloat()

    boxes.forEach { box: MailBox ->
        if (box.validate(length, width, height)) {
            box.printType()
            hasMatchBox = true
        }
    }

    if (!hasMatchBox) {
        println("Sorry, we don't have any proper box for you!")
    }
}

fun initAllTypeOfBoxes(): ArrayList<MailBox> {
    val boxes = arrayListOf<MailBox>()
    val box3 = Box3()
    val box5 = Box5()
    boxes.add(box3)
    boxes.add(box5)
    return boxes
}
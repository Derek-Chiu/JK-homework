package com.mailbox.kt

abstract class MailBox {
    abstract fun validate(length: Float, width: Float, height: Float): Boolean
    abstract fun printType()
}

//Box3: 長23，寬14，高13 (cm)
//Box5: 長39.5，寬27.5，高23 (cm)

class Box3: MailBox() {
    private val maxLength =  23f
    private val maxWidth = 14f
    private val maxHeight = 13f

    override fun validate(length: Float, width: Float, height: Float): Boolean {
        return length <= maxLength && width <= maxWidth && height <= maxHeight
    }

    override fun printType() {
        println("Box3")
    }
}

class Box5: MailBox() {
    private val maxLength =  39.5f
    private val maxWidth = 27.5f
    private val maxHeight = 23f

    override fun validate(length: Float, width: Float, height: Float): Boolean {
        return length <= maxLength && width <= maxWidth && height <= maxHeight
    }

    override fun printType() {
        println("Box5")
    }
}
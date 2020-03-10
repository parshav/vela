package com.pv.pvbase

import androidx.ui.graphics.Color
import com.pv.base.log

typealias Command = () -> Unit
data class CommandItem(
    val name: String,
    val color: Color = Color.DarkGray,
    val command: Command
)

object CommandItemData {

    fun testData(): List<CommandItem> = listOf(
        CommandItem(
            "asdasdasdasdasdasdasdasdasdasdasd",
            Color.Cyan
        ) {
            log("Test message")
        },
        CommandItem(
            "test2",
            Color.Blue
        ) {
            log("Test message2")
        },
        CommandItem(
            "test3"
        ) {
            log("Test message3")
        }
    )
}
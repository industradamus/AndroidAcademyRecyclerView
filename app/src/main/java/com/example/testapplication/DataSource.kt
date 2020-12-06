package com.example.testapplication

import android.graphics.Color

object DataSource {

    fun getData(): List<ListItem> = listOf(
        ListItem(Color.BLUE, "Color Blue"),
        ListItem(Color.CYAN, "Color Cyan"),
        ListItem(Color.DKGRAY, "Color Dark Gray"),
        ListItem(Color.MAGENTA, "Color Magnetta"),
        ListItem(Color.RED, "Color Red"),
        ListItem(Color.LTGRAY, "Color Light Gray"),
        ListItem(Color.YELLOW, "Color Yellow"),
        ListItem(Color.GREEN, "Color Green"),
        ListItem(Color.BLUE, "Color Blue"),
        ListItem(Color.CYAN, "Color Cyan"),
        ListItem(Color.DKGRAY, "Color Dark Gray"),
        ListItem(Color.MAGENTA, "Color Magnetta"),
        ListItem(Color.RED, "Color Red"),
        ListItem(Color.LTGRAY, "Color Light Gray"),
        ListItem(Color.YELLOW, "Color Yellow"),
        ListItem(Color.GREEN, "Color Green"),
        ListItem(Color.BLUE, "Color Blue"),
        ListItem(Color.CYAN, "Color Cyan"),
        ListItem(Color.DKGRAY, "Color Dark Gray"),
        ListItem(Color.MAGENTA, "Color Magnetta"),
        ListItem(Color.RED, "Color Red"),
        ListItem(Color.LTGRAY, "Color Light Gray"),
        ListItem(Color.YELLOW, "Color Yellow"),
        ListItem(Color.GREEN, "Color Green"),
        ListItem(Color.BLUE, "Color Blue"),
        ListItem(Color.CYAN, "Color Cyan"),
        ListItem(Color.DKGRAY, "Color Dark Gray"),
        ListItem(Color.MAGENTA, "Color Magnetta"),
        ListItem(Color.RED, "Color Red"),
        ListItem(Color.LTGRAY, "Color Light Gray"),
        ListItem(Color.YELLOW, "Color Yellow"),
        ListItem(Color.GREEN, "Color Green")
    ).shuffled()
}
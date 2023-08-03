package com.alamazing.jetpackcompose.data

import com.alamazing.jetpackcompose.R

object CoffeeData{
    val list = listOf(
        Coffee(name = "Espresso Romano",
            price = "$5.70",
            image = R.drawable.espresso_romano
        ),
        Coffee(name = "Lungo",
            price = "$6.00",
            image = R.drawable.lungo
        ),
        Coffee(name = "Correto",
            price = "$5.00",
            image = R.drawable.correto
        ),
        Coffee(name = "Americano",
            price = "$6.00",
            image = R.drawable.americano
        )
    )
}

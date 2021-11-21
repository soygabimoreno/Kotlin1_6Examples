package soy.gabimoreno.kotlin160examples

sealed class Sport {
    object Basket : Sport()
    object Tennis : Sport()
    object Volley : Sport()
}

fun example(sport: Sport) {
    when (sport) {
        Sport.Basket -> TODO()
        Sport.Tennis -> TODO()
    }
}

fun exampleWithCustomExhaustive(sport: Sport) {
    when (sport) {
        Sport.Basket -> TODO()
        Sport.Tennis -> TODO()
        Sport.Volley -> TODO()
    }.exhaustive
}

val Any?.exhaustive
    get() = Unit

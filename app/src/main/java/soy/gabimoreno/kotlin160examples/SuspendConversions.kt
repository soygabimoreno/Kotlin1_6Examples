package soy.gabimoreno.kotlin160examples

fun action() = Result.success("OK")

fun <T> handle(handler: suspend () -> Result<T>) {
    // Whatever
}

fun suspendConversion() {
    handle(::action)
}

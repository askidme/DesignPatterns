package pattern.adapter

class LoggerImpl: Logger {
    override fun debug(str: String) = println("DEBUG: $str")

    override fun trace(str: String) = println("TRACE: $str")

    override  fun log(str: String) = println("LOG: $str")
}
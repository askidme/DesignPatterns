package pattern.adapter

interface Logger {

    fun debug(str: String)

    fun trace(str: String)

    fun log(str: String)

    companion object {
        fun create(): ApacheCommonsLogAdapter = ApacheCommonsLogAdapter()
    }
}
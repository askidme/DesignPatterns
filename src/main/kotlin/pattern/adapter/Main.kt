package pattern.adapter

fun main(){
    val logger = Logger.create()

    logger.debug("Some debug message");
    logger.trace("Some trace message");
    logger.log("Some log message");
}
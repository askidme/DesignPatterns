package pattern.adapter


import org.apache.commons.logging.Log
import org.apache.commons.logging.impl.Slf4jLogFactory

class ApacheCommonsLogAdapter : Logger {
    private val logger: Log = Slf4jLogFactory.getLog(ApacheCommonsLogAdapter::class.java)

    override fun debug(str: String) = logger.debug(str)

    override fun trace(str: String) = logger.trace(str)

    override fun log(str: String) = logger.info(str)
}
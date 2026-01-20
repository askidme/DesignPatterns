package pattern.proxy

interface BusinessObject {

    fun sayHi()
    companion object{
        fun create() = BusinessObjectImplementation()
    }

}
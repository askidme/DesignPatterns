package pattern.proxy

class BusinessObjectProxy(private val target: BusinessObject): BusinessObject {
    override fun sayHi() {
        println("About to call real...")
        target.sayHi()
        println("Completed call to real...")
    }
}
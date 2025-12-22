package composite

import com.codergm.composite.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CompositeTest {

    @Test
    fun testConstant() {
        val testValue = 3.0
        val e: Expression = Constant(testValue)
        assertEquals(testValue, e.getValue(), 0.0)
    }

    @Test
    fun testAdder() {
        val testValueA = 2.0
        val testValueB = 4.0
        val left: Expression = Constant(testValueA)
        val right: Expression = Constant(testValueB)
        val e: Expression = Adder(left, right)
        assertEquals(testValueA + testValueB, e.getValue(), 0.0)
    }

    @Test
    fun testSubtracter() {
        val testValueA = 2.0
        val testValueB = 4.0
        val left: Expression = Constant(testValueA)
        val right: Expression = Constant(testValueB)
        val e: Expression = Subtracter(left, right)
        assertEquals(testValueA - testValueB, e.getValue(), 0.0)
    }

    @Test
    fun testDivider() {
        val testValueA = 8.0
        val testValueB = 4.0
        val left: Expression = Constant(testValueA)
        val right: Expression = Constant(testValueB)
        val e: Expression = Divider(left, right)
        assertEquals(testValueA / testValueB, e.getValue(), 0.0)
    }

    @Test
    fun testMultiplier() {
        val testValueA = 2.0
        val testValueB = 4.0
        val left: Expression = Constant(testValueA)
        val right: Expression = Constant(testValueB)
        val e: Expression = Multiplier(left, right)
        assertEquals(testValueA * testValueB, e.getValue(), 0.0)
    }

    @Test
    fun testComplexExpression() {

        val e: Expression = Divider(
            Multiplier(
                Adder(Constant(3.0), Constant(5.0)),
                Constant(100.0),
            ),
            Adder(Constant(2.0), Constant(64.0)),
        )

        assertEquals(12.1212121212, e.getValue(), 0.00001)
    }
}
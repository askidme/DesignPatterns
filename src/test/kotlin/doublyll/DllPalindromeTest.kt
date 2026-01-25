package doublyll

import algo.doublyll.DoublyLinkedList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DllPalindromeTest {

    @Test
    fun `empty DLL is  a palindrome`() {
        val dll = DoublyLinkedList(10)
        dll.removeFirst()

        assertThat(dll?.checkPalindrome()).isTrue()
    }

    @Test
    fun `DLL with one is a palindrome`() {
        val dll = DoublyLinkedList(10)
        assertThat(dll?.checkPalindrome()).isTrue()
    }

    @Test
    fun `DLL with even number elements palindrome is truthy`() {
        val dll = DoublyLinkedList(10)
        dll.append(20)
        dll.append(30)
        dll.append(30)
        dll.append(20)
        dll.append(10)

        assertThat(dll?.checkPalindrome()).isTrue()
    }

    @Test
    fun `DLL with odd number elements palindrome is truthy`() {
        val dll = DoublyLinkedList(10)
        dll.append(20)
        dll.append(30)
        dll.append(40)
        dll.append(30)
        dll.append(20)
        dll.append(10)

        assertThat(dll?.checkPalindrome()).isTrue()
    }

    @Test
    fun `DLL not palindrome is false`() {
        val dll = DoublyLinkedList(10)
        dll.append(20)
        dll.append(30)
        dll.append(40)
        dll.append(30)
        dll.append(40)
        dll.append(10)

        assertThat(dll?.checkPalindrome()).isFalse()
    }
}
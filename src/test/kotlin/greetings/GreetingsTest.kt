package greetings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class GreetingsTest {
    @Nested
    @DisplayName("Say hello should")
    inner class SayHello {
        @Test
        fun `greet to someone when 'to' is provided`() {
            assertThat(Greetings("John Doe").sayHello()).isEqualTo("Hello, John Doe!")
        }

        @Test
        fun `greet to world when 'to' is not provided`() {
            assertThat(Greetings().sayHello()).isEqualTo("Hello, world!")
        }
    }
}
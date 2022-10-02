package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void containsNumberTest() {
        // given
        String numStr = "1,2";
        // when
        String[] arrayStr = numStr.split(",");
        // then
        assertThat(arrayStr).contains("1");
        assertThat(arrayStr).containsExactly("1", "2");
    }

    @Test
    void subStringTest() {
        // given
        String numStr = "(1,2)";
        // when
        String numSubstring = numStr.substring(1, 4);
        // then
        assertThat(numSubstring).contains("1", ",", "2");
    }

    @Test
    @DisplayName("find a character in which a specific index pointing")
    public void findAlphabetTest() {
        //given
        String alphabets = "abc";
        //when
        char character = alphabets.charAt(2);
        //then
        assertThat(character).isEqualTo('c');
    }

    @Test
    public void indexErrorTest() {
        //given
        String alphabets = "abc";
        //then
        assertThatThrownBy(() -> {
            alphabets.charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}

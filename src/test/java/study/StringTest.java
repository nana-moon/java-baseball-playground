package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    @Test
    void split(){
        String[] values = "1,2".split(",");
        assertThat(values).containsExactly("1","2");
    }
    @Test
    void substring(){
        String input = "(1,2)";
        String result = input.substring(1, input.length()-1);
        assertThat(result).isEqualTo("1,2");
    }
}

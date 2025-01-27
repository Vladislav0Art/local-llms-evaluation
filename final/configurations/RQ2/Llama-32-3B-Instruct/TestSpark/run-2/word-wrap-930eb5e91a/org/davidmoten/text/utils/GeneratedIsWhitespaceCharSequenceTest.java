package org.davidmoten.text.utils;

import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

public class GeneratedIsWhitespaceCharSequenceTest {

    @Test
    public void isWhitespaceCharSequenceTest() {
        char[] chars = {'\t', ' ', '\r'};
        for (char c : chars) {
            assertTrue(WordWrap.isWhitespace(new StringBuilder(String.valueOf(c))));
            assertFalse(WordWrap.isWhitespace(new StringBuilder(String.valueOf('!'))));
        }
    }

}
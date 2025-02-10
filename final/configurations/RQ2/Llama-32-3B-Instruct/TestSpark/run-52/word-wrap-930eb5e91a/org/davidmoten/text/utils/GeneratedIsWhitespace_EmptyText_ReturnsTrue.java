package org.davidmoten.text.utils;

public class GeneratedIsWhitespace_EmptyText_ReturnsTrue {

    @Test
    public void isWhitespace_EmptyText_ReturnsTrue() {
        Preconditions.assertTrue(WordWrap.isWhitespace(""));
    }

}
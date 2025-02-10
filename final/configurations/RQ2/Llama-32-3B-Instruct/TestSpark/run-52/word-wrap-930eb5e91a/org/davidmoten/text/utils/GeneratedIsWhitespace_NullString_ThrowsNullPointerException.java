package org.davidmoten.text.utils;

public class GeneratedIsWhitespace_NullString_ThrowsNullPointerException {

    @Test
    public void isWhitespace_NullString_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> WordWrap.isWhitespace(null));
    }

}
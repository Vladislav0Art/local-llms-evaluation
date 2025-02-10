package org.davidmoten.text.utils;

public class GeneratedFromUtf8_NullInputStream_ThrowsNullPointerException {

    @Test
    public void fromUtf8_NullInputStream_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> new WordWrap.Builder().fromUtf8(null));
    }

}
package org.davidmoten.text.utils;

public class GeneratedFromReader_NullReader_ThrowsNullPointerException {

    @Test
    public void fromReader_NullReader_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> new WordWrap.Builder().from(new Object[0]));
    }

}
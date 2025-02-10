package org.davidmoten.text.utils;

public class GeneratedLeftTrim_NullStringBuilder_ThrowsNullPointerException {

    @Test
    public void leftTrim_NullStringBuilder_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> WordWrap.leftTrim(null));
    }

}
package org.davidmoten.text.utils;

public class GeneratedRightTrim_NullString_ThrowsNullPointerException {

    @Test
    public void rightTrim_NullString_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> WordWrap.rightTrim(null));
    }

}
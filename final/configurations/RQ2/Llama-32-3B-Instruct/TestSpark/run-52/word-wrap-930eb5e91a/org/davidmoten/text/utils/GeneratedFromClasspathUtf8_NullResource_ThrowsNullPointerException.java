package org.davidmoten.text.utils;

public class GeneratedFromClasspathUtf8_NullResource_ThrowsNullPointerException {

    @Test
    public void fromClasspathUtf8_NullResource_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> new WordWrap.Builder().fromClasspathUtf8(null));
    }

}
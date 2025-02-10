package org.davidmoten.text.utils;

public class GeneratedWordWrap_NullString_ThrowsNullPointerException {

    @Test
    public void wordWrap_NullString_ThrowsNullPointerException() {
        Preconditions.assertThrows(NullPointerException.class, () -> WordWrap.wordWrap(null, null, "\n", 10L,
                s -> s.length(), new HashSet<>(), false, true));
    }

}
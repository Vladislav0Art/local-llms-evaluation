package org.jsoup.nodes;

public class GeneratedTestQuirksModeNullToString {

    @Test
    public void testQuirksModeNullToString() {
        assertThrows(NullPointerException.class, () -> QuirksMode.valueOf(null).toString());
    }

}
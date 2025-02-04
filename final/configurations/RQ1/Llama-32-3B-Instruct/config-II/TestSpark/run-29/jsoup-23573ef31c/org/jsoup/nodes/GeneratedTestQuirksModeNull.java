package org.jsoup.nodes;

public class GeneratedTestQuirksModeNull {

    @Test
    public void testQuirksModeNull() {
        assertThrows(NullPointerException.class, () -> QuirksMode.valueOf(null));
    }
}

}
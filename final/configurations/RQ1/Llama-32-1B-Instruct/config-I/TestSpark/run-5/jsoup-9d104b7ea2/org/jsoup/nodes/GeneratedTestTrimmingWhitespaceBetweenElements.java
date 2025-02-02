package org.jsoup.nodes;

public class GeneratedTestTrimmingWhitespaceBetweenElements {

    @Test
    public void testTrimmingWhitespaceBetweenElements() {
        StringBuilder sb = new StringBuilder("  Hello <br>World!");
        assertTrue(lastCharIsWhitespace(sb.toString()));
    }

}
package org.jsoup.nodes;

public class GeneratedTestTrimmingWhitespaceBetweenSiblingNodes {

    @Test
    public void testTrimmingWhitespaceBetweenSiblingNodes() {
        String siblingNodes = "<p><br>  Hello <b>World!</b></p>";
        assertTrue(lastCharIsWhitespace(siblingNodes));
    }

}
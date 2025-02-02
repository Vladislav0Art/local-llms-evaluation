package org.jsoup.nodes;

public class GeneratedTestTrimmingWhitespaceBetweenElementsAndSiblingNodes {

    @Test
    public void testTrimmingWhitespaceBetweenElementsAndSiblingNodes() {
        StringBuilder sb = new StringBuilder("<p><b>Hello</b> <i>World!</i></p>");
        assertTrue(lastCharIsWhitespace(sb.toString()));
    }

}